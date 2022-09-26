/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
                
        }catch(Exception e){
        
            System.out.print("Error Insercion usuario " + e.getMessage());
        
        }
        
    }

}
