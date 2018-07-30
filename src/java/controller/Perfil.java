/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.interfacelogica.Logica;
import javax.servlet.http.HttpServletRequest;
import model.domain.Usuario;

/**
 *
 * @author Juliana
 */
public class Perfil implements Logica {

    @Override
    public String execute(HttpServletRequest request) throws Exception {
        String paginaJsp = "";
        Usuario usr = (Usuario) request.getSession().getAttribute("usuario");
        if (usr == null) {
            System.out.println("Usuario nao encontrado");
            String erro = "Usuario nao encontrado!";
            request.setAttribute("erro", erro);
            paginaJsp = "/erro.jsp";
        } else {
            paginaJsp = "/Perfil.jsp";
        }
        return paginaJsp;
    }

}
