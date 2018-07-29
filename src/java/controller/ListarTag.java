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
import model.domain.Tag;
import model.service.implementacao.ManterTag;
import model.service.interfaces.InterfaceManterTag;

/**
 *
 * @author Juliana
 */
public class ListarTag implements Logica{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String jsp = "";
        try {
            InterfaceManterTag manterTags = new ManterTag();
            List<Tag> listTag = manterTags.pesquisarTodos();
            if (listTag != null) {
                req.setAttribute("listTag", listTag);
                jsp = "/criardiario.jsp";
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