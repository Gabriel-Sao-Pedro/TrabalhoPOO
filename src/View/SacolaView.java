/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author User
 */
public class SacolaView extends javax.swing.JFrame {

    /**
     * Creates new form Carrinho
     */
    public SacolaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSacola = new javax.swing.JTable();
        Sacola = new javax.swing.JLabel();
        AddProduto = new javax.swing.JButton();
        FinCompra = new javax.swing.JButton();
        ValorTotal = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        Codigo = new javax.swing.JLabel();
        Quantidade = new javax.swing.JLabel();
        ValorTotal1 = new javax.swing.JLabel();
        jTextFieldValorTotal1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });

        jTableSacola.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableSacola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Long.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableSacola);

        Sacola.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Sacola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sacola.setText("Sacola");

        AddProduto.setText("Adicionar");
        AddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProdutoActionPerformed(evt);
            }
        });

        FinCompra.setText("Finalizar Compra");
        FinCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinCompraActionPerformed(evt);
            }
        });

        ValorTotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ValorTotal.setText("Valor Total :  R$");

        jTextFieldValorTotal.setEditable(false);
        jTextFieldValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalActionPerformed(evt);
            }
        });

        Codigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Codigo.setText("Codigo");

        Quantidade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Quantidade.setText("Quantidade");

        ValorTotal1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ValorTotal1.setText("CPF:");

        jTextFieldValorTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sacola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(ValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorTotal1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddProduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FinCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(467, 467, 467))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Sacola, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProduto))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(ValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorTotal1))
                .addGap(18, 18, 18)
                .addComponent(FinCompra)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed

    private void AddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddProdutoActionPerformed

    private void FinCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FinCompraActionPerformed

    private void jTextFieldValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorTotalActionPerformed

    private void jTextFieldValorTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorTotal1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SacolaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SacolaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SacolaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SacolaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SacolaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProduto;
    private javax.swing.JLabel Codigo;
    private javax.swing.JButton FinCompra;
    private javax.swing.JLabel Quantidade;
    private javax.swing.JLabel Sacola;
    private javax.swing.JLabel ValorTotal;
    private javax.swing.JLabel ValorTotal1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableSacola;
    public javax.swing.JTextField jTextFieldCodigo;
    public javax.swing.JTextField jTextFieldQuantidade;
    public javax.swing.JTextField jTextFieldValorTotal;
    public javax.swing.JTextField jTextFieldValorTotal1;
    // End of variables declaration//GEN-END:variables
}
