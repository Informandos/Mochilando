/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

/**
 *
 * @author Juliana
 */
public class Atracao {
    
    private String codAtracaoVisitada;
    private String codTipoAtracao;
    private String codEstadoAtracao;
    private String desAtracao;
    private double nroLatitude;
    private double nroLongitude;

    public Atracao() {
    }

    public Atracao(String codAtracaoVisitada, String codTipoAtracao, String codEstadoAtracao, String desAtracao, double nroLatitude, double nroLongitude) {
        this.codAtracaoVisitada = codAtracaoVisitada;
        this.codTipoAtracao = codTipoAtracao;
        this.codEstadoAtracao = codEstadoAtracao;
        this.desAtracao = desAtracao;
        this.nroLatitude = nroLatitude;
        this.nroLongitude = nroLongitude;
    }
    

    /**
     * @return the codAtracaoVisitada
     */
    public String getCodAtracaoVisitada() {
        return codAtracaoVisitada;
    }

    /**
     * @param codAtracaoVisitada the codAtracaoVisitada to set
     */
    public void setCodAtracaoVisitada(String codAtracaoVisitada) {
        this.codAtracaoVisitada = codAtracaoVisitada;
    }

    /**
     * @return the codTipoAtracao
     */
    public String getCodTipoAtracao() {
        return codTipoAtracao;
    }

    /**
     * @param codTipoAtracao the codTipoAtracao to set
     */
    public void setCodTipoAtracao(String codTipoAtracao) {
        this.codTipoAtracao = codTipoAtracao;
    }

    /**
     * @return the codEstadoAtracao
     */
    public String getCodEstadoAtracao() {
        return codEstadoAtracao;
    }

    /**
     * @param codEstadoAtracao the codEstadoAtracao to set
     */
    public void setCodEstadoAtracao(String codEstadoAtracao) {
        this.codEstadoAtracao = codEstadoAtracao;
    }

    /**
     * @return the desAtracao
     */
    public String getDesAtracao() {
        return desAtracao;
    }

    /**
     * @param desAtracao the desAtracao to set
     */
    public void setDesAtracao(String desAtracao) {
        this.desAtracao = desAtracao;
    }

    /**
     * @return the nroLatitude
     */
    public double getNroLatitude() {
        return nroLatitude;
    }

    /**
     * @param nroLatitude the nroLatitude to set
     */
    public void setNroLatitude(double nroLatitude) {
        this.nroLatitude = nroLatitude;
    }

    /**
     * @return the nroLongitude
     */
    public double getNroLongitude() {
        return nroLongitude;
    }

    /**
     * @param nroLongitude the nroLongitude to set
     */
    public void setNroLongitude(double nroLongitude) {
        this.nroLongitude = nroLongitude;
    }
    
}
