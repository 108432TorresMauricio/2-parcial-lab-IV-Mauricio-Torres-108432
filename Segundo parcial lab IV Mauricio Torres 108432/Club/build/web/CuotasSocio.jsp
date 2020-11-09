<%-- 
    Document   : CuotasSocio
    Created on : 08-nov-2020, 21:36:35
    Author     : Mauricio
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Cuotas</title>
    </head>
    <body>
        <%@include file="Menu.jsp" %>
        <br>
    <center><h1>CUOTAS DEL SOCIO</h1></center>

    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">Nro Couta</th>
                <th scope="col">Mes</th>
                <th scope="col">Año</th>
                <th scope="col">Socio</th>
                <th scope="col">Precio Couta</th>

            </tr>
        </thead>
    </table>

        <table class="table">
            <thead class="thead-dark">

                <c:forEach var="CuotasPagadas" items="${listaCuotas}">

                <tr>
                    <td>${CoutasPagadas.getIdCoutasPagadas()}</td>
                    <td>${CoutasPagadas.getMes()}</td>
                    <td>${CoutasPagadas.getAño()}</td>
                    <td>${CoutasPagadas.getIdSocio()}</td>
                    <td>${CoutasPagadas.getPrecio()}</td>

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
