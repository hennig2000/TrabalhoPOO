package view;

import enuns.Despesas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.Conta;
import model.Despesa;
import model.DataBase;

public class IncluirDespesa extends javax.swing.JDialog {
    
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public IncluirDespesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbData = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        lbValor = new javax.swing.JLabel();
        rbAlimentacao = new javax.swing.JRadioButton();
        rbResidencia = new javax.swing.JRadioButton();
        rbTransporte = new javax.swing.JRadioButton();
        rbSaude = new javax.swing.JRadioButton();
        tfValor = new javax.swing.JTextField();
        rbEducacao = new javax.swing.JRadioButton();
        rbEntretenimento = new javax.swing.JRadioButton();
        rbOutras = new javax.swing.JRadioButton();
        btConfirmar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesa");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Despesa"));

        lbData.setText("Data ");

        tfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataActionPerformed(evt);
            }
        });

        lbValor.setText("Valor");

        buttonGroup1.add(rbAlimentacao);
        rbAlimentacao.setText("Alimentação");
        rbAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlimentacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbResidencia);
        rbResidencia.setText("Residencia");

        buttonGroup1.add(rbTransporte);
        rbTransporte.setText("Transporte");
        rbTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTransporteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSaude);
        rbSaude.setText("Saúde");

        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEducacao);
        rbEducacao.setText("Educação");
        rbEducacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEducacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEntretenimento);
        rbEntretenimento.setText("Entretenimento");

        buttonGroup1.add(rbOutras);
        rbOutras.setText("Outras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbData)
                    .addComponent(lbValor)
                    .addComponent(rbAlimentacao)
                    .addComponent(rbTransporte))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbResidencia)
                            .addComponent(rbSaude))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbEducacao)
                                .addGap(44, 44, 44)
                                .addComponent(rbOutras))
                            .addComponent(rbEntretenimento)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(tfData, javax.swing.GroupLayout.Alignment.LEADING))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAlimentacao)
                    .addComponent(rbResidencia)
                    .addComponent(rbEducacao)
                    .addComponent(rbOutras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTransporte)
                    .addComponent(rbSaude)
                    .addComponent(rbEntretenimento))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataActionPerformed

    }//GEN-LAST:event_tfDataActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed

    }//GEN-LAST:event_tfValorActionPerformed

    private void rbAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlimentacaoActionPerformed

    }//GEN-LAST:event_rbAlimentacaoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        setVisible(false);

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed

        Despesas despesa = null;

        if (rbEntretenimento.isSelected()) {
            despesa = Despesas.ENTRETERIMENTO;
        } else if (rbAlimentacao.isSelected()) {
            despesa = Despesas.ALIMENTACAO;
        } else if (rbResidencia.isSelected()) {
            despesa = Despesas.RESIDENCIA;
        } else if (rbEducacao.isSelected()) {
            despesa = Despesas.EDUCACAO;
        } else if (rbOutras.isSelected()) {
            despesa = Despesas.OUTRAS;
        } else if (rbTransporte.isSelected()) {
            despesa = Despesas.TRANSPORTE;
        } else if (rbSaude.isSelected()) {
            despesa = Despesas.SAUDE;
        } 
        
        
        LocalDate data = LocalDate.parse(tfData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        double valor = Double.parseDouble(tfValor.getText());
        
        conta.inserirDespesa(new Despesa(valor, data, despesa));
        
        setVisible(false);

    }//GEN-LAST:event_btConfirmarActionPerformed

    private void rbEducacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEducacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEducacaoActionPerformed

    private void rbTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTransporteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IncluirDespesa dialog = new IncluirDespesa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbValor;
    private javax.swing.JRadioButton rbAlimentacao;
    private javax.swing.JRadioButton rbEducacao;
    private javax.swing.JRadioButton rbEntretenimento;
    private javax.swing.JRadioButton rbOutras;
    private javax.swing.JRadioButton rbResidencia;
    private javax.swing.JRadioButton rbSaude;
    private javax.swing.JRadioButton rbTransporte;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
