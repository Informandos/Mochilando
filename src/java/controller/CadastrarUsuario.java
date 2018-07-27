/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.domain.Usuario;
import model.service.implementacao.ManterUsuario;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;
/**
 *
 * @author User
 */
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String jsp = "";
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String data = request.getParameter("data");
        String senha = request.getParameter("senha");
        String sexo = request.getParameter("sexo");
        String email = request.getParameter("email");
         Usuario usuario = new Usuario();
         usuario.setNomUsuario(nome);
         usuario.setSobrenomeUsuario(sobrenome);
         usuario.setDatNascimento(data);
         usuario.setTxtSenha(senha);
         usuario.setSexo(sexo);
         usuario.setTxtEmail(email);
         ManterUsuario usu = new ManterUsuario();
        try {
            usu.cadastrar(usuario);
            jsp = "/Login.jsp";
        } catch (ExcecaoPersistencia | ExcecaoNegocio ex) {
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
         request.getRequestDispatcher(jsp);
           
       
    }

   

}