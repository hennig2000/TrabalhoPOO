package model;

import enuns.Receitas;
import enuns.Despesas;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * Esta classe representa uma interface para teste das demais classes
 *
 * @author Pedro Hennig
 * @author Pedro Henrique Teloeken de Souza
 * @author Ralf Iran Domingues
 */
public class TrabalhoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conta conta = new Conta();

        Despesa despesa = new Despesa(500.0, LocalDate.now(), Despesas.SAUDE);
        Despesa despesa1 = new Despesa(500.0, LocalDate.of(2024, Month.MARCH, 15), Despesas.SAUDE);
        Despesa despesa2 = new Despesa(500.0, LocalDate.now(), Despesas.TRANSPORTE);
        Despesa despesa3 = new Despesa(0.0, LocalDate.now(), Despesas.ALIMENTACAO);

        conta.inserirDespesa(despesa);
        conta.inserirDespesa(despesa1);
        conta.inserirDespesa(despesa2);
        conta.inserirDespesa(despesa3);

        ArrayList<Lancamento> topDespesas = conta.getDespesas();

        /*
        for (Lancamento l : topDespesas) {
            if (l instanceof Despesa) {
                System.out.println(l.getValor());
                System.out.println(l.getData());
                System.out.println(((Despesa) l).getDespesas());
            }

        }
         */
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        Lancamento receita = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Receitas.SALARIO);
        Lancamento receita1 = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Receitas.FERIAS);
        Lancamento receita2 = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Receitas.OUTRAS);
        Lancamento receita3 = new Receita(1000.0, LocalDate.of(2023, Month.NOVEMBER, 15), Receitas.DECIMO_TERCEIRO);
        Lancamento receita4 = new Receita(2500.0, LocalDate.of(2023, Month.NOVEMBER, 15), Receitas.SALARIO);

        conta.inserirReceita(receita);
        conta.inserirReceita(receita1);
        conta.inserirReceita(receita2);
        conta.inserirReceita(receita3);
        conta.inserirReceita(receita4);

        ArrayList<Lancamento> receitas = conta.getReceita();

        for (Lancamento l : receitas) {
            System.out.println(l.getValor());
            System.out.println(l.getData());
            System.out.println(((Receita) l).getReceita());
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("");

        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        System.out.println(conta.getSaldoAtual());

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        conta.getSaldoTotal();

        System.out.println(conta.getSaldoTotal());

    }
}
