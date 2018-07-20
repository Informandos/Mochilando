/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.util.Date;

/**
 *
 * @author Juliana
 */
public class Comentario {
    private String codDiario;
    private String codAutorComentario;
    private String codComentario;
    private Date datPublicacao;
    private String txtComentario;

    public Comentario() {
    }

    public Comentario(String codDiario, String codAutorComentario, String codComentario, Date datPublicacao, String txtComentario) {
        this.codDiario = codDiario;
        this.codAutorComentario = codAutorComentario;
        this.codComentario = codComentario;
        this.datPublicacao = datPublicacao;
        this.txtComentario = txtComentario;
    }
    
    

    /**
     * @return the codDiario
     */
    public String getCodDiario() {
        return codDiario;
    }

    /**
     * @param codDiario the codDiario to set
     */
    public void setCodDiario(String codDiario) {
        this.codDiario = codDiario;
    }

    /**
     * @return the codAutorComentario
     */
    public String getCodAutorComentario() {
        return codAutorComentario;
    }

    /**
     * @param codAutorComentario the codAutorComentario to set
     */
    public void setCodAutorComentario(String codAutorComentario) {
        this.codAutorComentario = codAutorComentario;
    }

    /**
     * @return the datPublicacao
     */
    public Date getDatPublicacao() {
        return datPublicacao;
    }

    /**
     * @param datPublicacao the datPublicacao to set
     */
    public void setDatPublicacao(Date datPublicacao) {
        this.datPublicacao = datPublicacao;
    }

    /**
     * @return the txtComentario
     */
    public String getTxtComentario() {
        return txtComentario;
    }

    /**
     * @param txtComentario the txtComentario to set
     */
    public void setTxtComentario(String txtComentario) {
        this.txtComentario = txtComentario;
    }

    /**
     * @return the codComentario
     */
    public String getCodComentario() {
        return codComentario;
    }

    /**
     * @param codComentario the codComentario to set
     */
    public void setCodComentario(String codComentario) {
        this.codComentario = codComentario;
    }

}
