/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gsaporiti
 */
public class EntregaBean implements Serializable{
    
    private int idEntrega;
    private Date dataEntrega;
    private String enderecoEntrega;
    private String destinatario;
    private String descricao;
    private double valor;
    private String motivoNaoRealizada;
   
    public EntregaBean (){
    }
    
    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }
    
    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
    
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinarario) {
        this.destinatario = destinatario;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getMotivoNaoRealizada() {
        return motivoNaoRealizada;
    }

    public void setMotivoNaoRealizada(String motivoNaoRealizada) {
        this.motivoNaoRealizada = motivoNaoRealizada;
    }
}
