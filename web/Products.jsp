

<%-- 
    Document   : Products
    Created on : 23-oct-2022, 17:28:20
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">

    <!--====== Title ======-->
    <title>Buscar productos</title>

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

    <!--====== Style CSS Forms ======-->
    <!--<link href="assets/cssform2/all.min.css" rel="stylesheet" type="text/css">-->
    <!--====== Style CSS Forms ======-->
    <link rel="stylesheet" href="assets/css/cssform/produ-side-bar.css">

    <!--====== Style JS Products ======-->
    
    <link rel="stylesheet" href="assets/css/cssform/sb-admin.min.js">

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
                            <div style="height:63px">

                            </div>
                        </a>
                        
                         <div class="navbar-btn d-none d-sm-inline-block">
                            <ul>
                                <li><a class="nav-link" href="Index.jsp"><i class="fas fa-cart">(<label style="color:orange">${contador}</label>)</i>Home</a></li>
                            </ul>
                        </div>
                        <button class="navbar-toggler" type="button" id="sidebarToggle" aria-controls="navbarTwo" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="toggler-icon"></span>
                            <span class="toggler-icon"></span>
                            <span class="toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarTwo">
                            <ul class="navbar-nav mr-auto">
<!--                                <li class="nav-item"><a class="nav-link" href="index.jsp"><i class="fas fa-cart-plus">(<label style="color:orange">${contador}</label>)</i>HOME</a></li>-->
                               <!-- <li class="nav-item"><a class="page-scroll" href="#services">Servicios</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#portfolio">Portfolio</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#pricing">Precios</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#about">Acerca</a></li>
                                <li class="nav-item"><a class="page-scroll" href="#contact">Contacto</a></li>-->
                            </ul>
                        </div>
                        <!--boton menu-->
                        <div class="navbar-btn d-none d-sm-inline-block">
                            <ul>
                                <li><a class="nav-link" href="ProductoController?accion=Carrito"><i class="fas fa-cart-plus">(<label style="color:orange">${contador}</label>)</i>Carrito</a></li>
                            </ul>
                        </div>
                    </nav>  <!--navbar-->
                </div>
            </div>
            <!--row-->
        </div>  <!--container-->
    </section>





    <!--====== FEATRES TWO PART START ======-->
    <div id="wrapper">




        <!-- Sidebar -->
        <ul class="sidebar navbar-nav">
            <li class="nav-item active">
                <p class="nav-link" href="">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span style="color:white">Categorias</span>
                </p>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown1" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>Valores</span>
                </a>
                <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                    <h6 class="dropdown-header">Precios</h6>
                    <div class="text-center">
                        <label>

                            <input type="checkbox" value="remember-me">
                            10000
                        </label>
                    </div><div class="text-center">
                        
                        <a href="ProductoController?accion=home">Mostrar productos</a>
                        <label>

                            <input type="checkbox" value="remember-me">
                            20000
                        </label>
                    </div>
                    <div class="checkbox">
                        <div class="text-center">
                            <label>

                                <input type="checkbox" value="remember-me">
                                30000
                            </label>
                        </div>
                    </div>


                </div>
            </li>


            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>Ciudades</span>
                </a>
                <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                    <h6 class="dropdown-header">Ciudad</h6>
                    <div class="checkbox">
                        <div class="text-center">
                            <label>
                                <input type="checkbox" value="remember-me">
                                Barranquilla
                            </label>
                        </div>

                    </div>

                    <div class="checkbox">
                        <div class="text-center">
                            <label>
                                <input type="checkbox" value="remember-me">
                                Bogota
                            </label>
                        </div>

                    </div>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>Marcas</span>
                </a>
                <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                    <h6 class="dropdown-header">Marcas</h6>
                    <div class="checkbox">
                        <div class="text-center">
                            <label>
                                <input type="checkbox" value="remember-me">
                                Colechera
                            </label>
                        </div>
                    </div>
                    <div class="checkbox">
                        <div class="text-center">
                            <label>
                                <input type="checkbox" value="remember-me">
                                Colanta
                            </label>
                        </div>
                    </div>
                </div>
            </li>

            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown3" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>Referencias</span>
                </a>
                <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                    <h6 class="dropdown-header">Referencias</h6>
                    <div class="text-center">
                        <label>
                            <input type="checkbox" value="remember-me">
                            Slim
                        </label>
                    </div>

                    <div class="text-center">
                        <label>
                            <input type="checkbox" value="remember-me">
                            Big
                        </label>
                    </div>
                </div>
            </li>


        </ul>



        <!--<div class="container">
        </div>-->


        <div id="content-wrapper" style="background-color:#fff">

            <div class="container-fluid" style="background-color:#cecaca">
                <section id="services" class="features-area">

                    <div class="container">
                        <div class="card">
                            <div class="card-header">   <h4 class="contact-title pb-10"><!--<i class="lni lni-envelope"></i>--> <span>Buscar productos</span> </h4></div>
                            <div class="card-body">
                                <form>
                                    <!-- Datos para crear cuenta -->







                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <div class="form-input mt-25">
                                                <input type="text" id="inputBuscar" class="form-control" placeholder="Search" required="required" autofocus="autofocus">
                                                <label for="inputBuscar"></label>
                                            </div>
                                        </div>
                                    </div>


                                    <!--<div class="form-group">
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="remember-me">
                                                Remember Password
                                            </label>
                                        </div>
                                    </div>-->
                                    <div class="text-center">
                                        <div class="form-input light-rounded-buttons mt-30">
                                            <button class="main-btn light-rounded-two" href="ProductoController?accion=home" >Buscar</button>
                                        </div> <!-- form input -->
                                    </div>

                                </form>
                                <div class="text-center">
                                    <!--<a class="d-block small mt-3" href="Createaccount.html">Register an Account</a>
                                    <a class="d-block small" href="Forgot-password.html">Forgot Password?</a>-->
                                </div>
                            </div>
                        </div>

                    </div>







                    <div class="row justify-content-center">
                        <!--<div class="col-lg-6 col-md-10">
                        <div class="section-title text-center pb-10">
                            <h3 class="title">Productos</h3>
                            <p class="text">Encuentre todos los productos del campo colombiano que necesite</p>
                        </div>-->
                        <!-- row -->
                        <!--</div>-->

                    </div> <!-- row -->
                    <div class="row justify-content-center">

                        <!-- juego de imagenes 1-->
                     
      
                            <c:forEach items="${productos}" var="p"> 
                                <div class="col-lg-4 col-md-7 col-sm-9">
                            <div class="single-features mt-40">
                                <div class="features-title-icon d-flex justify-content-between">
                                    <h4 class="features-title"><a href="#"></a>${p.getNombre()}</h4>
                                    <div class="features-icon">
                                        <!--<i class="lni lni-brush"></i>
                                        <img class="shape" src="assets/images/f-shape-1.svg" alt="Shape">-->
                                    </div>


                                </div>
                                <div class="pricing-icon text-center">
                                    <img src="ControladorIMG?id=${p.getId()}" alt="Agua" height="200">
                                </div>
                                <div class="features-content">
                                    <p class="text" >${p.getDescripcion()}</p>
                                    <p class="text"> $ ${p.getPrecioventa()}0 </p>
                                    <a class="btn btn-danger" href="ProductoController?accion=AgregarCarrito&id=${p.getId()}" >Agregar </a>
                                    <a class="features-btn" href="ProductoController?accion=Comprar&id=${p.getId()}">COMPRAR</a>
                                </div>
                            </div> <!-- single features -->
                        </div>  
                        
                        </c:forEach>
                        
                  
                        
                      <!--  <div class="col-lg-4 col-md-7 col-sm-9">
                            <div class="single-features mt-40">
                                <div class="features-title-icon d-flex justify-content-between">
                                    <h4 class="features-title"><a href="#">Hortalizas</a></h4>
                                    <div class="features-icon">
                                       
                                    </div>
                                </div>
                                <div class="pricing-icon text-center">
                                    <img src="assets/images/product/hort.jpg" alt="Agua">
                                </div>
                                <div class="features-content">
                                    <p class="text">Hortalizas a los mejores precios</p>
                                    <a class="features-btn" href="#">COMPRAR</a>
                                </div>
                            </div> 
                        </div> -->
                       


                      








                        <!--Termina el contenido -->

                    </div>
                </section>


            </div>
        </div>


    </div> <!-- container -->
    <!--====== FEATRES TWO PART ENDS ======-->
    <!--====== FOOTER PART START ======-->

    <section class="footer-area footer-dark">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <div class="footer-logo text-center">
                        <!--<a class="mt-30" href="index.html"><img src="assets/images/logo.svg" alt="Logo"></a>-->
                    </div> <!-- footer logo -->
                    <ul class="social text-center mt-60">
                        <li><a href="https://facebook.com/"><i class="lni lni-facebook-filled"></i></a></li>
                        <li><a href="https://twitter.com/"><i class="lni lni-twitter-original"></i></a></li>
                        <li><a href="https://instagram.com/"><i class="lni lni-instagram-original"></i></a></li>
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
            </div>
        </div>

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



    <!-- Custom scripts for all pages pagina nueva-->
    <script src="assets/cssform2/sb-admin.min.js"></script>

</body>

</html>
