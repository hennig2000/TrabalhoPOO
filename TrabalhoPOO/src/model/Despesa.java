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
 *
 * @author pedro
 */
public class Despesa extends Lancamento {

    private Despesas despesas;

    public Despesa(
            Double valor,
            LocalDate data,
            Despesas gasto
    ) {
        super(valor, data);
        this.despesas = gasto;
    }

    public Despesas getDespesas() {
        return despesas;
    }

    public void setDespesas(Despesas gasto) {
        this.despesas = gasto;
    }

}
