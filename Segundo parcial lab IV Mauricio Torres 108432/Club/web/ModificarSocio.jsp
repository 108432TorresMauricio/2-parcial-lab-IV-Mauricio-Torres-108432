<%-- 
    Document   : ModificarSocio
    Created on : 03-nov-2020, 18:31:07
    Author     : Mauricio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modificar datos del socio</h1>
        
         <form method="POST" action="/club/ModificarSocio">
            
             <input type="hidden" name="txtid" value="${SocioDTO.sociodto.IdSocio}">
             
             <input class="form-control" placeholder="Nombre" type="text"  value="${SocioDTO.Nombre}" name="txtNombre"  required=""/>
            </br>
            
            <input class="form-control" placeholder="Apellido" type="text"  value="${SocioDTO.Apellido}" name="txtApellido" required="" />
            </br>
            
            <input class="form-control" placeholder="Edad" type="number"  value="${SocioDTO.Edad}" name="txtEdad" required="" />
            </br>
           
            <input class="form-control" placeholder="Telefono"  type="number" value="${SocioDTO.Telefono}" name="txtTelefono" required="" />
            </br>
            
         
     
            <select class="form-control" name="cboSexo"  > 
                <c:forEach var="SocioDTO" items="${sociodto.listaSociosexo}" >
                
                    <option value="${SocioDTO.getIdSocio()}" <c:if test="${sociodto.SocioDTO.getIdSocio() == SocioDTO.getSexo().IdSexo()
                                                    } "> selected </c:if >>"${SocioDTO.Nombre}"</option>
                
                </c:forEach>
                
            </select>
            </br>
           
            <input class="btn btn-primary" onclick="return validar();" type="submit" value="Agregar" name="txtBoton"  />
            
        </form>
        
    </body>
</html>
