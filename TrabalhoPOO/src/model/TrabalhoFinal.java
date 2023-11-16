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

        Despesas despesa = new Despesas(500.0, LocalDate.now(), Despesa.SAUDE);
        Despesas despesa1 = new Despesas(500.0, LocalDate.of(2024, Month.MARCH, 15), Despesa.SAUDE);
        Despesas despesa2 = new Despesas(500.0, LocalDate.now(), Despesa.TRANSPORTE);
        Despesas despesa3 = new Despesas(0.0, LocalDate.now(), Despesa.ALIMENTACAO);

        conta.inserirDespesa(despesa);
        conta.inserirDespesa(despesa1);
        conta.inserirDespesa(despesa2);
        conta.inserirDespesa(despesa3);

        ArrayList<Lancamento> topDespesas = conta.getDespesas();

        for (Lancamento l : topDespesas) {
            if (l instanceof Despesas) {
                System.out.println(l.getValor());
                System.out.println(l.getData());
                System.out.println(((Despesas) l).getGasto());
            }

        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        Lancamento receita = new Recebimentos(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.SALARIO);
        Lancamento receita1 = new Recebimentos(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.FERIAS);
        Lancamento receita2 = new Recebimentos(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.OUTRAS);
        Lancamento receita3 = new Recebimentos(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.DECIME_TERCEIRO);
        Lancamento receita4 = new Recebimentos(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Recebimento.SALARIO);

        conta.inserirReceita(receita);
        conta.inserirReceita(receita1);
        conta.inserirReceita(receita2);
        conta.inserirReceita(receita3);
        conta.inserirReceita(receita4);

        ArrayList<Lancamento> receitas = conta.getReceita();

        for (Lancamento l : receitas) {
            System.out.println(l.getValor());
            System.out.println(l.getData());
            System.out.println(((Recebimentos) l).getRecebimento());

        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        System.out.println(conta.getSaldoAtual());

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        conta.getSaldoTotal();

        System.out.println(conta.getSaldoTotal());

    }

}
