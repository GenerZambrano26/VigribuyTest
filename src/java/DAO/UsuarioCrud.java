/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class UsuarioCrud {
    /*  Connection con = null;*/
    PreparedStatement ps =null;
    ResultSet rs = null;
    
    Conexion con = new Conexion();
    
    
     
    public void insert(String insSQL){
        
        try{
        
        ps = con.Conectar().prepareStatement(insSQL);
        ps.executeUpdate();
        
        
         System.out.print("Insercion exitosa");
                
        }catch(SQLException e){
        
            System.out.print("Error Insercion usuario " + e.getMessage());
        
        }
        
    }
    
    
        public void update(String insSQL){
        
        try{
        
        ps = con.Conectar().prepareStatement(insSQL);
        ps.executeUpdate();
        
        
         System.out.print("Insercion exitosa");
                
        }catch(SQLException e){
        
            System.out.print("Error Insercion usuario " + e.getMessage());
        
        }
        
    }

}
