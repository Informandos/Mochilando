<!DOCTYPE html>

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="ServletCadastro" method="POST">
        <h3>cadastro</h3>
        Nome<br>
         <input type="text" name="nome" Value="name"><br>
        E-Mail<br>
        <input type="text" name="e-mail" Value="E-mail"><br>
        Senha<br>
        <input type="password" name="senha"><br>
        confirme a senha<br>
        <input type="password" name="confirmacao"><br>
        <input type="radio" name="termos">Concordo com os
        <a href="Termosdeuso.jsp">Termos e Politica de privacidade</a><br>
        <input type="submit" value="Login">
        </form>
        <div>
            <a href="recuperacaoDeSenha.jsp">Esqueci a senha</a><br>
            <a href="cadastro.jsp">Cadastro</a>
        </div>
        <a href="Desenvolvedores.jsp">Desenvolvedores</a>
    </body>
</html>