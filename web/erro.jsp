<<<<<<< HEAD
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%!
String erro = "";
%>
<%
erro = (String)request.getAttribute("erro");
String excessao = (String) request.getAttribute("excecao");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Pagina de erro</h1>
        <%=excessao%>
        <h2><%=erro%></h2>
    </body>
</html>
=======
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%!
String erro = "";
%>
<%
erro = (String)request.getAttribute("erro");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h2><%=erro%></h2>
    </body>
</html>
>>>>>>> 220370d145dd6698199719bcb387975229482735
