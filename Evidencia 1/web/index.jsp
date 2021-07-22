<%-- 
    Document   : index
    Created on : Jul 21, 2021, 7:34:57 AM
    Author     : nealg
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="RestServlet">
       introduce tu usuario: <br>
            <input type="text" name="Usuario" value=""><br>
            introduce tu Contrasena <br>
            <input type="text" name="contrasena" value=""><br>
            introduce tu Nombre Completo <br>
            <input type="text" name="Nombre" value=""><br>
            Cual es tu sexo? <br>
            <input type="text" name="sexo" value=""><br>
            Que edad tienes? <br>
            <input type="text" name="edad" value=""><br>
            <input type="submit" value="siguiente"><br>
            </form>
    </body>
</html>
