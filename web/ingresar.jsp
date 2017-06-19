<%-- 
    Document   : ingresar
    Created on : 09-may-2017, 0:25:10
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="css/login.css" rel="stylesheet" type="text/css">
  </head>
  <body class="fd">


<div class="jumbotro boxlogin" >
    <form action="validad.jsp" name="flogin" id="flogin" method="POST">
        <label>Nombre del usuario</label>
        <input type="text" name="f_nombre" id="usuario" class="form-control" placeholder="Ingrese Usuario">
        <label > Contraseña</label>
        <input type="password" name="f_clave" id="pass" class="form-control" placeholder="*******">
        <button id="btnEntrar" type="submit" class="btn btn-primary">Entrar</button>
    </form>
</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>