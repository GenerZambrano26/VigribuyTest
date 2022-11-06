/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.UUID;


/**
 *
 * @author ADMIN
 */
public class CodigoIMA {
    
    
     private static String Codigo;

    public CodigoIMA() {
    }
    
    
    
      public static String Codigo () {
    
    UUID uuid = UUID.randomUUID();
    //fecha = sdf.format(calendar.getTime());
    Codigo = "GE" + uuid.toString();
    return Codigo;
    
    
    }
    
      
//          public static void main(String[] args) {
//   
//        
//        
//               UUID uuid = UUID.randomUUID();
//        System.out.println("GE" + uuid.toString());
//        
//        
//        
//        
//    }
    
    
    
    
    
}
