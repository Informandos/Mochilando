package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class ServletWeb extends HttpServlet {
 private String jsp = "";
  
   @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        
        request.setCharacterEncoding("UTF-8");
        String acao = request.getParameter("acao");
        
        if(acao.equals("Logar"))
           jsp = Login.execute(request);
        /*
        if else(acao.equals("..."))
            jsp = Login.execute(request);
        ...
        */
        
        
        
         //Redirecionando pagina
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        rd.forward(request, response);
        }
    }
