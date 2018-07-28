package controller;

import controller.interfacelogica.Logica;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class ServletWeb extends HttpServlet {

    private String jsp = "";

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String parametro = request.getParameter("logica");
        String nomeDaClasse = parametro;
        try {
            Class<?> classe = Class.forName(nomeDaClasse);
            Logica logica = (Logica) classe.newInstance();
            //Recebe a String após a execução da logica
            String pagina = logica.execute(request, response);
            //Faz o forward para a página JSP
            request.getRequestDispatcher(pagina).forward(request, response);
        } catch (Exception e) {
            throw new ServletException("Erro ao direcionar", e);
        }

        String acao = request.getParameter("acao");

        if (acao.equals("Logar")) {
            jsp = Logar.execute(request);
        }
        /*
        if else(acao.equals("..."))
            jsp = Logar.execute(request);
        ...
         */

        //Redirecionando pagina
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        rd.forward(request, response);
    }
}
