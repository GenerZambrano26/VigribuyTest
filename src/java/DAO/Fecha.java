/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Fecha {
    
    public static Calendar calendar = Calendar.getInstance();
    private static String fecha;
   // private static Date fechaDT;
    
    
    
    public Fecha(){
    
    }
    
    public static String Fecha () {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    fecha = sdf.format(calendar.getTime());
    
    return fecha;
    
    
    }
    
    
     public static String FechaBD () {
    
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
    fecha = sdf.format(calendar.getTime());
    
    return fecha;
    
    
    }
     
//       public static Date FechaDT () {
//    
//    //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
//    fechaDT = calendar.getTime();
//    
//    return fechaDT;
//    
//    
//    }
     
     
     
     
     
    
    
//              public static void main(String[] args) {
//   
//        
//        
//        
//               
//        System.out.println(Fecha.FechaDT());
//        
//        
//        
//        
//    }
    
}
