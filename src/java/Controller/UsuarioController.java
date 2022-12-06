/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Conexion;
import DAO.UsuarioCrud;
import DAOIMP.UsuarioImp;
import Modelo.Usuario;
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
@WebServlet(name = "UsuarioController", urlPatterns = {"/UsuarioController"})
public class UsuarioController extends HttpServlet {
    int r;
     int idu;
     String correo;
     Usuario u=new Usuario();
     UsuarioImp udao = new UsuarioImp();
     List<Usuario> usuarios = new ArrayList<>();
     List<Usuario> iduser = new ArrayList<>();

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
        
            /* TODO output your page here. You may use following sample code. */
           UsuarioCrud con = new UsuarioCrud() ;
            String accion = request.getParameter("accion");
           if (request.getParameter("btningresar")!=null){
               
               
               con.insert("insert into usuarios (identificacion,nombre,direccion,telefono,correo,contraseña,Estados_id,administrador_id,cuentasbancarias_id,tipodocumentos_id) values ('1234567','"+request.getParameter("inputNombres")+"' '"+request.getParameter("inputApellidos")+ "','"+ request.getParameter("inputDireccion")+"','"+ request.getParameter("inputTelefono")+"' ,'"+ request.getParameter("inputEmail")+"','"+ request.getParameter("inputPassword")+"','1','1','1','1')");
               
               response.sendRedirect("MostrarUsuario.jsp?msg=Datos Guardados!!");
               
           
           
           }
           
           
           
         String acceso = request.getParameter("accion");
        if (acceso.equals("Ingresar")) {
            String corre=request.getParameter("inputEmail");
            String contraseña=request.getParameter("inputPassword");
            u.setCorreo(corre);
            u.setContraseña(contraseña);
            r=udao.validar(u);
            if (r==1) {
                correo = request.getParameter("inputEmail");
                iduser = udao.Listarusuariocorreo(correo);
                System.out.print(correo);
            
                request.setAttribute("iduser", iduser);
                request.getSession().setAttribute("correo", corre);
                request.getSession().setAttribute("contraseña", contraseña);
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
           
           String salir = request.getParameter("accion");
        if (salir.equals("Salir")) {
            String corre=request.getParameter("0");
            String contraseña=request.getParameter("0");
            u.setCorreo(corre);
            u.setContraseña(contraseña);
            r=udao.validar(u);
            if (r==1) {
                request.getSession().setAttribute("correo", corre);
                request.getSession().setAttribute("contraseña", contraseña);
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
            } else {
                 request.getSession().setAttribute("correo", "");
                request.getSession().setAttribute("contraseña", "");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } 
           
           
            
           
            switch (accion) {

            case "ListarUsuario":
                idu = Integer.parseInt(request.getParameter("id"));
                usuarios = udao.ListarusuarioId(idu);
                
            
                request.setAttribute("usuarios", usuarios);
                request.getRequestDispatcher("ListUser.jsp").forward(request, response);
                break;
                
                
                
                 case "Login":
//                correo = request.getParameter("inputEmail");
                iduser = udao.Listarusuariocorreo(correo);
                System.out.print(correo);
            
                request.setAttribute("iduser", iduser);
                request.getRequestDispatcher("ListUser.jsp").forward(request, response);
                break;
            
               default:
//                request.setAttribute("productos", productos);
//                request.getRequestDispatcher("Products.jsp").forward(request, response);

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
