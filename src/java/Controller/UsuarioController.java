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
import javax.servlet.http.HttpSession;

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
    
String msg;

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
           
           
           
//         String acceso = request.getParameter("accion");
//        if (acceso.equals("Ingresar")) {
//            String corre=request.getParameter("inputEmail");
//            String contraseña=request.getParameter("inputPassword");
//            u.setCorreo(corre);
//            u.setContraseña(contraseña);
//            r=udao.validar(u);
//            if (r==1) {
//               correo = request.getParameter("inputEmail");
//                iduser = udao.Listarusuariocorreo(correo);
//               // System.out.print(corre);
//            
//
//                request.getSession().setAttribute("correo", corre);
//                request.getSession().setAttribute("contraseña", contraseña);
//                request.setAttribute("iduser", iduser);
//                request.getRequestDispatcher("Principal.jsp").forward(request, response);
//            } else {
//                request.getRequestDispatcher("Login.jsp").forward(request, response);
//            }
//        } else {
//            request.getRequestDispatcher("Login.jsp").forward(request, response);
//        }
           
//           String salir = request.getParameter("accion");
//        if (salir.equals("Salir")) {
//            correo="";
//            
//            String corre=request.getParameter("0");
//            String contraseña=request.getParameter("0");
//            u.setCorreo(corre);
//            u.setContraseña(contraseña);
//            r=udao.validar(u);
//            if (r==1) {
//                request.getSession().setAttribute("correo", corre);
//                request.getSession().setAttribute("contraseña", contraseña);
//                request.getRequestDispatcher("Principal.jsp").forward(request, response);
//            } else {
//                 request.getSession().setAttribute("correo", "");
//                request.getSession().setAttribute("contraseña", "");
//                request.getRequestDispatcher("index.jsp").forward(request, response);
//            }
//        } else {
//            request.getRequestDispatcher("index.jsp").forward(request, response);
//        } 
           
           
            
           
            switch (accion) {
                 case "Ingresar":
                     HttpSession session = request.getSession();
                       if (accion.equals("Ingresar")) {
                String corre=request.getParameter("inputEmail");
            String contraseña=request.getParameter("inputPassword");
            u.setCorreo(corre);
            u.setContraseña(contraseña);
            r=udao.validar(u);
            if (r==1) {
               correo = request.getParameter("inputEmail");
                iduser = udao.Listarusuariocorreo(correo);
                
                int id ;
                
                id = Integer.parseInt(iduser.get(0).getId());
                
                
                session.setAttribute("idusuario",id);
               // System.out.print(corre);
            

                request.getSession().setAttribute("correo", corre);
                request.getSession().setAttribute("contraseña", contraseña);
                request.getSession().setAttribute("iduser", iduser);
                
                session.setAttribute("iduser",iduser);
                //request.getRequestDispatcher("Principal.jsp").forward(request, response);
                response.sendRedirect(request.getContextPath() + "/Principal.jsp");
            } else {
                
                msg="Usuario o contreseña incorrectos";
                request.getSession().setAttribute("lbError", msg);
                request.getRequestDispatcher("Login.jsp?Error=Usuario o contreseña incorrectos").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
                break;
                
                 case "Salir":
                     
                     
                      if (accion.equals("Salir")) {
            correo="";
            
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
                
                

            case "ListarUsuario":
                idu = Integer.parseInt(request.getParameter("id"));
                usuarios = udao.ListarusuarioId(idu);
                
            
                request.setAttribute("usuarios", usuarios);
                request.getRequestDispatcher("ListUser.jsp").forward(request, response);
                break;
                
                
                
                 case "Listar":
//                correo = request.getParameter("inputEmail");
               // iduser = udao.Listarusuariocorreo(correo);
                //System.out.print(correo);
            
                request.setAttribute("iduser", iduser);
                request.getRequestDispatcher("ListUser.jsp").forward(request, response);
                break;
                
                
              case "EditarUsuario":
//                idu = Integer.parseInt(request.getParameter("id"));
//                usuarios = udao.ListarusuarioId(idu);
//                
            
                request.setAttribute("usuarios", iduser);
                request.getRequestDispatcher("Update-Account.jsp").forward(request, response);
                break;
                  
              case "Inicial":
//                idu = Integer.parseInt(request.getParameter("id"));
//                usuarios = udao.ListarusuarioId(idu);
                String error;
                error = "Bienvenido"; 
            
                request.setAttribute("Error", error);
                request.getRequestDispatcher("Login.jsp?Error=").forward(request, response);
                break;
                
                 case "Actualizar":
                con.update("Update usuarios set nombre='" + request.getParameter("inputNombres") + "',direccion='"+ request.getParameter("inputDireccion")+"',telefono='"+ request.getParameter("inputTelefono")+"' where id= '"+ request.getParameter("txtid")+"'");
               
                 
                iduser = udao.Listarusuariocorreo(correo);
                 request.setAttribute("iduser", iduser);
                request.getRequestDispatcher("ListUser.jsp").forward(request, response);
                
               response.sendRedirect("ListUser.jsp?msg=Datos Guardados!!");
               
               
               
               
                break;
            
                     case "Cancelar":
               
                 
                iduser = udao.Listarusuariocorreo(correo);
                 request.setAttribute("iduser", iduser);
                request.getRequestDispatcher("ListUser.jsp").forward(request, response);
                
               response.sendRedirect("ListUser.jsp?msg=Datos Guardados!!");
               
               
               
               
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
