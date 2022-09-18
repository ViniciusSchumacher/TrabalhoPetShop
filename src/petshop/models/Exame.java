/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class Exame {
    
    private int id;
    private String descricao;
    private double valorExame;
    private Animal animalExame;
    private LocalDateTime dataExame;

    public Exame() {
    }

    public Exame(int id, String descricao, double valorExame, Animal animalExame, LocalDateTime dataExame) {
        this.id = id;
        this.descricao = descricao;
        this.valorExame = valorExame;
        this.animalExame = animalExame;
        this.dataExame = dataExame;
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

    public double getValorExame() {
        return valorExame;
    }

    public void setValorExame(double valorExame) {
        this.valorExame = valorExame;
    }

    public Animal getAnimalExame() {
        return animalExame;
    }

    public void setAnimalExame(Animal animalExame) {
        this.animalExame = animalExame;
    }

    public LocalDateTime getDataExame() {
        return dataExame;
    }

    public void setDataExame(LocalDateTime dataExame) {
        this.dataExame = dataExame;
    }

    
    
    @Override
    public String toString() {
        return "\nDescricao: " + descricao + "\n";
    }
    
    
    
}
