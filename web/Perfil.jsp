<%-- 
    Document   : Perfil
    Created on : 23/07/2018, 18:22:10
    Author     : Juliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <div>
            <div style="position:fixed; top:0px; vertical-align:top; left:0px;">
                <a href="#">
                    <button>Pagina Inicial</button><t></t>
                    <form action="perfil.jsp" method="post" >
                        <input type="text" name="busca" value="busca" onfocus="this.value = '';" />
                        <input type="submit" name="Buscar" value="Buscar">
                    </form>
                    <form action="perfil.jsp">

                        <input type="submit" size="10" name="perfil" value="Perfil" ></input>
                    </form>

                    <form action="NovoDiario.jsp">

                        <input type="submit" size="10" name="novoDiario" value="Criar Novo Diario" ></input>
                    </form>


                    <button>Ajuda</button>
                </a></div>
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

        </div>
    </body>
</html>
