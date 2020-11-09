<%-- 
    Document   : ListadoDeSocios
    Created on : 31-oct-2020, 22:37:09
    Author     : Mauricio
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Socio"%>
<%@page import="Modelo.Socio"%>
<%@page import="Gestor.GestorBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Socios</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        
    </head>
    <body>
         <%@include file="Menu.jsp" %>
         <br>
    <center><h1>LISTA DE SOCIOS</h1> </center>  
        
        
        <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nombre</th>
      <th scope="col">Apellido</th>
      <th scope="col">Edad</th>
      <th scope="col">Telefono</th>
      <th scope="col">Sexo</th>
      <th scope="col">Estado</th>
      <th scope="col">Estado</th>
    </tr>
  </thead>
</table>

    <table class="table">
        <thead class="thead-dark">
            
              <c:forEach var="Socio" items="${listaSocio}" >
                  <tr>
                      
                      <td>${Socio.getIdSocio()}</td>
                      <td>${Socio.getNombre()}</td>
                      <td>${Socio.getApellido()}</td>
                      <td>${Socio.getEdad()}</td>
                      <td>${Socio.getTelefono()}</td>
                      <td>${Socio.getSexo()}</td>
                      <td><a href="/Club/EliminarSocio?id=${Socio.getIdSocio()}">Eliminar</a></td>
                      <td><a href="/Club/ModificarSocio?id=${Socio.getIdSocio()}">Modificar</a></td>
                      
                      
                  </tr>
                  
              </c:forEach>
            
              </thead>
              </table>
            
           </body>  
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
   
</html>
