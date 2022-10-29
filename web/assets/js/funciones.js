/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
        
        $("#btnDelete").click(function(){
        
        var idp=$(this).parent().find("#idp").val();
        
        eliminar(idp);
        
    });
        
        function eliminar(idp){
            
            var url="ProductoController?accion=Delete";
            
            $.ajax({
                ty
                type:'POST',
                url:url,
                data:"idp="+idp,
                
                success:function (data,textStatus,jqXHR)
                alert("Registro eliminado!");      
                
            }
                
                
            })
                    
            
            
            
}     
            
});

