<!DOCTYPE html>

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <script type="text/javascript" language="JavaScript" src="js/WebValida.js"></script>
    </head>
    <body>
        <form nome="Login" method="POST">
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