<%-- 
    Document   : Principal2
    Created on : 25-nov-2022, 20:09:12
    Author     : ronald
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

        <title>Principal Jsp</title>
    </head>
    <body>
        <!--[if IE]>
          <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->
        <!--====== PRELOADER PART START ======-->

        <div class="preloader">
            <div class="loader">
                <div class="ytp-spinner">
                    <div class="ytp-spinner-container">
                        <div class="ytp-spinner-rotator">
                            <div class="ytp-spinner-left">
                                <div class="ytp-spinner-circle"></div>
                            </div>
                            <div class="ytp-spinner-right">
                                <div class="ytp-spinner-circle"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!--====== PRELOADER PART ENDS ======-->
        <!--====== NAVBAR TWO PART START ======-->

        <section class="navbar-area">
            <div class="container " style="background-color: #9ACD32">
                <div class="row">
                    <div class="col-lg-12">
                        <nav class="navbar navbar-expand-lg">

                            <a class="navbar-brand" href="#">
                              <img src="assets/images/Vegrilogo.png" width="130px" height="80px" alt="Logo">
                            </a>

                            <button  class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTwo" aria-controls="navbarTwo" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="toggler-icon"></span>
                                <span class="toggler-icon"></span>
                                <span class="toggler-icon"></span>
                            </button>

                            <div class="collapse navbar-collapse sub-menu-bar" id="navbarTwo">
                                <ul class="navbar-nav m-auto">
                                    <!--<li class="nav-item active"><a class="page-scroll" href="index.jsp">Inicio</a></li>-->
                                    <li class="nav-item"><a class="page-scroll" href="#services">Productos</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="ProductoController?accion=home">Buscar productos</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="Create-Products.jsp">Publicar productos</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="#about">Acerca</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="#contact">Contacto</a></li>
                                </ul>
                            </div>


                            <div class="dropdown">
                                <a style="color: white" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Mi Cuenta</a>
                                <div class="dropdown-menu text-center">
                                    <div>
                                        <a>${correo}</a>
                                        <!--<a>Nombre</a><br>
                                        <a>Telefono</a><br>
                                        <a>Direccion</a><br>
                                        <div class="dropdown-divider"></div><br>-->
                                        <div>
                                            <a href="UsuarioController?accion=Listar" class="nav-link">Datos Personales</a>
                                            <a href="UsuarioController?accion=Salir" class="nav-link">Salir</a> 
                                        </div>

                                    </div>
                                </div> 

                                <!--solo se muestra si no ha iniciado-->
                                <!--<li><a class="solid" href="Login.jsp">Ingresar</a></li>-->
                                <!--si inicia sesion se debe deshabilitar el boton y mostrar nombre y que sea un boton que lo lleve 
                                a la pagina de my account
                                <li><a class="solid" href="View/Account.jsp">Ronald</a></li>-->
                            </div>
                        </nav> <!-- navbar -->
                    </div>
                </div> <!-- row -->
            </div> <!-- container -->
        </section>

        <!--====== NAVBAR TWO PART ENDS ======-->
        <!--====== SLIDER PART START ======-->

        <!--<section id="home" class="slider_area">
            <div id="carouselThree" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselThree" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselThree" data-slide-to="1"></li>
                    <li data-target="#carouselThree" data-slide-to="2"></li>
                </ol>



                <a class="carousel-control-prev" href="#carouselThree" role="button" data-slide="prev">
                    <i class="lni lni-arrow-left"></i>
                </a>
                <a class="carousel-control-next" href="#carouselThree" role="button" data-slide="next">
                    <i class="lni lni-arrow-right"></i>
                </a>
            </div>
        </section>-->


        <!--====== FEATRES TWO PART START ======-->

        <section id="services" class="features-area">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-6 col-md-10">
                        
                        <c:forEach items="${iduser}" var="User"> 
                        
                        <h5 class="text-center">Bienvenido <strong> ${User.nombre}</strong></h5><br>
                        <div class="section-title text-center pb-10">
                            <h3 class="title">Productos</h3>
                            <p class="text">Encuentre todos los productos del campo Colombiano que necesites</p>
                        </div> <!-- row -->
                   
                     </c:forEach>  
                    
                    </div>
                </div> <!-- row -->
                <div class="row justify-content-center">
                    <div class="col-lg-4 col-md-7 col-sm-9">
                        <div class="single-features mt-40">
                            <div class="features-title-icon d-flex justify-content-between">
                                <h4 class="features-title"><a href="#">Aguacate</a></h4>
                                <div class="features-icon">
                                    <!--<i class="lni lni-brush"></i>
                <img class="shape" src="assets/images/f-shape-1.svg" alt="Shape">-->
                                </div>


                            </div>
                            <div class="pricing-icon text-center">
                                <img src="assets/images/product/aguacate.jpg" alt="Agua">
                            </div>
                            <div class="features-content">
                                <p class="text">Los mejores aguacates</p>
                                <a class="features-btn" href="ProductoController?accion=home">COMPRAR</a>
                            </div>
                        </div> <!-- single features -->
                    </div>
                    <div class="col-lg-4 col-md-7 col-sm-9">
                        <div class="single-features mt-40">
                            <div class="features-title-icon d-flex justify-content-between">
                                <h4 class="features-title"><a href="#">Hortalizas</a></h4>
                                <div class="features-icon">
                                    <!--<i class="lni lni-layout"></i>
                <img class="shape" src="assets/images/f-shape-1.svg" alt="Shape">-->
                                </div>
                            </div>
                            <div class="pricing-icon text-center">
                                <img src="assets/images/product/hort.jpg" alt="Agua">
                            </div>
                            <div class="features-content">
                                <p class="text">Hortalizas a los mejores precios</p>
                                <a class="features-btn" href="ProductoController?accion=home">COMPRAR</a>
                            </div>
                        </div> <!-- single features -->
                    </div>
                    <div class="col-lg-4 col-md-7 col-sm-9">
                        <div class="single-features mt-40">
                            <div class="features-title-icon d-flex justify-content-between">
                                <h4 class="features-title"><a href="#">Verduras</a></h4>
                                <div class="features-icon">
                                    <!--<i class="lni lni-bolt"></i>
                <img class="shape" src="assets/images/f-shape-1.svg" alt="Shape">-->
                                </div>
                            </div>
                            <div class="pricing-icon text-center">
                                <img src="assets/images/product/verdu2.jpg" alt="Agua">
                            </div>
                            <div class="features-content">
                                <p class="text">Verduras frescas de todas las regiones</p>
                                <a class="features-btn" href="ProductoController?accion=home">COMPRAR</a>
                            </div>
                        </div> <!-- single features -->
                    </div>
                </div> <!-- row -->
            </div> <!-- container -->
        </section>

        <!--====== FEATRES TWO PART ENDS ======-->
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
