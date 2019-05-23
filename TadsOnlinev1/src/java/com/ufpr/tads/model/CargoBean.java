/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.model;

import java.io.Serializable;

/**
 *
 * @author gsaporiti
 */
public class CargoBean implements Serializable{
    
    private int idCargo;
    private String descricao;
    private double salario;
    
    public CargoBean (){
        
    }
    
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
    
}
