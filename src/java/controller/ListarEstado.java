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
import model.service.implementacao.ManterEstado;
import model.service.interfaces.InterfaceManterEstado;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public class ListarEstado implements Logica {
    

    @Override
    public String execute(HttpServletRequest req) throws Exception {
        
        String jsp = "";
        try {
            InterfaceManterEstado manterEstados = new ManterEstado();
            List<Estado> listEstado = manterEstados.pesquisarTodos();
            if (listEstado != null) {
                req.setAttribute("listEstado", listEstado);
                jsp = "/listarestado.jsp";
            } else {
                String erro = "Nao existem estados cadastrados!";
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
