<%-- 
    Document   : criardiario
    Created on : 27/07/2018, 20:50:28
    Author     : Juliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar diario</title>
    </head>
    <body>
        <%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
        <c:import	url="cabecalho.jsp"	/>
        <h1>Criar diario</h1>
        <form name="frmCriarDiario" method='post'>
            <label>Nome do diario:
                <input type="text" name="nomdiario" id="nomediario" maxlength="50" size="50">    
            </label><br />
            <br />
            <label>Senha:&nbsp;&nbsp;&nbsp;
                <input type="password" name="senha" id="senha" maxlength="10" size="12">    
            </label><br />
            <br />
        </form>

    </body>
</html>
