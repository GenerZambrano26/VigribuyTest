/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    $("tr #btnDelete").click(function () {

        var idp = $(this).parent().find("#idp").val();

        swal({
            title: "Esta seguro de eliminar este producto?",
            text: "Una vez, Eliminado no podra recuperar el producto!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        }).then((willDelete) => {
            if (willDelete) {
                eliminar(idp);
                swal("Hecho! Su producto ha sido eliminado!", {
                    icon: "success",
                }).then((willDelete) => {

                    if (willDelete) {
                        parent.location.href = "ProductoController?accion=Carrito";
                    }

                });
            } else {
                swal("Su producto no fue eliminado!");
            }
        });
    });




    function eliminar(idp) {

        var url = "ProductoController?accion=Delete";
        $.ajax({
            type: 'POST',
            url: url,
            data: "idp=" + idp,
            success: function (data, textStatus, jqXHR) {
                //alert("Registro eliminado!");      

            }
        });
    }
    
    
    
//Modificar producto
    $("tr #Cantidad").click(function () {
        try {
            var idp = $(this).parent().find("#idpro").val();
            var cantidad = $(this).parent().find("#Cantidad").val();
            var url = "ProductoController?accion=ActualizarCantidad";


           




            swal({
                title: "Producto actualizado",
                // text: "Una vez, Eliminado no podra recuperar el producto!",
                icon: "success",
                //buttons: true,
                //dangerMode: true,

            }).then((willDelete) => {

                    if (willDelete) {
                         $.ajax({
                type: 'POST',
                url: url,
                data: "idpro=" + idp + "&Cantidad=" + cantidad,
                success: function (data, textStatus, jqXHR) {
                    //alert("Registro eliminado!");      
                    location.href = "ProductoController?accion=Carrito";
                }

            });
                    }

                });

//                    

//  swal("Hecho! Su producto ha sido Actualizado!", {
//                    icon: "success",
//                })






        } catch (e) {
            alert(e.toString());

        }


    });
    
    
    
    
    //Generar venta desde JavaScrit mensaja sweet alert
    
     $("#GenerarCompra").click(function () {
        try {
//            var idp = $(this).parent().find("#idpro").val();
//            var cantidad = $(this).parent().find("#Cantidad").val();
            var url = "ProductoController?accion=GenerarCompra";


           




            swal({
                title: "Compra realizada",
                // text: "Una vez, Eliminado no podra recuperar el producto!",
                icon: "success",
                //buttons: true,
                //dangerMode: true,

            }).then((willDelete) => {

                    if (willDelete) {
                         $.ajax({
                type: 'POST',
                url: url,
                data: "",
                success: function (data, textStatus, jqXHR) {
                    //alert("Registro eliminado!");      
                    location.href = "ProductoController?accion=Nuevo";
                }

            });
                    }

                });

//                    

//  swal("Hecho! Su producto ha sido Actualizado!", {
//                    icon: "success",
//                })






        } catch (e) {
            alert(e.toString());

        }


    });
    
    
    

});

