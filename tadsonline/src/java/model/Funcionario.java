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
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author Gustavo-Kamila
 */
@javax.persistence.Entity
@javax.persistence.Table(name="tb_funcionario")
@AssociationOverrides({
		@AssociationOverride(name = "tb_cargo", 
			joinColumns = @JoinColumn(name = "idCargo"))})
public class Funcionario implements Serializable{
    private Integer idFunc;
    private String cpf;
    private String nome;
    private String endereco;
    private Integer cidade;
    private String email;
    private String telefone;
    private String telefoneAlt;
    private Cargo cargo;
    private String login;
    private String senha;

    public Funcionario() {
    }

    @Id
    public Integer getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(Integer idFunc) {
        this.idFunc = idFunc;
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

    @ManyToOne
    @JoinColumn(name = "idCargo", referencedColumnName = "idCargo")
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
