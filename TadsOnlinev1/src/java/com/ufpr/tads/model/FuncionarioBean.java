/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.model;

import java.io.Serializable;
//import java.util.List;

/**
 *
 * @author gsaporiti
 */
public class FuncionarioBean implements Serializable{
   private long id;
   private String cpf;
   private String nome;
   private String endereco;
   private String cidade;
   private String telefone;
   private String telefoneAlternativo;
   
   private CargoBean cargo;
   
   public FuncionarioBean() {
   
   }
   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getTelefone() {
       return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     public String getTelefoneAlternativo() {
       return telefoneAlternativo;
    }

    public void setTelefoneAlternativo(String telefoneAlternativo) {
        this.telefoneAlternativo = telefoneAlternativo;
    }
    
    public CargoBean getCargoBean() {
        return cargo;
    }

    public void setCargoBean(CargoBean cargo) {
        this.cargo = cargo;
    }
}
