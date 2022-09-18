/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop.models;

/**
 *
 * @author Vinicius
 */
public class Medicamento {
    
    private String nome;
    private String descricao;
    private int id;
    private double valorMedicamento;
    private boolean disponibilidade;
    private int qtd;

    public Medicamento() {
    }

    public Medicamento(String nome, String descricao, int id, double valorMedicamento, boolean disponibilidade, int qtd) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
        this.valorMedicamento = valorMedicamento;
        this.disponibilidade = disponibilidade;
        this.qtd = qtd;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorMedicamento() {
        return valorMedicamento;
    }

    public void setValorMedicamento(double valorMedicamento) {
        this.valorMedicamento = valorMedicamento;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }


    @Override
    public String toString() {
        return "\nNome: " + nome + "\n";
    }
    
    
    
    
}
