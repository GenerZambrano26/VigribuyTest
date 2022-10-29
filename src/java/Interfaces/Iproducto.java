/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Producto;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public interface Iproducto {
    
    
    
    
    public List<Producto> ListarProductos();
    public void listarimg(int id,HttpServletResponse response);
    
}
