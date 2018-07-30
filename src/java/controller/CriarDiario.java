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
import model.service.implementacao.ManterTipoAtracao;
import model.service.implementacao.ManterUsuario;
import model.service.interfaces.InterfaceManterEstado;
import model.service.interfaces.InterfaceManterTag;
import model.service.interfaces.InterfaceManterTipoAtracao;
import model.service.interfaces.InterfaceManterUsuario;

/**
 *
 * @author Juliana
 */
public class CriarDiario implements Logica {

    @Override
    public String execute(HttpServletRequest request) throws Exception {

        InterfaceManterTag manterTag = new ManterTag();
        List<Tag> listaTag = manterTag.pesquisarTodos();
        request.setAttribute("listaTag", listaTag);
        //Pegando todos os estados
        InterfaceManterEstado manterEstado = new ManterEstado();
        List<Estado> listaEstado = manterEstado.pesquisarTodos();
        request.setAttribute("listaEstado", listaEstado);
        
        InterfaceManterTipoAtracao manterTipoAtraco = new ManterTipoAtracao();

        String jsp = "/criardiario.jsp";

        return jsp;
    }

}
