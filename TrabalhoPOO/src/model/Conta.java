package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Esta classe representa uma Conta para controle de gastos
 * @author Pedro Hennig 
 * @author Pedro Henrique Teloeken de Souza
 * @author Ralf Iran Domingues
 */
public class Conta {

    DataBase dataBase = new DataBase();

    private double saldoTotal;
    private double saldoAtual;

    private ArrayList<Lancamento> lancamento = new ArrayList<>();

    public ArrayList<Lancamento> getLancamento() {
        return lancamento;
    }

    public void setLancamento(ArrayList<Lancamento> lancamento) {
        this.lancamento = lancamento;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     * Construtor da classe conta, ele é responsável por iniciar a conta
     * trazendo do arquivo cvs os Lançamentos já cadastrados, além disso seta o
     * valor do saldo total e atual.
     *
     */
    public Conta() {
        setLancamento(dataBase.lerAerquivoCsv());
        setSaldoTotal();
        setSaldoAtual();
    }

    
    private void setSaldoTotal() {
        ArrayList<Lancamento> receita = getReceita();
        Double saldoAtualCalculo = 0.0;
        for (Lancamento saldo : receita) {
            if (saldo instanceof Receita) {
                saldoAtualCalculo += saldo.getValor();
            }
        }
        Conta.this.setSaldoTotal(saldoAtualCalculo - getDespesasTotal());
    }

    public Double getDespesasTotal() {
        ArrayList<Lancamento> despesas = getDespesas();

        Double despesasTotais = 0.0;

        for (Lancamento l : despesas) {
            if (l instanceof Despesa) {
                despesasTotais += l.getValor();
            }
        }
        return despesasTotais;
    }

    public Double getDespesasAtuais() {
        ArrayList<Lancamento> despesas = getDespesas();

        Double despesasAtuais = 0.0;

        for (Lancamento l : despesas) {
            if (l instanceof Despesa) {
                if (l.getData().isBefore(LocalDate.now()) || l.getData().equals(LocalDate.now())) {
                    despesasAtuais += l.getValor();
                }
            }
        }
        return despesasAtuais;
    }

    private void setSaldoAtual() {
        ArrayList<Lancamento> receita = getReceita();
        Double saldoAtualCalculo = 0.0;
        for (Lancamento saldo : receita) {
            if (saldo instanceof Receita) {
                if (saldo.getData().isBefore(LocalDate.now()) || saldo.getData().equals(LocalDate.now())) {
                    saldoAtualCalculo += saldo.getValor();
                }
            }
        }

        this.saldoAtual = saldoAtualCalculo - getDespesasAtuais();
    }

    public ArrayList<Lancamento> getReceita() {

        ArrayList<Lancamento> receita = new ArrayList<>();

        for (Lancamento lancamento : this.lancamento) {
            if (lancamento instanceof Receita) {
                receita.add(lancamento);
            }
        }
        return receita;
    }

    public void inserirReceita(Lancamento receita) {
        if (receita instanceof Receita) {
            lancamento.add(receita);
            dataBase.insereTexto(receita);
        } else {
            throw new IllegalArgumentException("Não é uma instancia de Receita");
        }
        setSaldoTotal();
        setSaldoAtual();
    }

    public ArrayList<Lancamento> getDespesas() {
        ArrayList<Lancamento> despesa = new ArrayList<>();
        for (Lancamento lancamento : this.lancamento) {
            if (lancamento instanceof Despesa) {
                despesa.add(lancamento);
            }
        }
        return despesa;
    }

    public void inserirDespesa(Lancamento despesa) {
        if (despesa instanceof Despesa) {
            lancamento.add(despesa);
            dataBase.insereTexto(despesa);

        } else {
            throw new IllegalArgumentException("Não é uma instancia de Despesa");
        }
    }

}
