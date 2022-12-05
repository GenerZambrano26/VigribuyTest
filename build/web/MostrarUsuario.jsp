<%-- 
    Document   : MostrarUsuario
    Created on : 24-sep-2022, 18:34:44
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
        
          <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        
     <!--====== Favicon Icon ======-->
    <link rel="shortcut icon" href="assets/images/favicon.png" type="image/png">

    <!--====== Magnific Popup CSS ======-->
    <link rel="stylesheet" href="assets/css/magnific-popup.css">

    <!--====== Slick CSS ======-->
    <link rel="stylesheet" href="assets/css/slick.css">

    <!--====== Line Icons CSS ======-->
    <link rel="stylesheet" href="assets/css/LineIcons.css">
        
        
        <!--====== Bootstrap CSS ======-->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <!--====== Default CSS ======-->
    <link rel="stylesheet" href="assets/css/default.css">

    <!--====== Style CSS ======-->
    <link rel="stylesheet" href="assets/css/style.css">

    
    <!-- Custom styles formularios this template-->
    <link href="assets/css/cssform/fomularios.css" rel="stylesheet">
    </head>
    <body>
        
       <!--Color verde en el header de create account-->
    <section class="navbar-area" style="background-color: #9ACD32">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <nav class="navbar navbar-expand-lg">

                        <a class="navbar-brand" href="#">
                            <img src="assets/images/logo.svg" alt="Logo">
                        </a>

                        <!--<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTwo" aria-controls="navbarTwo" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="toggler-icon"></span>
                            <span class="toggler-icon"></span>
                            <span class="toggler-icon"></span>
                        </button>-->
                        <!--<div class="collapse navbar-collapse sub-menu-bar" id="navbarTwo">
                            <ul class="navbar-nav m-auto">
                                <li class="nav-item active"><a class="page-scroll" href="#home">Inicio</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#services">Servicios</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#portfolio">Portfolio</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#pricing">Precios</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#about">Acerca</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#contact">Contacto</a></li>
                            </ul>
                        </div>-->
                        <!--boton menu-->
                        <!--<div class="navbar-btn d-none d-sm-inline-block">
                            <ul>
                                <li><a class="solid" href="#Createacount"></a></li>
                            </ul>
                        </div>-->
                    </nav> <!-- navbar -->
                </div>
            </div> <!-- row -->
        </div> <!-- container -->
    </section>   
        
         <section id="services" class="features-area" style="background-color: #e8eee8">
        <div class="container"> 
        
       <h1 align="center">Mostrar Usuarios</h1>
        
       <%--<table border ="1" width="900" align="center">--%>
            <!-- DataTables Example -->
        <div class="card mb-3">
          <div class="card-header">
            <i class="fas fa-table"></i>
           Tables USUARIOS</div>
          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0" style="bold:none;font-family:arial;font-size:1">
            <tr bgcolor="#9ACD32">
                <%-- colspan para que quede entoda la cabecera --%>
           
                <th colspan="6" align="center"> <label for="nomb" class="center">Mantenimiento de Usuarios</label> </th>
               
           
            
                <th> <a href="Createaccount.html">Nuevo </a> <a href="UsuarioController?accion=ListarUsuario&id=2">Listar usuario </a></th>
                               
            </tr>
            
       
          <tr  width="100" class="thead-dark">
                 <th>Id</th>
                <th>Identificacion</th>
                <th >Nombres_Completos</th>
                  <th>Direccion</th>
                  <th>Correo</th>
                    <th>Telefono</th>
                 <th>Accion</th>
                
                
            </tr>
            
            
       <jsp:useBean class="DAOIMP.UsuarioImp" id="Iduser"> </jsp:useBean>
      
       <c:forEach items="${Iduser.ListarUsuario()}" var="Usuario"> 
           
           <%--%> <c:forEach var="datos" items="${Departa}"> comment --%>
          
                <tr>
  
              <th> ${Usuario.id}</th>
              <th> ${Usuario.identificacion}</th>
              <th> ${Usuario.nombre}</th>  
              <th> ${Usuario.telefono}</th> 
              <th> ${Usuario.direccion}</th> 
              <th> ${Usuario.correo}</th> 
                <th> <a href="Actualizar.jsp?cod=${Usuario.id}"><img src="assets/images/crud/select.png"></a> <a href="Eliminar.jsp?id=${Usuario.id}"> <img src="assets/images/crud/Eliminar.jpg" width="20"> </a></th>
              <%--  </c:forEach>--%>
                
                </tr> 
      </c:forEach>  
<%-- --%>
        

        </table>
            </div>
          </div>
        </div>
        

</br>
</br>
</br>
</br>
<table  align="center" class="table table-bordered">

            <th colspan="6" align="center">  <%=request.getParameter("msg")%> </th>
            </table>
       </div>

    </section>       
            
            
            
  <section class="footer-area footer-dark">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <div class="footer-logo text-center">
                        <!--<a class="mt-30" href="index.html"><img src="assets/images/logo.svg" alt="Logo"></a>-->
                    </div> <!-- footer logo -->
                    <ul class="social text-center mt-60">
                        <li><a href="https://facebook.com/uideckHQ"><i class="lni lni-facebook-filled"></i></a></li>
                        <li><a href="https://twitter.com/uideckHQ"><i class="lni lni-twitter-original"></i></a></li>
                        <li><a href="https://instagram.com/uideckHQ"><i class="lni lni-instagram-original"></i></a></li>
                        <li><a href="#"><i class="lni lni-linkedin-original"></i></a></li>
                    </ul> <!-- social -->
                    <!--<div class="footer-support text-center">
                        <span class="number">+8801234567890</span>
                        <span class="mail">support@uideck.com</span>
                    </div>
                    <div class="copyright text-center mt-35">
                        <p class="text">Designed by <a href="https://uideck.com" rel="nofollow">UIdeck</a> and Built-with <a rel="nofollow" href="https://ayroui.com">Ayro UI</a> </p>
                    </div>-->
                    
    <!--  copyright -->
                </div>
            </div> <!-- row -->
        </div> <!-- container -->
    </section>

    <!--====== FOOTER PART ENDS ======-->
    <!--====== SLIDER PART ENDS ======-->
    <!--====== FEATRES TWO PART START ======-->
    <!--====== FOOTER PART ENDS ======-->
    <!--====== BACK TOP TOP PART START ======-->

    <a href="#" class="back-to-top"><i class="lni lni-chevron-up"></i></a>
    
        <!--====== PART ENDS ======-->
    <!--====== Jquery js ======-->
    <script src="assets/js/vendor/jquery-1.12.4.min.js"></script>
    <script src="assets/js/vendor/modernizr-3.7.1.min.js"></script>

    <!--====== Bootstrap js ======-->
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>


    <!--====== Isotope js ======-->
    <script src="assets/js/imagesloaded.pkgd.min.js"></script>
    <script src="assets/js/isotope.pkgd.min.js"></script>

    <!--====== Scrolling Nav js ======-->
    <script src="assets/js/jquery.easing.min.js"></script>
    <script src="assets/js/scrolling-nav.js"></script>

    <!--====== Main js ======-->
    <script src="assets/js/main.js"></script>
    </body>
</html>