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
public class Despesa extends Lancamento {

    private Gastos gasto;

     public Despesa(
            Double valor,
            LocalDate data,
            Gastos gasto
    ) {
        super(valor, data);
        this.gasto = gasto;
    }
    
    public Gastos getGasto() {
        return gasto;
    }

    public void setGasto(Gastos gasto) {
        this.gasto = gasto;
    }

   

}
