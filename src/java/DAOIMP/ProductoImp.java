/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.Conexion;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

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

}
