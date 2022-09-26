/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ADMIN
 */
public class Departamento {
    
    String id;
     String cod;
    String dpto;

    public Departamento(String id, String codigo, String nombre) {
        this.id = id;
        this.cod = codigo;
        this.dpto = nombre;
        
    }
     public Departamento() {
      
        
    }
    
     public String getid (){

    return id;
    }
    
    public void setid (String id){
    
    this.id=id;
  
        }
       
    public String getcod (){

    return cod;
    }
    
    public void setcod (String cod){
    
    this.cod=cod;
  
        }
    
    public String getdpto (){

    return dpto;
    }
    
    public void setdpto (String dpto){
    
    this.dpto=dpto;
    
  
        }

    
}
