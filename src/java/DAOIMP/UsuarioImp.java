/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.Conexion;
import Interfaces.Iusuario;
import Modelo.Producto;

 
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*import Modelo.Usuario;

/**
 *
 * @author ADMIN
 */
public class UsuarioImp  implements Iusuario{
   Conexion con = new Conexion();
   
    Connection cn;
   
    PreparedStatement psta;
    ResultSet rs;
   
   
    
    
     public int validar(Usuario usu) {
        int r=0;
        String sql="Select * from usuarios where correo=? and contraseña=?";
        try {
            cn = con.Conectar();
            psta = cn.prepareStatement(sql);
            psta.setString(1, usu.getCorreo());
            psta.setString(2, usu.getContraseña());
            rs=psta.executeQuery();
            while (rs.next()) {
                r=r+1;
                usu.setCorreo(rs.getString("correo"));
                usu.setContraseña(rs.getString("contraseña"));
            }
            if (r==1) {
                return 1;
            } else {
                return 0;
            }

        } catch (Exception e) {
            
             System.out.print("Error validar usuario " + e.getMessage());
            return 0;
        }
    }

    
    
    
   
   
       public List<Usuario>  ListarusuarioId(int id) {
        List<Usuario> ListUsuario = new ArrayList<>();
        Usuario u = new Usuario();

        try {
            String sql = "SELECT * FROM usuarios where id=" + id;

            cn = con.Conectar();
            psta = cn.prepareStatement(sql);
            rs = psta.executeQuery();

            while (rs.next()) {

               u.setIdentificacion(rs.getString(2));
                u.setNombre(rs.getString(3));
                u.setDireccion(rs.getString(4));
                u.setTelefono(rs.getString(5));
                u.setCorreo(rs.getString(6));
                //           Producto P = new Producto(id,nombre,descripcion,preciocompra,precioventa,urlimagen,existencias,fechavencimiento,categorias_id,estados_id,unidadesdemedidas_id,img);
                ListUsuario.add(u);

                System.out.print("Objetos cargados Usuario:" + "" + u.getCorreo());

            }

        } catch (SQLException e) {

            System.out.print("Error ListarID Usuario" + e.getMessage());

        }
        return ListUsuario;

    }
       
        public List<Usuario>  Listarusuariocorreo(String correo) {
        List<Usuario> ListUsuario = new ArrayList<>();
        Usuario u = new Usuario();

        try {
            String sql = "SELECT * FROM usuarios where correo="+"'"+correo+"'";

            cn = con.Conectar();
            psta = cn.prepareStatement(sql);
            rs = psta.executeQuery();

            while (rs.next()) {
                
                u.setId(rs.getString(1));
                u.setIdentificacion(rs.getString(2));
                u.setNombre(rs.getString(3));
                u.setDireccion(rs.getString(4));
                u.setTelefono(rs.getString(5));
                u.setCorreo(rs.getString(6));
                //           Producto P = new Producto(id,nombre,descripcion,preciocompra,precioventa,urlimagen,existencias,fechavencimiento,categorias_id,estados_id,unidadesdemedidas_id,img);
                ListUsuario.add(u);

                System.out.print("Objetos cargados Id Usuario:" + "" + u.getId());

            }

        } catch (SQLException e) {

            System.out.print("Error ListarID Usuario" + e.getMessage());

        }
        return ListUsuario;

    }
   
   
   
   
   
    @Override
    public List<Usuario> ListarUsuario() {
        
         List<Usuario> listUser = new ArrayList<> ();
        
        
        try {
            String sql ="select * from usuarios";
                        
            PreparedStatement psta = con.Conectar().prepareStatement(sql);
             
            ResultSet rs = psta.executeQuery();
            while (rs.next()){
            
                String id = rs.getString(1);
                String identificacion = rs.getString(2);
                String nombre = rs.getString(3);
                String direccion = rs.getString(4);
                String telefono = rs.getString(5);
                String correo = rs.getString(6);
                
            Usuario usuar = new Usuario(id,identificacion,nombre,direccion,telefono,correo);
            listUser.add(usuar);
             System.out.print("Usuarios Obj  " + "" + rs.getString(1));
             
             
            }
            
        } catch (SQLException ex) {
            
            
            System.out.print("Error Consul User " + ex.getMessage());
             // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
          
        }
        return listUser;
    
    }
        
        
    }

   



   
    
    
    
    
    

        
    
        
        
        
    
    
    
    
    

