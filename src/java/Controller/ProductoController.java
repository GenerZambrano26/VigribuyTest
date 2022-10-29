/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOIMP.ProductoImp;
import Modelo.Carrito;
import Modelo.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "ProductoController", urlPatterns = {"/ProductoController"})
public class ProductoController extends HttpServlet {

    ProductoImp pdao = new ProductoImp();
    List<Producto> productos = new ArrayList<>();
    Producto p = new Producto();
    List<Carrito> ListaCarrito = new ArrayList<>();
    int item;
    double totalpagar = 0.0;
    int cantidad = 1;
    double descuento=00.;
    int idp;
    Carrito car;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        productos = pdao.ListarProductos();

        switch (accion) {
            
            case "Comprar":
                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.ListarId(idp);
                item = item + 1;
                car = new Carrito();
                car.setItem(item);
                car.setId(idp);
                car.setNombre(p.getNombre());
                car.setDescripcion(p.getDescripcion());
                car.setPreciocompra(p.getPrecioventa());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad * p.getPrecioventa());
                ListaCarrito.add(car);
                request.setAttribute("carrito", ListaCarrito);
                request.setAttribute("contador", ListaCarrito.size());
                 
                  for (int i = 0; i < ListaCarrito.size(); i++) {
                totalpagar = totalpagar+ListaCarrito.get(i).getSubtotal();
                     
                }
                  request.setAttribute("totalpagar", totalpagar);
                request.getRequestDispatcher("Cart-view.jsp").forward(request, response);
                break;
            case "AgregarCarrito":
                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.ListarId(idp);
                item = item + 1;
//                Carrito car = new Carrito();
                car = new Carrito();
                
                car.setItem(item);
                car.setId(idp);
                car.setNombre(p.getNombre());
                car.setDescripcion(p.getDescripcion());
                car.setPreciocompra(p.getPrecioventa());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad * p.getPrecioventa());
                ListaCarrito.add(car);
                request.setAttribute("contador", ListaCarrito.size());
                request.getRequestDispatcher("ProductoController?accion=home").forward(request, response);
               
//                accion="home";
//                request.getRequestDispatcher("Products.jsp").forward(request, response);
                break;

            case "Carrito":
               
                request.setAttribute("carrito", ListaCarrito);
                request.setAttribute("descuento", descuento);
                  
                
                for (int i = 0; i < ListaCarrito.size(); i++) {
                
                    totalpagar = totalpagar+ListaCarrito.get(i).getSubtotal();
                    
                    
                }
              request.setAttribute("totalpagar", totalpagar);
              request.getRequestDispatcher("Cart-view.jsp").forward(request, response);
                request.getRequestDispatcher("ProductoController?accion=Carrito").forward(request, response);
                
                break;

            case "home":

                request.setAttribute("productos", productos);
                request.getRequestDispatcher("Products.jsp").forward(request, response);
                break;
            default:
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("Products.jsp").forward(request, response);

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
