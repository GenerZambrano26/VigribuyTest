/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.Conexion;
import Interfaces.Itipodocumentos;

import Modelo.Tipodocumentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TipodocumentosImp implements Itipodocumentos {
    Connection cn;
    Conexion con = new Conexion();
    PreparedStatement psta;
    ResultSet rs;
    
    
    
    @Override
    public List<Tipodocumentos> Listardocu() {
     
        
          List<Tipodocumentos> listdocu = new ArrayList<>();

        try {
            String sql = "SELECT * FROM tipodocumentos";

            cn = con.Conectar();
            psta = cn.prepareStatement(sql);
            rs = psta.executeQuery();


            while (rs.next()) {
                 Tipodocumentos tipdo = new Tipodocumentos();
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
                tipdo.setId(rs.getInt(1));
                tipdo.setCodigo(rs.getString(2));
                tipdo.setDescripcion(rs.getString(3));
               

                //           Producto P = new Producto(id,nombre,descripcion,preciocompra,precioventa,urlimagen,existencias,fechavencimiento,categorias_id,estados_id,unidadesdemedidas_id,img);
                listdocu.add(tipdo);
                System.out.print("Objetos cargados tipos docu" + "" + tipdo.getDescripcion());

            }

        } catch (SQLException e) {

            System.out.print("Error Consul tipos documentos" + e.getMessage());

        }
        return listdocu;

        
        
        
        
    }
    
        
        
    
}
