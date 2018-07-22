<%-- 
    Document   : PrimeiroJSP
    Created on : 20/07/2018, 10:12:32
    Author     : Juliana
--%>

<?xml version = "1.0"?>
 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
3 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

 <!-- Fig. 37.4: welcome.jsp -->
 <!-- JSP that processes a "get" request containing data. -->

 <html xmlns = "http://www.w3.org/1999/xhtml">

 <!-- head section of document -->
 <head>
 <title>Processing "get" requests with data</title>
 </head>

 <!-- body section of document -->
 <body>
 <% // begin scriptlet


 if ( request.getAttribute("firstName" ) != null ) {
     
    if(request.getAttribute("verifica" ).equals(false)){
        %>
        <h1>Nome incorreto</h1>
        Tente novamente!
<%
    }else{
        
    

 %> <%-- end scriptlet to insert fixed template data --%>

welcome.jsp
(1 of 2)
Scriptlets used to
insert Java code
Use request implicit
object to get parameter 
Outline
 <h1>
 Hello <%= request.getAttribute( "firstName" ) %>, <br />
 Welcome to JavaServer Pages!
 </h1>

 <% // continue scriptlet
     }
 } // end if
else {

 %> <%-- end scriptlet to insert fixed template data --%>

 <form action = "VerificaNome" method = "get">
 <p>Type your first name and press Submit</p>

 <p><input type = "text" name = "firstName" />
 <input type = "submit" value = "Submit" />
 </p>
 </form>

 <% // continue scriptlet

 } // end else

 %> <%-- end scriptlet --%>
50 </body>
51
52 </html> <!-- end XHTML document --> 