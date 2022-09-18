/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop.models;

import petshop.models.ENUM.TipoAnimalEnum;

/**
 *
 * @author Vinicius
 */
public class Animal {
    
    private String nome;
    private TipoAnimalEnum tipoAnimal;
    private ProprietarioAnimal donoAnimal;

    public Animal() {
    }

    public Animal(String nome, TipoAnimalEnum tipoAnimal, ProprietarioAnimal donoAnimal) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.donoAnimal = donoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAnimalEnum getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimalEnum tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public ProprietarioAnimal getDonoAnimal() {
        return donoAnimal;
    }

    public void setDonoAnimal(ProprietarioAnimal donoAnimal) {
        this.donoAnimal = donoAnimal;
    }

    @Override
    public String toString() {
        return "\nnome:" + nome + "\ntipoAnimal:" + tipoAnimal + "\ndonoAnimal:" + donoAnimal + "\n";
    }
    
    
    
}
