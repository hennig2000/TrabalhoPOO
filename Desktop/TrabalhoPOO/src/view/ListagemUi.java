package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import model.Despesa;
import model.Lancamento;
import model.Receita;

public class ListagemUi extends javax.swing.JDialog {

 DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 
    public ListagemUi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taRelatorio = new javax.swing.JTextArea();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taRelatorio.setColumns(20);
        taRelatorio.setRows(5);
        jScrollPane1.setViewportView(taRelatorio);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btFecharActionPerformed

    public void listarReceita(ArrayList<Lancamento> receita) {
        int index = 1;
        taRelatorio.setText("                          ***** Todas as Receitas *****\n");
        for (Lancamento receita1 : receita) {
            if (receita1 instanceof Receita) {
                taRelatorio.append("------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                taRelatorio.append("Receita número: " + index + "\n");
                taRelatorio.append("Receita: " + ((Receita) receita1).getReceita() + "\n");
                taRelatorio.append("Data :" + formatoData.format(receita1.getData()) + "\n");
                taRelatorio.append("Valor :" + receita1.getValor().toString() + "\n");
                index += 1;
            }
        }
    }

    public void listarDespesas(ArrayList<Lancamento> despesa) {

        int index = 1;
        taRelatorio.setText("                          ***** Todas as Despesas *****\n");
        for (Lancamento despesaLinha : despesa) {
            if (despesaLinha instanceof Despesa) {
                taRelatorio.append("------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                taRelatorio.append("Despesa número: " + index + "\n");
                taRelatorio.append("Despesa: " + ((Despesa) despesaLinha).getDespesas() + "\n");
                taRelatorio.append("Data :" + formatoData.format(despesaLinha.getData()) + "\n");
                taRelatorio.append("Valor :" + despesaLinha.getValor().toString() + "\n");
                index += 1;
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListagemUi dialog = new ListagemUi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taRelatorio;
    // End of variables declaration//GEN-END:variables

}
