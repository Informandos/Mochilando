package controller;

import controller.interfacelogica.Logica;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.domain.Tag;
import model.domain.UsuarioTag;
import model.service.implementacao.ManterTag;
import model.service.implementacao.ManterUsuarioTag;
import model.service.interfaces.InterfaceManterTag;

public class ListarTagUsuario implements Logica{

    @Override
    public String execute(HttpServletRequest req) throws Exception {
        String jsp = "";
        try {
            
            String codUsuarioStr = req.getSession().getAttribute("codUsuario").toString();
            Long codUsuario = Long.parseLong(codUsuarioStr);
            req.getSession().setAttribute("codUsuario", codUsuario);
            
            ManterUsuarioTag manterUsuarioTag = new ManterUsuarioTag();
            List<UsuarioTag> listTagPorUsuario =  manterUsuarioTag.pesquisarPorCodUsuario(codUsuario);
            
            List listDescTagUsuario = null;
            for(UsuarioTag usuarioTag: listTagPorUsuario){
                listDescTagUsuario.add( usuarioTag.getTag().getDescTag());
            }
            
            
            if (listTagPorUsuario!= null) {
                
                req.setAttribute("listaTagsUsuario", listDescTagUsuario);
                jsp = "/tagsUsuario.jsp";
            } else {
                String erro = "Nao existem tags cadastradas!";
                req.setAttribute("erro", erro);
                jsp = "/erro.jsp";
            }

        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        
        return jsp;
    }
    
}
