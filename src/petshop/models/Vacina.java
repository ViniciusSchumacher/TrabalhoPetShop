/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop.models;

/**
 *
 * @author Vinicius
 */
public class Vacina {
    
    private String nomeVacina;
    private String descricao;
    private double valorVacina;
    private int id;
    private boolean disponibilidade;
    private int qtd;

    public Vacina() {
    }

    public Vacina(String nomeVacina, String descricao, double valorVacina, int id, boolean disponibilidade, int qtd) {
        this.nomeVacina = nomeVacina;
        this.descricao = descricao;
        this.valorVacina = valorVacina;
        this.id = id;
        this.disponibilidade = disponibilidade;
        this.qtd = qtd;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorVacina() {
        return valorVacina;
    }

    public void setValorVacina(double valorVacina) {
        this.valorVacina = valorVacina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "\nNome: " + nomeVacina + "\n";
    }


    
}
