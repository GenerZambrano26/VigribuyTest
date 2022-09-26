/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Departamento;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface Idepartamento {
    
    public String agregar(Departamento dpto);
   public List<Departamento> ListarDepartamentos();
    
          
    
}
