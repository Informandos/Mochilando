/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.domain.Comentario;
import model.excecao.ExcessaoPersistencia;
import persistencia.*;

/**
 *
 * @author Juliana
 */
public class ComentarioDAO {

    private static ComentarioDAO comentarioDAO = null;

    public static ComentarioDAO getInstance(){
        if (comentarioDAO == null) {
            comentarioDAO = new ComentarioDAO();
        }
        return comentarioDAO;
    }  
    
    public Long insert(Comentario comentario) throws ExcessaoPersistencia {
        if (comentario == null) {
            throw new ExcessaoPersistencia("Comentario nao pode ser null");
        }
        Long seqComentario = null;
        
        try {
            Connection conexao;
            conexao = GerenciadorConexao.getInstance().getConexao();

            String sql = "INSERT INTO comentario "
                    + "(CodDiario, DatPublicacao, CodUsuario, TXT_comentario) "
                    + "    VALUES (?, ?, ?, ?) returning codComentario;";

            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, comentario.getCodDiario());
            pstmt.setDate(2, (Date) comentario.getDatPublicacao());
            pstmt.setString(3, comentario.getCodAutorComentario());
            pstmt.setString(4, comentario.getTxtComentario());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                seqComentario = rs.getLong("codComentario");
            }

            rs.close();
            pstmt.close();
            conexao.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ComentarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return seqComentario;
    }

    @Override
    public boolean update(Comentario comentario) throws ExcessaoPersistencia {
        try {

            Connection conexao = GerenciadorConexao.getInstance().getConexao();

            String sql = "UPDATE comentario "
                    + " SET COD_IDUser = ?,"
                    + "     TXT_comentario = ?,"
                    + " WHERE COD_questao = ? AND COD_discussao = ? AND SEQ_comentario = ?;";

            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setLong(1, comentario.getUserId());
            pstmt.setString(2, comentario.getTextComentario());
            pstmt.setLong(3, comentario.getQuestionId());
            pstmt.setLong(4, comentario.getDiscussionId());
            pstmt.setLong(5, comentario.getComentarioSeq());
            pstmt.executeUpdate();

            pstmt.close();
            conexao.close();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcessaoPersistencia(e);
        }        
    }

    @Override
    public boolean remove(Long COD_questao, Long COD_discussao, Long comentarioSeq) throws ExcessaoPersistencia {
        try {
            Connection conexao = GerenciadorConexao.getInstance().getConexao();

            String sql = "DELETE FROM comentario "
                    + "WHERE COD_questao = ? AND COD_discussao = ? AND SEQ_comentario = ?;";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setLong(1, COD_questao);
            pstmt.setLong(2, COD_discussao);
            pstmt.setLong(3, comentarioSeq);
            pstmt.executeUpdate();

            pstmt.close();
            conexao.close();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcessaoPersistencia(e);
        }
    }

    @Override
    public Comentario getComentarioBySeq(Long COD_questao, Long COD_discussao, Long comentarioSeq) throws ExcessaoPersistencia {
        try {
            Connection conexao = GerenciadorConexao.getInstance().getConexao();

            String sql = "SELECT * FROM comentario WHERE COD_questao = ? AND COD_discussao = ? AND SEQ_comentario = ?;";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setLong(1, COD_questao);
            pstmt.setLong(2, COD_discussao);
            pstmt.setLong(3, comentarioSeq);
            ResultSet rs = pstmt.executeQuery();

            Comentario comentario = new Comentario();
            if (rs.next()) {
                comentario.setQuestionId(COD_questao);
                comentario.setDiscussionId(COD_discussao);
                comentario.setComentarioSeq(comentarioSeq);
                comentario.setUserId(rs.getLong("COD_IDUser"));
                comentario.setTextComentario(rs.getString("TXT_comentario"));
            }

            rs.close();
            pstmt.close();
            conexao.close();

            return comentario;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcessaoPersistencia(e);
        }
    }
    
    @Override
    public List<Comentario> getCommentariesByForumId(Long forumId, Long questionId) throws ExcessaoPersistencia{
        try {
            Connection conexao = GerenciadorConexao.getInstance().getConexao();
            List<Comentario> list = new ArrayList<>();
            
            String sql = "SELECT * FROM comentary "
                    + "WHERE COD_discussao = ? AND COD_questao = ?"
                    + "ORDER BY SEQ_comentario";

            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setLong(1, forumId);
            pstmt.setLong(2, questionId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                do {
                    Comentario comentario = new Comentario();
                    comentario.setQuestionId(questionId);
                    comentario.setDiscussionId(forumId);
                    comentario.setComentarioSeq(rs.getLong("SEQ_comentario"));
                    comentario.setUserId(rs.getLong("COD_userId"));
                    comentario.setTextComentario(rs.getString("TXT_comentario"));
                    
                    list.add(comentario);
                } while (rs.next());
            }

            rs.close();
            pstmt.close();
            conexao.close();

            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcessaoPersistencia(e);
        }
    }
 
    public List<Comentario> listAll() throws ExcessaoPersistencia {
        try {    
            Connection conexao = GerenciadorConexao.getInstance().getConexao();

            ArrayList<Comentario> list = null;
            
            String sql = "SELECT * FROM comentario ORDER BY SEQ_comentario;";

            PreparedStatement pstmt = conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Comentario> listAll = null;
            Comentario comentario = null;
            
            if (rs.next()) {
                list = new ArrayList<>();
                do{
                    comentario.setQuestionId(rs.getLong("COD_questao"));
                    comentario.setDiscussionId(rs.getLong("COD_discussao"));
                    comentario.setComentarioSeq(rs.getLong("COD_comentario"));
                    comentario.setUserId(rs.getLong("COD_IDUser"));
                    comentario.setTextComentario(rs.getString("TXT_comentario"));
                    
                    list.add(comentario);
                } while (rs.next());
            }
            
            rs.close();
            pstmt.close();
            conexao.close();

            return listAll;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcessaoPersistencia(e);
        }
    }    

}