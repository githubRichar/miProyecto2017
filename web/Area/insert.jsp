<%-- 
    Document   : insert
    Created on : 04-mar-2017, 9:57:36
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
        <h1>INSERTAR</h1>
        <form action="ServletInsert" method="post">
            <label for="txtNombre">Nombre Area:</label>
            <input type="text" id="txtNombre" name="txtNombre"><br>
            <label for="txtDescripcion">Descripcion Area:</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion"><br>   
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
