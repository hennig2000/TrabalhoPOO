/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
            Despesa gasto
    ) {
        super(valor, data);
        this.despesa = gasto;
    }
    
    public Despesa getGasto() {
        return despesa;
    }

    public void setGasto(Despesa gasto) {
        this.despesa = gasto;
    }

   

}
