/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enuns.Despesas;
import java.time.LocalDate;
import model.Lancamento;

/**
 * Esta classe representa uma despesa para controle de gastos
 * @author Pedro Hennig 
 * @author Pedro Henrique Teloeken de Souza
 * @author Ralf Iran Domingues
 */
public class Despesa extends Lancamento {

    private Despesas despesas;

    
    /**
     * Construtor da classe Desoesa, ele é responsável por iniciar o objeto despesa
     *
     * @param valor o valor que foi despesa de despesa
     * @param data a data de lançamento desse despesa
     * @param despesas tipo de despesa para registro
     */
    
    public Despesa(
            Double valor,
            LocalDate data,
            Despesas despesas
    ) {
        super(valor, data);
        this.despesas = despesas;
    }

    public Despesas getDespesas() {
        return despesas;
    }

    public void setDespesas(Despesas gasto) {
        this.despesas = gasto;
    }

}
