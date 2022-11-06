/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.Conexion;
import static DAO.Fecha.calendar;
import Interfaces.Iproducto;
import Modelo.Producto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpServletResponse;

import java.time.LocalDateTime;
/**
 *
 * @author ADMIN
 */
public class ProductoImp implements Iproducto {

    Connection cn;
    Conexion con = new Conexion();
    PreparedStatement psta;
    ResultSet rs;

    public Producto ListarId(int id) {
        Producto p = new Producto();
        try {
            String sql = "SELECT * FROM productos where id=" + id;

            cn = con.Conectar();
            psta = cn.prepareStatement(sql);
            rs = psta.executeQuery();

            while (rs.next()) {

                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setPrecioventa(rs.getFloat(5));
                p.setImg(rs.getBinaryStream(12));
                p.setExistencia(rs.getDouble(7));
                //           Producto P = new Producto(id,nombre,descripcion,preciocompra,precioventa,urlimagen,existencias,fechavencimiento,categorias_id,estados_id,unidadesdemedidas_id,img);

                System.out.print("Objetos cargados Nombre:" + "" + p.getNombre() + " Precio: " + p.getPrecioventa());

            }

        } catch (SQLException e) {

            System.out.print("Error ListarID Producto" + e.getMessage());

        }
        return p;

    }

    @Override
    public List<Producto> ListarProductos() {
        List<Producto> listProduct = new ArrayList<>();

        try {
            String sql = "SELECT * FROM productos";

            PreparedStatement psta = con.Conectar().prepareStatement(sql);

            ResultSet rs = psta.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
//          int id = rs.getInt(1);
//                String nombre = rs.getString(2);
//                String descripcion = rs.getString(3);
//                float preciocompra = rs.getFloat(4);
//                float precioventa = rs.getFloat(5);
//                String urlimagen = rs.getString(6);
//                Double existencias = rs.getDouble(7);
//                Date fechavencimiento = rs.getDate(8);
//                int categorias_id = rs.getInt(9);
//                int estados_id = rs.getInt(10);
//                int unidadesdemedidas_id = rs.getInt(11);
//                InputStream img = rs.getBinaryStream(12);
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setPrecioventa(rs.getFloat(5));
                p.setImg(rs.getBinaryStream(12));

                //           Producto P = new Producto(id,nombre,descripcion,preciocompra,precioventa,urlimagen,existencias,fechavencimiento,categorias_id,estados_id,unidadesdemedidas_id,img);
                listProduct.add(p);
                System.out.print("Objetos cargados" + "" + p.getNombre());

            }

        } catch (SQLException e) {

            System.out.print("Error Consul Productos" + e.getMessage());

        }
        return listProduct;

    }

    @Override
    public void listarimg(int id, HttpServletResponse response) {

        String sql = "select * from productos where id=" + id;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            outputStream = response.getOutputStream();

            psta = con.Conectar().prepareStatement(sql);
            rs = psta.executeQuery();

            if (rs.next()) {
                inputStream = rs.getBinaryStream("img");

            }

            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            int i = 0;

            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);

            }

        } catch (Exception e) {

            System.out.print("Error IMG Carga ListarIMG " + e.getMessage());
        }

    }

    @Override
    public void insert(String insSql) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        final String LENGUAJE = "ECMAScript";
        ScriptEngine engine = scriptEngineManager.getEngineByName(LENGUAJE);
       
           
        try {

            if (engine == null) {

                System.out.println("No se encontro el motror Java");
                return;

            }

            try {

                psta = con.Conectar().prepareStatement(insSql);
                psta.executeUpdate();

                engine.eval("swal('Su producto fue agregado con exito');");

            } catch (ScriptException ex) {
                Logger.getLogger(ProductoImp.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.print("Insercion exitosa");

        } catch (SQLException e) {

            System.out.print("Error Insercion Producto " + e.getMessage());
            try {
                engine.eval("swal('Su producto no fue agregado');");
            } catch (ScriptException ex) {
                Logger.getLogger(ProductoImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public int Agregar(Producto p) {
        
        
     
        
             
        
          try {
                 String sql ="insert into producto(nombre,descripcion,preciocompra,precioventa,urlimagen,existencias,fechavencimiento,categorias_id,Estados_id,unidadesdemedidas_id) values (?,?,?,?,?,?,?,?)";
                cn= con.Conectar();
                psta = cn.prepareStatement(sql);
                
                psta.setString(1,p.getNombre());
                psta.setString(2,p.getDescripcion());
                psta.setDouble(3,p.getPreciocompra());
                psta.setDouble(4,p.getPrecioventa());
                psta.setString(5,p.getUrlimagen());
                psta.setDouble(6,p.getExistencia());
                psta.setDate(7, (java.sql.Date) p.getFechavencimiento());
                psta.setInt(8,p.getCategoria_id());
                psta.setInt(9,p.getEstado_id());
                psta.setInt(10,p.getUnidadesdemedidas_id());
                
                
                
                psta.executeUpdate();

               System.out.print("Insercion Producto Exitosa");
            } catch (Exception ex) {
                  System.out.print("Error Insercion Producto " + ex.getMessage());
            }
        
        
        return 0;

        
        
        
    }
    
    
    
    

}
