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
 * Esta classe representa uma receita para controle de gastos
 * @author Pedro Hennig 
 * @author Pedro Henrique Teloeken de Souza
 * @author Ralf Iran Domingues
 */
public class Receita extends Lancamento {

    private Receitas receita;
    
     /**
     * Construtor da classe Receita, ele é responsável por iniciar o objeto receita
     *
     * @param valor o valor que foi ganho de receita
     * @param data a data de lançamento desse ganho
     * @param receita tipo de receita para registro
     */

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
