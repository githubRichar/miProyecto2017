<%-- 
    Document   : update
    Created on : 04-mar-2017, 16:11:33
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
        <jsp:useBean id="ejbArea" scope="request" class="Ejb.EjbArea" />
        <h1>DATOS A EDITAR</h1>
        <form action="ServletUpdate" method="post">
            <label for="txtDescripcion">Area Id:</label>
            <input type="text" id="txtAreaId" name="txtAreaId" readonly="readonly" value="${ejbArea.getArea().area_id}">><br>  
            <label for="txtNombre">Nombre Area:</label>
            <input type="text" id="txtNombre" name="txtNombre" value="${ejbArea.getArea().area_nombre}"><br>
            <label for="txtDescripcion">Descripcion Area:</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion" value="${ejbArea.getArea().area_descripcion}">><br>   
            <input type="submit" value="Actualizar datos">
            
        </form>
    </body>
</html>
