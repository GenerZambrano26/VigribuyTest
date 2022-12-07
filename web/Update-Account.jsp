<%-- 
    Document   : Update-Account
    Created on : 06-dic-2022, 21:25:15
    Author     : GENER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="no-js" lang="en">

    <head>
        <meta charset="utf-8">

        <!--====== Title ======-->
        <title>Editar Datos</title>

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

        <!-- color area crear style="background-color: #9ACD32" cuenta-->
        <section id="services" class="features-area" style="background-color: #e8eee8">
            <div class="container">              
                 <div class="card card-login mx-auto mt-5">
              
                    <div class="card-header text-center">Actualizar Datos</div>
                    <div class="card-body">
                        <form action="UsuarioController" method="POST">
                            <!-- Datos para crear cuenta -->

                            <c:forEach items="${usuarios}" var="user">
                                
                                
                          
                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input value="${user.id}" type="text" readonly="" name="txtid" class="form-control" >
                                        <label for="inputId"></label>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input value="${user.identificacion}"  type="text" name="inputIdentificacion" class="form-control" >
                                        <label for="inputIdentificacion"></label>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input value="${user.nombre}" type="text" name="inputNombres" class="form-control" >
                                        <label for="inputNombres"></label>
                                    </div>
                                </div>
                            </div>

                            <!--<div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input value="" type="text"  name="inputApellidos" class="form-control" >
                                        <label for="inputApellidos"></label>
                                    </div>
                                </div>
                            </div>-->

                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input value="${user.direccion}" type="text" name="inputDireccion" class="form-control" >
                                        <label for="inputDireccion"></label>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input value="${user.correo}" type="email" readonly="" name="inputEmail" class="form-control">
                                        <label for="inputEmail"></label>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input value="${user.telefono}" type="text"  name="inputTelefono" class="form-control" >
                                        <label for="inputTelefono"></label>
                                    </div>
                                </div>
                            </div>

                            <!--<div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input value="" type="text" name="inputCiudad" class="form-control" >
                                        <label for="inputCiudad"></label>
                                    </div>
                                </div>
                            </div>-->



                            <!--<div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input type="email" id="inputConfirmaremail" class="form-control" placeholder="Confirmar E-mail" required="required" autofocus="autofocus">
                                        <label for="inputConfirmareEmail"></label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input type="password" id="inputPassword" name="inputPassword" class="form-control" placeholder="Contraseña" required="required" autofocus="autofocus">
                                        <label for="inputPassword"></label>
                                    </div>
                                </div>
                            </div>
    
                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="form-label-group">
                                        <input type="password" id="inputConfirmarpassword" class="form-control" placeholder="Confirmar Contraseña" required="required" autofocus="autofocus">
                                        <label for="inputConfirmarpassword"></label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="remember-me">
                                        Remember Password
                                    </label>
                                </div>
                            </div>-->
                            <div class="btn-group-toggle text-center">
                                <!-- cambiar para ver si es el error -->
                              
                                <input class="btn btn-success" type="submit" name="accion" value="Actualizar"><br>
                                
                                <!--<a href="LoginController?accion=listar">Regresar</a>-->
                                <!--<button href="Pincipal.jsp" accion="Cancelar" class="btn btn-danger" name="btnCancelar">Cancelar</button>-->
                            </div> <!-- form input -->
  </c:forEach>
                        </form>
                        <!--<div class="text-center">
                            <a class="d-block small mt-3" href="Createaccount.html">Register an Account</a>
                            <a class="d-block small" href="Forgot-password.html">Forgot Password?</a>
                        </div>-->
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

