<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1 align="center">Mostrar Listado</h1>
        
        <table border ="1" width="600" align="center">
            <tr bgcolor="skyblue">
                <%-- colspan para que quede entoda la cabecera --%>
                <th colspan="3" > Mantenimiento</th>
                <th> <a href="Nuevo.jsp"><img src="assets/images/crud/select.png"> </a></th>
                               
            </tr>
          <tr bgcolor="skyblue">
                 <th>Id</th>
                <th>Codigo</th>
                <th>Departamento</th><th>Accion</th>
                
                
            </tr>
            
            
       <jsp:useBean class="DAOIMP.DepartamentoImp" id="IDTPO"> </jsp:useBean>
      
       <c:forEach items="${IDTPO.ListarDepartamentos()}" var="Departa"> 
           
           <%--%> <c:forEach var="datos" items="${Departa}"> comment --%>
          
                <tr>
  
                <th> ${Departa.id}</th>
              <th> ${Departa.cod}</th>
                   <th> ${Departa.dpto}</th>  
                <th> <a href="Actualizar.jsp?cod=${Departa.id}"><img src="assets/images/crud/select.png"></a> <a href="Eliminar.jsp?id=${Departa.id}"> <img src="assets/images/crud/Eliminar.jpg" width="20"> </a></th>
              <%--  </c:forEach>--%>
                
                </tr> 
      </c:forEach>  
<%-- --%>
        
        
        </table>
        
        
    </body>
</html>
