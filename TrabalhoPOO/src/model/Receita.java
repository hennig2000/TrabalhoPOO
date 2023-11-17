/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import model.Lancamento;
import enuns.Receitas;

/**
 *
 * @author pedro
 */
public class Receita extends Lancamento {

    private Receitas receita;

    public Receita(
            Double valor,
            LocalDate date,
            Receitas receita
    ) {
        super(valor, date);
        this.receita = receita;
    }

    
    public Receitas getReceita() {
        return receita;
    }

    public void setReceita(Receitas receita) {
        this.receita = receita;
    }

}
