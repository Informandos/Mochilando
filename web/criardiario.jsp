<%-- 
    Document   : criardiario
    Created on : 27/07/2018, 20:50:28
    Author     : Juliana
--%>
<%@page import="java.util.List"%>
<%@page import="model.domain.Tag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.service.implementacao.ManterTag"%>       
            
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo diario</title>
    </head>
    <body>
        <%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
        <c:import url="cabecalho.jsp"/>
        <h1>Novo diario</h1>
        <form name="frmCriarDiario" method='post'>
            <label>Titulo *:
                <input type="text" name="nomdiario" id="nomediario" maxlength="50" size="50">    
            </label><br />
            <br />
            <label>Tags do diario:&nbsp;&nbsp;&nbsp;
                <% ManterTag tag = new ManterTag(); 
                  
                   List<Tag> lista = tag.pesquisarTodos();
                  for(Tag tagobtida : lista){
                      %>
                     
                      <input type="checkbox" name="opcoes" value="tag"/> 
                      <% tagobtida.getDescTag(); %> 
                      <br>
                      
                      <%
                  }
                %>
            </label><br />
            <br />
        </form>

    </body>
</html>
