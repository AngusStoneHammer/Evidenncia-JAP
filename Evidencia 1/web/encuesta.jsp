<%-- 
    Document   : encuesta
    Created on : Jul 21, 2021, 2:16:15 PM
    Author     : nealg
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.getAttribute("Arearesuelta");
        %>
        <form method="POST" action="IMCServlet">
        <h1>Hello World!</h1>
        Cual es tu Peso?(kg) <br>
        <input type="text" name="peso" value=""><br>
        Cual es tu Altura?(cm) <br>
        <input type="text" name="altura" value=""><br>
        <input type="submit" value="siguiente"><br>
        </form>
    </body>
</html>
