<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <title>Login</title>
               <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        
         <script type="text/javascript" language="JavaScript" src="js/webvalida.js"></script>
    </head>
    <body>
        <form nome="Login" method="post">
        <h1>Login</h1>
        E-Mail<br>
        <input type="text" name="email" Value="E-mail" id="email"><br>
        Senha<br>
        <input type="password" id="senha" name="senha"><br>
         <button type="button" onclick="validarCamposLogin()">Acessar</button>
        </form>
        <div>
            <a href="RecuperacaoDeSenha.jsp">Esqueci a senha</a><br>
            <a href="Cadastro.jsp">Cadastro</a>
        </div>
        <a href="Desenvolvedores.jsp">Desenvolvedores</a>
    </body>
</html>