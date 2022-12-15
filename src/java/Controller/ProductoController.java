
/*
 * To change this license header, choose License Headers in Project Propert<ies.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CodigoIMA;
import DAO.Fecha;
import DAOIMP.ProductoImp;
import DAOIMP.ComprasImp;

import Modelo.Carrito;
import Modelo.Compras;
import Modelo.Pago;
import Modelo.Usuario;
import Modelo.Producto;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

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
    List<Usuario> iduser = new ArrayList<>();
    int item;
    double totalpagar = 0.00;
    int cantidad = 1;
    double descuento = 0.00;
    double subtotal = 0.00;
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
        HttpSession session = request.getSession();
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
                    totalpagar = totalpagar + ListaCarrito.get(i).getSubtotal();
                    subtotal = totalpagar;

                }
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("subtotal", subtotal);
                request.getRequestDispatcher("Cart-view.jsp").forward(request, response);
                break;
            case "AgregarCarrito":
                int pos = 0;
                cantidad = 1;
                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.ListarId(idp);

                if (ListaCarrito.size() > 0) {

                    for (int i = 0; i < ListaCarrito.size(); i++) {

                        if (idp == ListaCarrito.get(i).getId()) {
                            pos = i;

                        }
                    }

                    if (idp == ListaCarrito.get(pos).getId()) {
                        cantidad = ListaCarrito.get(pos).getCantidad() + cantidad;
                        double subtotal = ListaCarrito.get(pos).getPreciocompra() * cantidad;
                        ListaCarrito.get(pos).setCantidad(cantidad);
                        ListaCarrito.get(pos).setSubtotal(subtotal);
                    } else {

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

                    }

                } else {

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

                }

                request.setAttribute("contador", ListaCarrito.size());
                request.getRequestDispatcher("ProductoController?accion=home").forward(request, response);

//                accion="home";
//                request.getRequestDispatcher("Products.jsp").forward(request, response);
                break;

            case "Delete":

                int idproducto = Integer.parseInt(request.getParameter("idp"));
                for (int i = 0; i < ListaCarrito.size(); i++) {

                    if (ListaCarrito.get(i).getId() == idproducto) {
                        ListaCarrito.remove(i);

                    }
                }

                break;
            case "ActualizarCantidad":
                idp = Integer.parseInt(request.getParameter("idpro"));
                int cant = Integer.parseInt(request.getParameter("Cantidad"));
                for (int i = 0; i < ListaCarrito.size(); i++) {

                    if (ListaCarrito.get(i).getId() == idp) {
                        ListaCarrito.get(i).setCantidad(cant);
                        double st = ListaCarrito.get(i).getPreciocompra() * cant;
                        ListaCarrito.get(i).setSubtotal(st);

                    }

                }
                break;
            case "Carrito":

                request.setAttribute("carrito", ListaCarrito);
                request.setAttribute("descuento", descuento);
                totalpagar = 0;
                subtotal = 0;

                if (ListaCarrito.size() > 0) {

                    for (int i = 0; i < ListaCarrito.size(); i++) {

                        totalpagar = totalpagar + ListaCarrito.get(i).getSubtotal();
                        subtotal = totalpagar;
                    }
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("subtotal", subtotal);
                    request.getRequestDispatcher("Cart-view.jsp").forward(request, response);
                    request.getRequestDispatcher("ProductoController?accion=Carrito").forward(request, response);
                } else {
                    totalpagar = 0.00;
                    subtotal = 0.00;

                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("subtotal", subtotal);
                    request.getRequestDispatcher("Cart-view.jsp").forward(request, response);
                    request.getRequestDispatcher("ProductoController?accion=Carrito").forward(request, response);

                }
                break;

            case "home":

                request.setAttribute("productos", productos);
                request.getRequestDispatcher("Products.jsp").forward(request, response);

                session.getAttribute("iduser");

                break;

            case "Nuevo":

                ListaCarrito = new ArrayList();
                request.getRequestDispatcher("ProductoController?accion=home").forward(request, response);

                break;

            case "GenerarCompra":
                Usuario usuario = new Usuario();

                String iduser = session.getAttribute("idusuario").toString();

                usuario.setId(iduser);

                ComprasImp dao = new ComprasImp();

                Pago pago = new Pago();
                Compras compras = new Compras("2", "2", usuario, 1, Fecha.FechaBD(), totalpagar, 1, 1, 1, ListaCarrito);
              
                int res = dao.GenerarCompra(compras);
                if (res != 0 && totalpagar > 0) {

                    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("Error.jsp").forward(request, response);

                }
                break;

            case "Insertar":

                if (request.getParameter("btningresar") != null) {

                    pdao.insert("insert into productos (nombre,descripcion,preciocompra,precioventa,urlimagen,existencias,fechavencimiento,categorias_id,Estados_id,unidadesdemedidas_id) values ('" + request.getParameter("inputNombres") + "','" + request.getParameter("inputDescripcion") + "','" + request.getParameter("inputPreciocompra") + "','" + request.getParameter("inputPrecioventa") + "' ,'" + request.getParameter("inputUrlimagen") + "','" + request.getParameter("inputExistencia") + "','" + request.getParameter("inputFecha") + "','" + request.getParameter("inputCategoria_id") + "','" + request.getParameter("inputEstados_id") + "','" + request.getParameter("inputUnidadesdemedidas_id") + "')");

                    request.setAttribute("Mensaje", "style='display:block'");
                    response.sendRedirect("Create-Products.jsp?msg=Datos Guardados");

                }

                break;

            case "Guardar":
// Se agregan las librerias common fileup 1.4 y  common io 1.22
                ArrayList<String> lista = new ArrayList<>();
                String Cod = CodigoIMA.Codigo();
                 String ruta;
                try {
                    FileItemFactory file = new DiskFileItemFactory();
                    ServletFileUpload fileUpload = new ServletFileUpload(file);
                    List items = fileUpload.parseRequest(request);
                   
                    for (int i = 0; i < items.size(); i++) {

                        FileItem fileItem = (FileItem) items.get(i);
                        
                        
                        if (!fileItem.isFormField()) {
                            //fileItem.getName()
                            String fileName = fileItem.getName();
                            
                            File filearc = new File("");
		            String directoryName = filearc.getAbsoluteFile().toString();

                            String fe = fileName.replaceAll("^.*\\.(.*)$", "$1");
                            ruta = "C:\\Users\\GENER\\OneDrive\\Documents\\NetBeansProjects\\VigribuyTest\\build\\web\\assets\\images\\product\\" + Cod + "." + fe;
                            File f = new File("C:\\Users\\GENER\\OneDrive\\Documents\\NetBeansProjects\\VigribuyTest\\build\\web\\assets\\images\\product\\" + Cod + "." + fe);
                            fileItem.write(f);
                            p.setUrlimagen(f.getAbsolutePath());

                        } else {

                            lista.add(fileItem.getString());
                            pdao.insert("insert into productos (nombre,descripcion,preciocompra,precioventa,urlimagen,existencias,fechavencimiento,categorias_id,Estados_id,unidadesdemedidas_id) values ('" + request.getParameter("inputNombres") + "','" + request.getParameter("inputDescripcion") + "','" + request.getParameter("inputPreciocompra") + "','" + request.getParameter("inputPrecioventa") + "' ,'" + p.getUrlimagen() + "','" + request.getParameter("inputExistencia") + "','" + request.getParameter("inputFecha") + "','" + request.getParameter("inputCategoria_id") + "','" + request.getParameter("inputEstados_id") + "','" + request.getParameter("inputUnidadesdemedidas_id") + "')");

                        }

                    }

//                      for (int i = 0; i < lista.size(); i++) {
//                        System.out.print(lista.get(i));
//                    }
//                    
//                    p.setNombre(lista.get(0));
//                    p.setDescripcion(lista.get(1));
//                    float f_Val = Float.parseFloat(lista.get(2));
//                    p.setPreciocompra(f_Val);
//                    float pv_Val = Float.parseFloat(lista.get(3));
//                    p.setPrecioventa(pv_Val);
//                  
//                    //p.setUrlimagen(lista.get(4));
//                     float Exi_Val = Float.parseFloat(lista.get(5));
//                    p.setExistencia(Exi_Val);
//                    //Calendar calendar = Calendar.getInstance();
//                   // Date date = calendar.getTime();
//                    
//                   // String date_time = lista.get(6);
//                    // SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
//                    // Date date = dateParser.parse(date_time);
//                    // p.setFechavencimiento(date);
//                   
//                      int ca_id = Integer.parseInt(lista.get(7));
//                    p.setCategoria_id(ca_id);
//                    int es_id = Integer.parseInt(lista.get(8));
//                    p.setEstado_id(es_id);
//                     int un_id = Integer.parseInt(lista.get(9));
//                    p.setUnidadesdemedidas_id(un_id);
//                    
//                  
//                    
//                    pdao.Agregar(p);
                    response.sendRedirect("Create-Products.jsp?msg=Datos Guardados");
                } catch (Exception ex) {
                    response.sendRedirect("Create-Products.jsp?msg= " + ex.getMessage());

                }

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
