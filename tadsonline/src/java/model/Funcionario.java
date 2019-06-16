/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

/**
 *
 * @author Gustavo-Kamila
 */
@javax.persistence.Entity
@javax.persistence.Table(name="Funcionario")
@AssociationOverrides({
		@AssociationOverride(name = "Cargo", 
			joinColumns = @JoinColumn(name = "idCargo"))})
public class Funcionario implements Serializable{
    private String cpf;
    private String nome;
    private String endereco;
    private Integer cidade;
    private String email;
    private String telefone;
    private String telefoneAlt;
    private Cargo cargo;

    public Funcionario() {
    }

    @Id
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

    public Integer getCidade() {
        return cidade;
    }

    public void setCidade(Integer cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefoneAlt() {
        return telefoneAlt;
    }

    public void setTelefoneAlt(String telefoneAlt) {
        this.telefoneAlt = telefoneAlt;
    }

    @Transient
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    
}
