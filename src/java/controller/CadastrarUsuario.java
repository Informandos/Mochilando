/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.interfacelogica.Logica;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.domain.Cidade;
import model.domain.Estado;
import model.domain.Usuario;
import model.service.implementacao.ManterUsuario;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author User
 */
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet implements Logica{
   @Override
    public String execute(HttpServletRequest request) throws Exception {
       
    try {
            String jsp = "";
            String nome = request.getParameter("nome");
            String sobrenome = request.getParameter("sobrenome");
            String data = request.getParameter("data");
            String senha = request.getParameter("senha");
            String sexo = request.getParameter("sexo");
            String email = request.getParameter("email");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("estado");
            String estados = request.getParameter("estados");
            Estado est = new Estado();
            est.setNomEstado(estado);
            est.setSigla(estados);
            Cidade cid = new Cidade();
            cid.setNomCidade(cidade);
            cid.setEstado(est);
            Usuario usuario = new Usuario();
            usuario.setNomUsuario(nome);
            usuario.setSobrenomeUsuario(sobrenome);
            usuario.setDatNascimento(data);
            usuario.setTxtSenha(senha);
            usuario.setSexo(sexo);
            usuario.setTxtEmail(email);
            usuario.setCidade(cid);
            usuario.setImgPerfil(null);
            usuario.setCodUsuario(null);
            ManterUsuario usu = new ManterUsuario();
            Long cadastrar = usu.cadastrar(usuario);
        } catch (ExcecaoPersistencia | ExcecaoNegocio ex) {
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       return "index.jsp";
    }
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}

