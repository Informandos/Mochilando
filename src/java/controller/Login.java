package controller;



import model.dao.implementacao.UsuarioDAO;
import model.dao.interfaces.InterfaceUsuarioDAO;
import model.domain.Usuario;
import model.service.implementacao.ManterUsuario;
import model.service.interfaces.InterfaceManterUsuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login {

    @SuppressWarnings("static-access")
    public static String execute(HttpServletRequest request) {

        String jsp = "";

        try {
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");

            InterfaceManterUsuario manterUsuario = new ManterUsuario();
            Usuario usr = manterUsuario.getUserLogin(email, senha);

            if (usr == null) {
                String erro = "Usuario nao encontrado!";
                request.setAttribute("erro", erro);
                jsp = "/erro.jsp";
            } else {
                request.getSession().setAttribute("cod_usuario", usr.getCodUsuario());
                
                jsp = "/teste.jsp";
            }

        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }

    public static void validarSessao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long codUsuario = (Long) request.getSession().getAttribute("cod_suario");
        String jsp = "";
        if (codUsuario == null) {
            jsp = "/Login.jsp";
            //Redirecionando pagina
            RequestDispatcher rd = request.getRequestDispatcher(jsp);
            rd.forward(request, response);
        }
    }
}
