
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.interfacelogica.Logica;
import javax.servlet.http.HttpServletRequest;
import model.domain.Cidade;
import model.domain.Usuario;
import model.service.implementacao.ManterCidade;
import model.service.implementacao.ManterUsuario;
import model.service.interfaces.InterfaceManterCidade;
import model.service.interfaces.InterfaceManterUsuario;

/**
 *
 * @author Juliana
 */
public class Perfil implements Logica {

    @Override
    public String execute(HttpServletRequest request) throws Exception {
        String paginaJsp = "";
        
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
        
        if (usuario == null) {
            String erro = "Usuario nao encontrado!";
            request.setAttribute("erro", erro);
            paginaJsp = "/erro.jsp";
        } else {
            request.setAttribute("usuario", usuario);
            if(usuario.getDatNascimento()!=null){
                request.setAttribute("datanasc", usuario.getDatNascimento());
            }else{
                request.setAttribute("datanasc", "01/01/2018");
            }
            request.setAttribute("nome", usuario.getNomUsuario()+" "+usuario.getSobrenomeUsuario());
            request.setAttribute("email", usuario.getTxtEmail());
            request.setAttribute("sexo", usuario.getSexo());
            request.setAttribute("cidade", "Igarape");
            
            InterfaceManterCidade manterCidade = new ManterCidade();
            
            paginaJsp = "/Perfil.jsp";
        }
        return paginaJsp;
    }

}