/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop.models;

/**
 *
 * @author Vinicius
 */
public class Medico {
 
    private String nome;
    private String crmv;
    private Endereco endereco;
    private String contato;

    public Medico() {
    }

    public Medico(String nome, String crmv, Endereco endereco, String contato) {
        this.nome = nome;
        this.crmv = crmv;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Medico{" + "\nnome:" + nome + "\ncrmv:" + crmv + "\nendereco:" + endereco + "\ncontato:" + contato;
    }
 
    
    
}
