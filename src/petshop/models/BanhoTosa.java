/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop.models;

import java.time.LocalDateTime;

/**
 *
 * @author Vinicius
 */
public class BanhoTosa {
    
    private int id;
    private String descricao;
    private Animal animalBanhoTosa;
    private LocalDateTime data;
    private double valorBanhoTosa;

    public BanhoTosa() {
    }

    public BanhoTosa(int id, String descricao, Animal animalBanhoTosa, LocalDateTime data, double valorBanhoTosa) {
        this.id = id;
        this.descricao = descricao;
        this.animalBanhoTosa = animalBanhoTosa;
        this.data = data;
        this.valorBanhoTosa = valorBanhoTosa;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Animal getAnimalBanhoTosa() {
        return animalBanhoTosa;
    }

    public void setAnimalBanhoTosa(Animal animalBanhoTosa) {
        this.animalBanhoTosa = animalBanhoTosa;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorBanhoTosa() {
        return valorBanhoTosa;
    }

    public void setValorBanhoTosa(double valorBanhoTosa) {
        this.valorBanhoTosa = valorBanhoTosa;
    }
    
    

    @Override
    public String toString() {
        return "BanhoTosa{" + "id=" + id + ", descricao=" + descricao + ", animalBanhoTosa=" + animalBanhoTosa + ", data=" + data + '}';
    }
    
    
    
}
