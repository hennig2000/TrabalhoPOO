/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author pedro
 */
public abstract class Lancamento {
    
    public Lancamento(Double valor , LocalDate data){
         this.valor = valor;
         this.data = data;
    }
    
    private Double valor;
    private LocalDate data;
    //private Gastos gasto;
    //private Receita receita;

    /*
    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Gastos getGasto() {
        return gasto;
    }

    public void setGasto(Gastos gasto) {
        this.gasto = gasto;
    }
    */
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
