/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

/**
 *
 * @author Gustavo-Kamila
 */
@javax.persistence.Entity
@javax.persistence.Table(name="tb_entrega")
@AssociationOverrides({
		@AssociationOverride(name = "tb_funcionario", 
			joinColumns = @JoinColumn(name = "idFunc")),
                @AssociationOverride(name = "tb_status_entrega", 
			joinColumns = @JoinColumn(name = "idStatus"))})
public class Entrega implements Serializable{
    Integer idEntrega;
    Date dataEntrega;
    String enderecoEntrega;
    String destinatario;
    String descricao;
    Double valor;
    String motivo;
    Funcionario idFunc;
    StatusEntrega idStatusEntrega;

    public Entrega() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Integer idEntrega) {
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

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Transient
    public Funcionario getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(Funcionario idFunc) {
        this.idFunc = idFunc;
    }

    @Transient
    public StatusEntrega getIdStatusEntrega() {
        return idStatusEntrega;
    }

    public void setIdStatusEntrega(StatusEntrega idStatusEntrega) {
        this.idStatusEntrega = idStatusEntrega;
    }    
    
}
