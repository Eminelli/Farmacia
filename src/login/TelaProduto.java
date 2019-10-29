/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 30136
 */
public class TelaProduto extends javax.swing.JFrame {
    CadastroSucesso cs = null;
    RemoverProduto rp = null;
    /**
     * Creates new form Tela
     */
    public TelaProduto() {
        initComponents(); 
        this.setLocationRelativeTo(null); /*Tela aparecer no meio do monitor*/
        Confirmar.setFocusPainted(false);
        Remover.setFocusPainted(false);
        quantidade.setDocument(new TeclasPermitidas());
        preco.setDocument(new TeclasPermitidas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        produto = new javax.swing.JTextField();
        quantidade = new javax.swing.JTextField();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        ano = new javax.swing.JComboBox<>();
        preco = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Remover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(630, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 174, 95));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/package.png"))); // NOI18N
        jLabel4.setText(" Cadastro de produtos");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close (1).png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        produto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        produto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 51)));
        produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtoMouseClicked(evt);
            }
        });
        jPanel2.add(produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 129, 199, -1));

        quantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 51)));
        quantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantidadeMouseClicked(evt);
            }
        });
        quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantidadeKeyTyped(evt);
            }
        });
        jPanel2.add(quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 132, 183, -1));

        dia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15", "14", "13", "12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01" }));
        dia.setBorder(null);
        jPanel2.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 197, 56, 19));

        mes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01" }));
        mes.setBorder(null);
        jPanel2.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 197, 56, 19));

        ano.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020" }));
        ano.setBorder(null);
        jPanel2.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 197, 56, 19));

        preco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        preco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 51)));
        preco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precoMouseClicked(evt);
            }
        });
        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });
        preco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoKeyTyped(evt);
            }
        });
        jPanel2.add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 195, 199, -1));

        descricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 51)));
        descricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descricaoMouseClicked(evt);
            }
        });
        jPanel2.add(descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 260, 488, -1));

        Confirmar.setBackground(new java.awt.Color(168, 224, 99));
        Confirmar.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-check-icon-26.png"))); // NOI18N
        Confirmar.setText("Confirmar");
        Confirmar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmarMouseExited(evt);
            }
        });
        jPanel2.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 425, 128, 34));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Nome:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 132, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Quantidade:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 132, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Preço:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 198, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Descrição:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 263, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Validade:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 198, -1, -1));

        Remover.setBackground(new java.awt.Color(255, 51, 51));
        Remover.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        Remover.setForeground(new java.awt.Color(255, 255, 255));
        Remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_white_24x24.png"))); // NOI18N
        Remover.setText("Remover");
        Remover.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RemoverMouseExited(evt);
            }
        });
        jPanel2.add(Remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 425, 128, 34));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 630, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseExited
        Remover.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_RemoverMouseExited

    private void RemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseEntered
        Remover.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_RemoverMouseEntered

    private void RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseClicked
        if(rp == null){
        rp = new RemoverProduto();
        }
        rp.setVisible(true);
    }//GEN-LAST:event_RemoverMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseExited
       Confirmar.setBackground(new Color (168,224,99));
    }//GEN-LAST:event_ConfirmarMouseExited

    private void ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseEntered
       Confirmar.setBackground(new Color(169,255,109));
    }//GEN-LAST:event_ConfirmarMouseEntered

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        if (produto.getText().equals("") || quantidade.getText().equals("") || preco.getText().equals("") ||
        ano.getSelectedItem().equals("Ano") || mes.getSelectedItem().equals("Mês") || dia.getSelectedItem().equals("Dia") || descricao.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Um campo ou mais está vazio!");
        
        }else{
        ProdutosC Produtos = new ProdutosC();
        Produtos.nomep = produto.getText();
        Produtos.quantidade = Integer.parseInt(quantidade.getText().toString());
        Produtos.preco = Integer.parseInt(preco.getText());;
        Produtos.ano = ano.getSelectedItem().toString();
        Produtos.mes = mes.getSelectedItem().toString();
        Produtos.dia = dia.getSelectedItem().toString();
        String dataSQL = Produtos.ano+"-"+Produtos.mes+"-"+Produtos.dia;
        Produtos.validade = dataSQL;
        Produtos.descricao = descricao.getText();
        Produtos.gravap(); 
        
        if (cs == null){
        cs = new CadastroSucesso();
        }
        cs.setVisible(true);
        }
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void descricaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descricaoMouseClicked
       descricao.setText("");
    }//GEN-LAST:event_descricaoMouseClicked

    private void precoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoKeyTyped
       
    }//GEN-LAST:event_precoKeyTyped

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoActionPerformed

    private void precoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precoMouseClicked
        
    }//GEN-LAST:event_precoMouseClicked

    private void quantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeKeyTyped
           
    }//GEN-LAST:event_quantidadeKeyTyped

    private void quantidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantidadeMouseClicked
        quantidade.setText("");
    }//GEN-LAST:event_quantidadeMouseClicked

    private void produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoMouseClicked
        produto.setText("");
    }//GEN-LAST:event_produtoMouseClicked

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JButton Remover;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JTextField descricao;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField produto;
    private javax.swing.JTextField quantidade;
    // End of variables declaration//GEN-END:variables
}
