/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juliana
 */
public class Servlet_login extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        request.setAttribute("email", email);
        request.setAttribute("senha", senha);
        
        //Conferir se existe este email e senha na base de dados -> enviar para classe se servicos
        boolean existe = true;
        
        if(existe){
            request.getRequestDispatcher("pagina_inicial.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("login.html");
        }
    }

}
