<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : read
    Created on : 04-mar-2017, 15:16:38
    Author     : RICHAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Areas</h1>
        <jsp:useBean id="ejbArea" scope="request" class="Ejb.EjbArea" />
        <table border="1">
            <thead>
                <tr>
                    <th>ID AREA</th>
                    <th>NOMBRE AREA</th>
                    <th>DESCRIPCION AREA</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${ejbArea.listaArea}">
                    <tr>
                        <td>${item.getArea_id()}</td>
                        <td>${item.getArea_nombre()}</td>
                        <td>${item.getArea_descripcion()}</td>
                        <td><button id="${item.getArea_id()}" onclick="actualizar(this.id);">EDITAR</button></td>
                        <td><button id="${item.getArea_id()}" onclick="borrar(this.id);">BORRAR</button></td>
                    </tr> 
                </c:forEach>                               
            </tbody>
        </table>

    </body>
    <script>
        function actualizar(idArea) {
            window.location.href="ServletUpdate?idArea="+idArea;
        }
        function borrar(idArea){
            window.location.href="ServletDelete?idArea="+idArea;            
        }
    </script>

</html>
