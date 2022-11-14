/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.Conexion;
import Interfaces.Idepartamento;
import Modelo.Departamento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DepartamentoImp implements Idepartamento {
    
    Conexion con = new Conexion();

    @Override
    public String agregar(Departamento dpto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Departamento> ListarDepartamentos() {
         //To change body of generated methods, choose Tools | Templates.
    List<Departamento> listDpto = new ArrayList<> ();
        
        
        try {
            String sql ="SELECT * FROM departamentos";
                        
            PreparedStatement psta = con.Conectar().prepareStatement(sql);
             
            ResultSet rs = psta.executeQuery();
            while (rs.next()){
            
                String id = rs.getString(1);
                String codigo = rs.getString(2);
                String nombre = rs.getString(3);
                
            Departamento depart = new Departamento(id,codigo,nombre);
            listDpto.add(depart);
             System.out.print("Objetos cargados" + "" + rs.getString(1));
             
             
            }
            
        } catch (Exception e) {
            
            
            System.out.print("Error Consul Dpto" + e.getMessage());
          
        }
        return listDpto;
    
    }
    
}
