/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;

/**
 *
 * @author GENER
 */
public class Prue {
    
    
    
    
    
       public static void main(String[] args) {
        // TODO code application logic here
        
        //Si es statico no lo instancio solo lo llamo
        
        
//               Conexion c = new Conexion();
//               
//        System.out.print(""+ c.Conectar());
        
        
        	File file = new File("");
		String directoryName = file.getAbsoluteFile().toString();
		System.out.println("Current Working Directory is = " +directoryName + "\\web\\assets\\images\\product\\");
        
    }
    
}
