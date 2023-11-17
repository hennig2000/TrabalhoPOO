/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Conta;
import model.Despesas;
import model.Lancamento;
import enuns.Receita;

public class AppUi extends javax.swing.JFrame {

    Conta conta = new Conta();

    public AppUi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPLancamentos = new javax.swing.JPanel();
        btIncluirReceita = new javax.swing.JButton();
        btIncluirDespesa = new javax.swing.JButton();
        jPConsultas = new javax.swing.JPanel();
        btLimpar = new javax.swing.JButton();
        lbResultado = new javax.swing.JLabel();
        btSaldoAtual = new javax.swing.JButton();
        btSaldoPeriodo = new javax.swing.JButton();
        jPListagem = new javax.swing.JPanel();
        btListarLancamentos = new javax.swing.JButton();
        btListarDespesas = new javax.swing.JButton();
        btListarReceitas = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Lançamentos");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPLancamentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Lançamentos"));

        btIncluirReceita.setText("Incluir Receita");
        btIncluirReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirReceitaActionPerformed(evt);
            }
        });

        btIncluirDespesa.setText("Incluir Despesa");
        btIncluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPLancamentosLayout = new javax.swing.GroupLayout(jPLancamentos);
        jPLancamentos.setLayout(jPLancamentosLayout);
        jPLancamentosLayout.setHorizontalGroup(
            jPLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLancamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIncluirReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btIncluirDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPLancamentosLayout.setVerticalGroup(
            jPLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLancamentosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluirReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btIncluirDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSaldoAtual.setText("Consultar Saldo Atual");
        btSaldoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoAtualActionPerformed(evt);
            }
        });

        btSaldoPeriodo.setText("Consultar Saldo De Todo Periodo");
        btSaldoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoPeriodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPConsultasLayout = new javax.swing.GroupLayout(jPConsultas);
        jPConsultas.setLayout(jPConsultasLayout);
        jPConsultasLayout.setHorizontalGroup(
            jPConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSaldoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(lbResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSaldoPeriodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPConsultasLayout.setVerticalGroup(
            jPConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSaldoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPListagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Listagem"));

        btListarLancamentos.setText("Listar Lançamentos");
        btListarLancamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListarLancamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarLancamentosActionPerformed(evt);
            }
        });

        btListarDespesas.setText("Listar Despesas");
        btListarDespesas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarDespesasActionPerformed(evt);
            }
        });

        btListarReceitas.setText("Listar Receitas");
        btListarReceitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarReceitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPListagemLayout = new javax.swing.GroupLayout(jPListagem);
        jPListagem.setLayout(jPListagemLayout);
        jPListagemLayout.setHorizontalGroup(
            jPListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btListarLancamentos)
                .addGap(12, 12, 12)
                .addComponent(btListarReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btListarDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPListagemLayout.setVerticalGroup(
            jPListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListagemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarLancamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btListarLancamentos.getAccessibleContext().setAccessibleDescription("");
        btListarDespesas.getAccessibleContext().setAccessibleDescription("");
        btListarReceitas.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPLancamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPLancamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed

        lbResultado.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btIncluirReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirReceitaActionPerformed

        IncluirReceita incluirReceita = new IncluirReceita(this, true);

        incluirReceita.setVisible(true);
        
        Receita receita = incluirReceita.getReceitas();
        
        if(receita != null){
            
        }


    }//GEN-LAST:event_btIncluirReceitaActionPerformed

    private void btIncluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirDespesaActionPerformed

        IncluirDespesa incluirDespesa = new IncluirDespesa(this, true);

        incluirDespesa.setVisible(true);
    }//GEN-LAST:event_btIncluirDespesaActionPerformed

    private void btSaldoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoPeriodoActionPerformed

        lbResultado.setText("Saldo De Todo Perido: ");

    }//GEN-LAST:event_btSaldoPeriodoActionPerformed

    private void btListarLancamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarLancamentosActionPerformed

        ListagemUi telaListagem = new ListagemUi(this, true);

        telaListagem.setVisible(true);

    }//GEN-LAST:event_btListarLancamentosActionPerformed

    private void btListarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarDespesasActionPerformed

        ListagemUi telaListagem = new ListagemUi(this, true);

        telaListagem.setVisible(true);
    }//GEN-LAST:event_btListarDespesasActionPerformed

    private void btListarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarReceitasActionPerformed

        ListagemUi telaListagem = new ListagemUi(this, true);

        telaListagem.setVisible(true);
    }//GEN-LAST:event_btListarReceitasActionPerformed

    private void btSaldoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoAtualActionPerformed

        lbResultado.setText("Saldo Atual: ");


    }//GEN-LAST:event_btSaldoAtualActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluirDespesa;
    private javax.swing.JButton btIncluirReceita;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListarDespesas;
    private javax.swing.JButton btListarLancamentos;
    private javax.swing.JButton btListarReceitas;
    private javax.swing.JButton btSaldoAtual;
    private javax.swing.JButton btSaldoPeriodo;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPConsultas;
    private javax.swing.JPanel jPLancamentos;
    private javax.swing.JPanel jPListagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbResultado;
    // End of variables declaration//GEN-END:variables
}
