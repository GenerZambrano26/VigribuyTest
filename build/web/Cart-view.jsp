<%-- 
    Document   : Cart-view
    Created on : 26-oct-2022, 11:17:24
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--====== Bootstrap CSS ======-->
        <!--====== Style CSS ======-->
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    </head>
    <body>


        <nav class="navbar navbar-expand navbar-dark static-top" style="background-color: #9ACD32">

            <a class="navbar-brand mr-1" href="ProductoController?accion=home">Seguir comprando</a>

            <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
                <i class="fas fa-bars"></i>
            </button>

            <!-- Navbar Search -->
            <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                    <div class="input-group-append">
                        <button class="btn btn-primary" type="button">
                            <i class="fas fa-search"></i>
                        </button>
                    </div>
                </div>
            </form>

            <!-- Navbar -->
            <ul class="navbar-nav ml-auto ml-md-0">
                <li class="nav-item dropdown no-arrow mx-1">
                    <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-bell fa-fw"></i>
                        <span class="badge badge-danger">9+</span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="alertsDropdown">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
                <li class="nav-item dropdown no-arrow mx-1">
                    <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-envelope fa-fw"></i>
                        <span class="badge badge-danger">7</span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="messagesDropdown">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
                <li class="nav-item dropdown no-arrow">
                    <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-user-circle fa-fw"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                        <a class="dropdown-item" href="#">Settings</a>
                        <a class="dropdown-item" href="#">Activity Log</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="Controlar" data-toggle="modal" data-target="#logoutModal">Logout</a>
                    </div>
                </li>
            </ul>

        </nav>
        <h1>Carrito de compra</h1>
        <div class="container mt-4">

            <div class="row">
                <div class="col-sm-8">
                    <div class="card"> 

                    <div class="card-header">
                        <i class="fas fa-table"></i>
                        Data Table</div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table  class="table table-hover" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th>ITEM</th>
                                        <th>NOMBRE</th>
                                        <th>DESCRIPCION</th>
                                        <th>PRECIO</th>
                                        <th>CANT</th>
                                        <th>SUBTOTAL</th>
                                        <th>ACCION</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="car" items="${carrito}">
                                        <tr>
                                            <td>${car.getItem()}</td>
                                            <td>${car.getNombre()}</td>
                                            <td>${car.getDescripcion()}
                                             <img src="ControladorIMG?id=${car.getId()}" width="100" height="100">
                                            </td>
                                            <td>${car.getPreciocompra()}</td>
                                            <td>
                                               <input type="hidden" id="idpro" value="${car.getId()}" class="form-control text-control" min="1" >  
                                    <input type="number" id="Cantidad" value="${car.getCantidad()}" class="form-control text-control" min="1" >
                                            </td>
                                            <td>${car.getSubtotal()}</td>

                                            <td>
                                                <input type="hidden" id="idp" value="${car.getId()}">
                                                <a href="#" id="btnDelete">Eliminar</a>
                                                <a href="#" id="btnDel">Editar</a>
                                            </td>
                                        </tr>  

                                    </c:forEach>

                                </tbody>
                            </table>


                        </div>
                    </div> 
                        
                        </div>
                </div>


                <div class="col-sm-4">

                    <div class="card">
                        <div class="card-header">

                            <h3> Generar Compra</h3>

                        </div> 
                        <div class="card-body">
                            <label>Subtotal:</label>
                            <input type="text" value="$.${subtotal}0" readonly=""class="form-control" >
                            <label>Descuento:</label>
                            <input type="text"value="$.${descuento}0" readonly=""class="form-control" >
                            <label>Total a Pagar:</label>
                            <input type="text" value="$.${totalpagar}0" readonly=""class="form-control" >
                        </div> 
                        <div class="card-footer">

                            <a href="ProductoController?accion=Carrito" class="btn btn-info btn-block"> Realizar Pago</a>















                            <a href="#" id="GenerarCompra" class="btn btn-danger btn-block">Generar Compra</a>
                        </div> 
                    </div>
                </div>

            </div>



        </div>

<!--====== Jquery js ======-->
    <script src="assets/js/vendor/jquery-1.12.4.min.js"></script>
    <script src="assets/js/vendor/modernizr-3.7.1.min.js"></script>



<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script src="assets/js/funciones.js" type="text/javascript"></script>

    </body>
</html>
