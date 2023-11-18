package model;

import enuns.Despesas;
import enuns.Receitas;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DataBase {

    public void insereTexto(Lancamento lancamento) {

        try ( PrintWriter escreveCSV = new PrintWriter(new FileWriter("C:\\Data\\data.csv", true))) {

            String dateFormatted = lancamento.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            String novaLina = "";

            if (lancamento instanceof Despesa) {
                novaLina = "D;" + lancamento.getValor() + ";" + dateFormatted + ";" + ((Despesa) lancamento).getDespesas() + "\n";
            } else if (lancamento instanceof Receita) {
                novaLina = "R;" + lancamento.getValor() + ";" + dateFormatted + ";" + ((Receita) lancamento).getReceita() + "\n";
            }

            escreveCSV.write(novaLina);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Lancamento> lerAerquivoCsv() {
        File file = new File("C:\\Data\\data.csv");
        ArrayList<Lancamento> lancamento = new ArrayList<>();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try ( Scanner lerFile = new Scanner(file, "UTF-8")) {

            while (lerFile.hasNextLine()) {
                String novaLinha = lerFile.nextLine();
                String[] dados = novaLinha.split(";");

                if (dados[0].equals("D")) {
                    lancamento.add(new Despesa(Double.parseDouble(dados[1]), LocalDate.parse(dados[2], formatador), Despesas.valueOf(dados[3])));
                }

                if (dados[0].equals("R")) {
                    lancamento.add(new Receita(Double.parseDouble(dados[1]), LocalDate.parse(dados[2], formatador), Receitas.valueOf(dados[3])));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lancamento;

    }

}
