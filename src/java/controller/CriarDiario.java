/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.interfacelogica.Logica;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.domain.Estado;
import model.domain.Tag;
import model.domain.Usuario;
import model.service.implementacao.ManterEstado;
import model.service.implementacao.ManterTag;
import model.service.implementacao.ManterUsuario;
import model.service.interfaces.InterfaceManterEstado;
import model.service.interfaces.InterfaceManterTag;
import model.service.interfaces.InterfaceManterUsuario;

/**
 *
 * @author Juliana
 */
public class CriarDiario implements Logica {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String jsp = "";
        try {
            //Pegando o codigo do usuario para obter o usuario que tem aquele id
            /*Long codUsuario = Long.parseLong(req.getParameter("codUsuario"));
            InterfaceManterUsuario manterUsuario = new ManterUsuario();
            Usuario usuarioCorrente = manterUsuario.pesquisarPorId(codUsuario);
            req.setAttribute("usuarioCorrente", usuarioCorrente);*/
            //Pegando todas as tags
            InterfaceManterTag manterTag = new ManterTag();
            List<Tag> listaTag = manterTag.pesquisarTodos();
            req.setAttribute("listaTag", listaTag);
            //Pegando todos os estados
            InterfaceManterEstado manterEstado = new ManterEstado();
            List<Estado> listaEstado = manterEstado.pesquisarTodos();
            req.setAttribute("listaEstado", listaEstado);
            
            if(listaEstado != null){
                
                jsp = "/criardiario.jsp";
            }else{
                String erro = "Ocorreu erro ao Alterar Marca!";
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
