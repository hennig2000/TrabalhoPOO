/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Esta classe representa uma lançamento para controle de gastos
 * @author Pedro Hennig 
 * @author Pedro Henrique Teloeken de Souza
 * @author Ralf Iran Domingues
 */
public abstract class Lancamento {
    
    
    /**
     * Construtor da classe Lancamento
     *
     * @param valor o valor de lançamento
     * @param data a data de lançamento
     * 
     */
    
    public Lancamento(Double valor , LocalDate data){
         this.valor = valor;
         this.data = data;
    }
    
    private Double valor;
    private LocalDate data;
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

   
}
