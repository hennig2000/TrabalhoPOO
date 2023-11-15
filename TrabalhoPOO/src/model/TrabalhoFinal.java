/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class TrabalhoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Conta conta = new Conta();
        
        Lancamento despesa = new Despesa(5589.75, LocalDate.now(), Gastos.SAUDE);
        Despesa despesa1 = new Despesa(5589.75, LocalDate.now(), Gastos.SAUDE);
        Despesa despesa2 = new Despesa(1200.50, LocalDate.now(), Gastos.TRANSPORTE);
        Despesa despesa3 = new Despesa(300.00, LocalDate.now(), Gastos.ALIMENTACAO);
        
        conta.inserirDespesa(despesa);
        conta.inserirDespesa(despesa1);
        conta.inserirDespesa(despesa2);
        conta.inserirDespesa(despesa3);
        
        ArrayList<Lancamento> topDespesas = conta.getDespesas();
        
        for(Lancamento l : topDespesas){
            System.out.println(l.getValor());
                        System.out.println(l.getData());
                           // System.out.println(l.getGasto());
                        
        }
        
                        System.out.println("+++++++++++++++++++++++++++++++++++++");

        Lancamento receita = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.SALARIO);
        Lancamento receita1 = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.FERIAS);
        Lancamento receita2 = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.OUTRAS);
        Lancamento receita3 = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.DECIME_TERCEIRO);
        Lancamento receita4 = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.SALARIO);
        
        conta.inserirReceita(receita);
        conta.inserirReceita(receita1);
        conta.inserirReceita(receita2);
        conta.inserirReceita(receita3);
        conta.inserirReceita(receita4);

        
        ArrayList<Lancamento> receitas = conta.getReceita();
        
        for(Lancamento l : receitas){
            System.out.println(l.getValor());
                        System.out.println(l.getData());
                            System.out.println(l);
                        
        }
        
    }

}
