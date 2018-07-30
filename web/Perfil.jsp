<%-- 
    Document   : Perfil
    Created on : 23/07/2018, 18:22:10
    Author     : Juliana
--%>

<%@page import="model.domain.Usuario"%>
<%@page import="model.service.interfaces.InterfaceManterUsuario"%>
<%@page import="model.service.implementacao.ManterUsuario"%>
<%@page import="controller.Logar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<% //Logar.validarSessao(request, response); %>

<html>
    <head>
        <title>Tela perfil</title>
    
        <script language="javascript">
            function Mudarestado(el) {
                var display = document.getElementById(el).style.display;
                if (display === "none")
                    document.getElementById(el).style.display = 'block';
                else
                    document.getElementById(el).style.display = 'none';
            }
        </script>
    </head>
    <body>
        <%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <c:import	url="cabecalho.jsp"	/>
        <% 
            InterfaceManterUsuario manterUsuario = new ManterUsuario();
            String idString = session.getAttribute("codUsuario").toString();
            Long id = Long.parseLong(idString);
            Usuario usuario = manterUsuario.pesquisarPorId(id);
        %>
        
        <h1>Ola <%=usuario.getNomUsuario()%></h1>
        <div>

            <br><br>
            <br><br>
            <center>
                <div id="minhaDiv" style="display:none">Conteudo</div>
                <button type="button" onclick="Mudarestado('minhaDiv')">Mostrar / Esconder</button>
            </center>
            <H1>Perfil do Usuario</H1>
            <img src="Imagens/foto_perfil.jpg" width="100" height="100"><br>
            Nome do usuario<br>
            <button>Sobre</button><button>Diarios</button><button>Preferencias</button><br>

            <button>Editar dados cadastrais</button>
            <input type='hidden' name='table' value='Estado'>
            <input type='hidden' name='acao' value='alterar'>

        </div>
    </body>
</html>
