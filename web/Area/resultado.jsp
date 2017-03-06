<%-- 
    Document   : resultado
    Created on : 04-mar-2017, 11:22:01
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
        <h1>PROCESANDO</h1>
        <h3><%=request.getAttribute("mensaje")%> </h3>
        <h4><a href="index.jsp">INICIO</a></h4>
    </body>
</html>
