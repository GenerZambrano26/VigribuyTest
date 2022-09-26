/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class Conexion {
    
     Connection con = null;
    PreparedStatement ps =null;
    ResultSet rs = null;
    
    public Connection Conectar(){
    
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
   
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carritoonline_db?user=root&password=");
        System.out.print("Conexion Exitosa");
        
            
        } catch(Exception ex){
            
            System.out.print("Error" + ex.getMessage());
        }
            
  
        return con;
        
    
    }
    
    
    
//         public static void main(String[] args) {
//        // TODO code application logic here
//        
//        //Si es statico no lo instancio solo lo llamo
//        
//        
//               Conexion c = new Conexion();
//               
//        System.out.print(""+ c.Conectar());
//        
//        
//        
//        
//    }

}
