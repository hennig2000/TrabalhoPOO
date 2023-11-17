/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import enuns.Receitas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class DataBase {
   
        
        public void insereTexto(Lancamento lancamento) {
        
        try (PrintWriter escreveCSV = new PrintWriter(new FileWriter("C:\\Pedro\\POO_Trabalho\\TrabalhoPOO\\TrabalhoPOO\\db\\lancamentos.txt", true))) {
            
            String dateFormatted = lancamento.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            if(lancamento instanceof Despesa){
                escreveCSV.println("D;" + lancamento.getValor() + ";" + dateFormatted + ";" + ((Despesa) lancamento).getDespesa());
            } else if(lancamento instanceof Receita){
                escreveCSV.println("R;" + lancamento.getValor() + ";" + dateFormatted + ";" + ((Receita) lancamento).getReceita());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
    

    
}
