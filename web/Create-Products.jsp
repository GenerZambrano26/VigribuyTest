<%-- 
    Document   : Create-Products
    Created on : 30-oct-2022, 12:37:56
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">

    <!--====== Title ======-->
    <title>Create Products</title>

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
                           <img src="assets/images/Vegrilogo.png" width="130px" height="80px" alt="Logo">
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






    <!-- color area crear style="background-color: #9ACD32" cuenta-->
    <section id="services" class="features-area" style="background-color: #e8eee8">
        <div class="container">
            
            <div class="col-12" id="Mensaje"  style="display:block">
                
                <div class="alert alert-success" role="alert">
                    
                    <h5 class="alert-heading" ><%=request.getParameter("msg")%></h5>
                    
<!--                    <a href="index.jsp" class="btn btn-warning">Inicio</a>-->
                    
                </div>
                
                
                
            </div>
            
            

            <div class="card card-login mx-auto mt-5">
                <div class="card-header">Crear Producto</div>
                <div class="card-body">
                    <form action="ProductoController?accion=Guardar" method="post" enctype="multipart/form-data">
                        <!-- Datos para crear cuenta -->
                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="text" id="inputNombres" name="inputNombres" class="form-control" placeholder="Nombre" required="required" autofocus="autofocus">
                                    <label for="inputNombres"></label>
                                </div>
                            </div>
                        </div>


                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="text" id="inputDescripcion" name="inputDescripcion" class="form-control" placeholder="Descripcion" required="required" autofocus="autofocus">
                                    <label for="inputDescripcion"></label>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="text" id="inputPreciocompra" name="inputPreciocompra" class="form-control" placeholder="Precio Compra" required="required" autofocus="autofocus">
                                    <label for="inputPreciocompra"></label>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="text" id="inputPrecioventa" name="inputPrecioventa" class="form-control" placeholder="Precio Venta" autofocus="autofocus">
                                    <label for="inputPrecioventa"></label>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="text" id="inputExistencia" name="inputExistencia" class="form-control" placeholder="Existencia" autofocus="autofocus">
                                    <label for="inputExistencia"></label>
                                </div>
                            </div>
                        </div>






                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="Date" id="inputFecha" name="inputFecha" class="form-control" placeholder="Fecha" required="required" autofocus="autofocus">
                                    <label for="inputFecha"></label>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="Select" id="inputCategoria_id" name="inputCategoria_id" class="form-control" placeholder="Categoria" value="1" required="required" autofocus="autofocus">
                                    <label for="inputCategoria_id"></label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="select" id="inputEstados_id" name="inputEstados_id" class="form-control" placeholder="Estados" value="1" required="required" autofocus="autofocus">
                                    <label for="inputEstados_id"></label>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="select" id="inputUnidadesdemedidas_id" name="inputUnidadesdemedidas_id" class="form-control" placeholder="Unidades Medidas" value="1" required="required" autofocus="autofocus">
                                    <label for="inputUnidadesdemedidas_id"></label>
                                </div>
                            </div>
                        </div>
                        
                           <div class="form-group">
                            <div class="col-md-12">
                                <div class="form-label-group">
                                    <input type="file" id="inputUrlimagen" name="fileImagen"  placeholder="Unidades Medidas" value="1" required="required" autofocus="autofocus">
                                    <label for="inputUrlimagen"></label>
                                </div>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <div class="checkbox">
                                <label>
<!--                                    <input type="checkbox" value="remember-me">
                                    Remember Password-->
                                </label>
                            </div>
                        </div>
                        <div class="form-input light-rounded-buttons mt-30">
                            <button class="main-btn light-rounded-two" name="btningresar">Crear</button>
                        </div> <!-- form input -->
                    </form>
                    <div class="text-center">
                      <!--  <a class="d-block small mt-3" href="Createaccount.html">Register an Account</a>
                        <a class="d-block small" href="Forgot-password.html">Forgot Password?</a>-->
                </div>
            </div>
        </div>

    </section>


    <!--====== FOOTER PART START ======-->

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

    <!--====== BACK TOP TOP PART ENDS ======-->
    <!--====== PART START ======-->
    <!--
        <section class="">
            <div class="container">
                <div class="row">
                    <div class="col-lg-">

                    </div>
                </div>
            </div>
        </section>
    -->
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
