<!DOCTYPE html>

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="CadastrarUsuario" method="POST">
        <h3>cadastro</h3>
        
        Nome<br>
         <input type="text" name="nome" Value="nome"><br>
         Sobrenome<br>
         <input type="text" name="sobrenome" Value="sobrename"><br>
         <a>Data de nascimento</a><br>
         <input type="date" name="data"><br>
         Estado(Sigla)<br>
         <input type="text" name="estado"><br>
        Cidade<br>
        <input type="text" name="cidade"><br>
         E-Mail<br>
        <input type="text" name="email" Value="E-mail"><br>
        sexo<br>
        <input type="text" name="sexo" ><br>
        
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