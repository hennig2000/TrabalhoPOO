/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 *
 * @author pedro
 */
public class DataOrdenador implements Comparator<Lancamento> {
    
    @Override
    public int compare(Lancamento l1, Lancamento l2) {
      return l2.getData().compareTo(l1.getData());
    }
    
}
