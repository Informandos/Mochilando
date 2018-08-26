package controller;


import model.domain.Usuario;
import model.service.implementacao.ManterUsuario;
import model.service.interfaces.InterfaceManterUsuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.domain.Diario;
import model.domain.TagDiario;
import model.domain.UsuarioTag;
import model.service.implementacao.ManterDiario;
import model.service.implementacao.ManterTagDiario;
import model.service.implementacao.ManterUsuarioTag;
import model.service.interfaces.InterfaceManterDiario;
import model.service.interfaces.InterfaceManterTagDiario;
import model.service.interfaces.InterfaceManterUsuarioTag;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;
import util.pesquisas.AtualizacaoDiarios;

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
                //Guarda o objeto usuario na sessao;
                request.getSession().setAttribute("usuario", usr);
                
                //Obtem dados do usuario para exibir seus diarios no jsp a ser enviado (pagina inicial)
                //Busca por todos os diarios que tem alguma tag nesse conjunto de tags do usuario
                List<Diario> listaDiario = null;
                
                AtualizacaoDiarios atualizacao = new AtualizacaoDiarios();
                //listaDiario = atualizacao.atualizar(usr.getCodUsuario());*/
                
                Diario diarioSegundo = new Diario();
                diarioSegundo.setCodDiario(1L);
                diarioSegundo.setNomDiario("nomdiario2");
                
                Diario diarioSegundot = new Diario();
                diarioSegundot.setCodDiario(2L);
                diarioSegundot.setNomDiario("nomdiario3");
                
                List<Diario> teste = new ArrayList();
                teste.add(diarioSegundo);
                teste.add(diarioSegundot);
                
                request.setAttribute("listadiario", teste);
                
                
                
                jsp = "/paginainicial.jsp";
            }

        } catch (ExcecaoNegocio | ExcecaoPersistencia e) {
            request.setAttribute("excecao", e.getMessage());
            jsp = "/erro.jsp";
        }
        return jsp;
    }

    public static void validarSessao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
        
        if (usuario == null) {
            String jsp = "";
            jsp = "/Login.jsp";
            //Redirecionando pagina
            RequestDispatcher rd = request.getRequestDispatcher(jsp);
            rd.forward(request, response);
        }
    }

    
    
}
