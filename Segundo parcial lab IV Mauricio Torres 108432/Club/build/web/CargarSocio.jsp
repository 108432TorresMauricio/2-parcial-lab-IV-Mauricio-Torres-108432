<%-- 
    Document   : CargarSocio
    Created on : 02-nov-2020, 16:19:34
    Author     : Mauricio
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Sexo"%>
<%@page import="Gestor.GestorBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carga de socio</title>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    </head>
    <body>
        <%@include file="Menu.jsp" %>
        <br>
    <center><h1>SOCIO</h1></center>
        
    
            <div>
                
        <form method="POST" action="AgregarSocio">
            
            <input class="form-control" placeholder="Nombre" type="text" name="txtNombre"  required=""/>
            </br>
            
            <input class="form-control" placeholder="Apellido" type="text" name="txtApellido" required="" />
            </br>
            
            <input class="form-control" placeholder="Edad" type="number" name="txtEdad" required="" />
            </br>
           
            <input class="form-control" placeholder="Telefono"  type="number" name="txtTelefono" required="" />
            </br>
            
         
     
            <select class="form-control" name="cboSexo"  > 
                <c:forEach var="Sexo" items="${listaSexo}" >
                
                    <option value="${Sexo.getIdSexo()}" > ${Sexo.getNombre()}  
                
                </c:forEach>
                
            </select>
            </br>
           
            <input class="btn btn-primary" onclick="return validar();" type="submit" value="Agregar" name="txtBoton"  />
            <input class="btn btn-primary"  type="submit" value="Actualizar" name="txtBoton"  />
        </form>
                
        </div>
  
    </script>
       
    </body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
      
</html>
