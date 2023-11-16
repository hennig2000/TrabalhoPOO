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
public class Recebimentos extends Lancamento {

    private Recebimento recebimento;

    public Recebimentos(
            Double valor,
            LocalDate date,
            Recebimento recebimento
    ) {
        super(valor, date);
        this.recebimento = recebimento;
    }

    
    public Recebimento getRecebimento() {
        return recebimento;
    }

    public void setRecebimento(Recebimento recebimento) {
        this.recebimento = recebimento;
    }

}
