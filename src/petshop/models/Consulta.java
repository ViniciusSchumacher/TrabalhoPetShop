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
public class Consulta {
    
    private int id;
    private String descricao;
    private Animal animalConsulta;
    private Medico medicoConsulta;
    private ArrayList<Medicamento> medicamentoConsulta;
    private ArrayList<Exame> exameConsulta;
    private ArrayList<Vacina> vacinaConsulta;
    private double valorConsulta;
    private LocalDateTime dataConsulta;
    private double valorTotal;
    private LocalDateTime dataProximaConsulta;
    
    public void CalculoVlrTotal(){
        valorTotal = valorTotal + valorConsulta;
        
        for (int i = 0; i < medicamentoConsulta.size(); i++) {
            valorTotal = valorTotal + (medicamentoConsulta.get(i).getValorMedicamento());
        }
        
        for (int i = 0; i < exameConsulta.size(); i++) {
            valorTotal = valorTotal + (exameConsulta.get(i).getValorExame());
        }
        
        for (int i = 0; i < vacinaConsulta.size(); i++) {
            valorTotal = valorTotal + (vacinaConsulta.get(i).getValorVacina());
        }
        
    }

    public Consulta() {
        this.exameConsulta = new ArrayList<>();
        this.medicamentoConsulta = new ArrayList<>();
        this.vacinaConsulta = new ArrayList<>();
    }
    
    public ArrayList<Exame> ExameConsulta() {
        return exameConsulta;
    }
    
    public ArrayList<Medicamento> MedicamentoConsulta() {
        return medicamentoConsulta;
    }
    
    public ArrayList<Vacina> VacinaConsulta() {
        return vacinaConsulta;
    }

    public Consulta(int id, String descricao, Animal animalConsulta, Medico medicoConsulta, ArrayList<Medicamento> medicamentoConsulta, ArrayList<Exame> exameConsulta, ArrayList<Vacina> vacinaConsulta, double valorConsulta, LocalDateTime dataConsulta, LocalDateTime dataProximaConsulta) {
        this.id = id;
        this.descricao = descricao;
        this.animalConsulta = animalConsulta;
        this.medicoConsulta = medicoConsulta;
        this.medicamentoConsulta = medicamentoConsulta;
        this.exameConsulta = exameConsulta;
        this.vacinaConsulta = vacinaConsulta;
        this.valorConsulta = valorConsulta;
        this.dataConsulta = dataConsulta;
        this.dataProximaConsulta = dataProximaConsulta;
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

    public Animal getAnimalConsulta() {
        return animalConsulta;
    }

    public void setAnimalConsulta(Animal animalConsulta) {
        this.animalConsulta = animalConsulta;
    }

    public Medico getMedicoConsulta() {
        return medicoConsulta;
    }

    public void setMedicoConsulta(Medico medicoConsulta) {
        this.medicoConsulta = medicoConsulta;
    }

    public ArrayList<Medicamento> getMedicamentoConsulta() {
        return medicamentoConsulta;
    }

    public void setMedicamentoConsulta(ArrayList<Medicamento> medicamentoConsulta) {
        this.medicamentoConsulta = medicamentoConsulta;
    }

    public ArrayList<Exame> getExameConsulta() {
        return exameConsulta;
    }

    public void setExameConsulta(ArrayList<Exame> exameConsulta) {
        this.exameConsulta = exameConsulta;
    }

    public ArrayList<Vacina> getVacinaConsulta() {
        return vacinaConsulta;
    }

    public void setVacinaConsulta(ArrayList<Vacina> vacinaConsulta) {
        this.vacinaConsulta = vacinaConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataProximaConsulta() {
        return dataProximaConsulta;
    }

    public void setDataProximaConsulta(LocalDateTime dataProximaConsulta) {
        this.dataProximaConsulta = dataProximaConsulta;
    }

    
    @Override
    public String toString() {
        return "Consulta" + "\nid:" + id + "\ndescricao:" + descricao + "\nanimalConsulta:" + animalConsulta + "\nmedicoConsulta:" + medicoConsulta + "\nmedicamentoConsulta:" + medicamentoConsulta + "\nexameConsulta:" + exameConsulta + "\nvacinaConsulta:" + vacinaConsulta + "\nvalorConsulta:" + valorConsulta + "\ndataConsulta:" + dataConsulta + "\nvalorTotal:" + valorTotal;
    }
    
}
