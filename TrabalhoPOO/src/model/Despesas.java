/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enuns.Despesa;
import java.time.LocalDate;

/**
 *
 * @author pedro
 */
public class Despesas extends Lancamento {

    private Despesa despesa;

     public Despesas(
            Double valor,
            LocalDate data,
            Despesa despesa
    ) {
        super(valor, data);
        this.despesa = despesa;
    }
    
    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }

   

}
