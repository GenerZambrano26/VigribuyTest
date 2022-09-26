/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.Conexion;
import Interfaces.Iusuario;
 
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*import Modelo.Usuario;

/**
 *
 * @author ADMIN
 */
public class UsuarioImp  implements Iusuario{
   Conexion con = new Conexion();
    @Override
    public List<Usuario> ListarUsuario() {
        
         List<Usuario> listUser = new ArrayList<> ();
        
        
        try {
            String sql ="SELECT * FROM USUARIOS";
                        
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
             System.out.print("Objetos cargados" + "" + rs.getString(1));
             
             
            }
            
        } catch (Exception e) {
            
            
            System.out.print("Error Consul User" + e.getMessage());
          
        }
        return listUser;
    
    }
        
        
    }

   



   
    
    
    
    
    

        
    
        
        
        
    
    
    
    
    

