package controller;


import model.domain.Usuario;
import model.service.implementacao.ManterUsuario;
import model.service.interfaces.InterfaceManterUsuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

public class Logar {

    @SuppressWarnings("static-access")
    public static String execute(HttpServletRequest request) {

        String jsp = "";

        try {
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");

            InterfaceManterUsuario manterUsuario = new ManterUsuario();
            Usuario usr = manterUsuario.getUserLogin(email, senha);

            if (usr == null) {
                System.out.println("Usuario nao encontrado");
                String erro = "Usuario nao encontrado!";
                request.setAttribute("erro", erro);
                jsp = "/erro.jsp";
            } else {
                
                request.getSession().setAttribute("codUsuario", usr.getCodUsuario());
                
                
                jsp = "/paginainicial.jsp";
            }

        } catch (ExcecaoNegocio | ExcecaoPersistencia e) {
            request.setAttribute("excecao", e.getMessage());
            jsp = "/erro.jsp";
        }
        return jsp;
    }

    public static void validarSessao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stringCodUsuario = request.getSession().getAttribute("codUsuario").toString();
        Long codUsuario = Long.parseLong(stringCodUsuario);
        
        if (codUsuario == null) {
            String jsp = "";
            jsp = "/Login.jsp";
            //Redirecionando pagina
            RequestDispatcher rd = request.getRequestDispatcher(jsp);
            rd.forward(request, response);
        }
    }

    
    
}
