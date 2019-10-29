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
public class TelaCadastro extends javax.swing.JFrame {
    CadastroSucesso cs = null;
    RemoverCliente rc = null;
    /**
     * Creates new form Tela
     */
    public TelaCadastro() {
        initComponents(); 
        this.setLocationRelativeTo(null); /*Tela aparecer no meio do monitor*/
        Confirmar.setFocusPainted(false);
        Remover.setFocusPainted(false);
        cpf.setDocument(new TeclasPermitidas());
        rg.setDocument(new TeclasPermitidas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        F = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        ano = new javax.swing.JComboBox<>();
        rg = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Remover = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 540));
        setUndecorated(true);
        setSize(new java.awt.Dimension(630, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(630, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 51)));
        nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeMouseClicked(evt);
            }
        });
        jPanel2.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 212, 206, -1));

        cpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 51)));
        cpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpfMouseClicked(evt);
            }
        });
        cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfKeyTyped(evt);
            }
        });
        jPanel2.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 216, 216, -1));

        F.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(F);
        F.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        F.setForeground(new java.awt.Color(153, 153, 153));
        F.setText(" Feminino");
        jPanel2.add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 334, 90, 20));

        M.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(M);
        M.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        M.setForeground(new java.awt.Color(153, 153, 153));
        M.setText(" Masculino");
        jPanel2.add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 333, -1, 20));

        dia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15", "14", "13", "12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01" }));
        dia.setBorder(null);
        jPanel2.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 279, 56, 19));

        mes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01" }));
        mes.setBorder(null);
        jPanel2.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 279, 56, 19));

        ano.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "2019", "2017", "2018", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2003", "2004", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930" }));
        ano.setBorder(null);
        jPanel2.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 279, 56, 19));

        rg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 51)));
        rg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rgMouseClicked(evt);
            }
        });
        rg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rgKeyTyped(evt);
            }
        });
        jPanel2.add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 279, 205, -1));

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 51)));
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 333, 207, -1));

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
        jPanel2.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 475, 128, 34));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Nome:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 215, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("CPF:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 219, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("RG:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 280, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sexo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 335, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Email:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 336, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Nascimento:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 280, 70, -1));

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
        jPanel2.add(Remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 475, 128, 34));

        jPanel1.setBackground(new java.awt.Color(52, 174, 95));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/team (2).png"))); // NOI18N
        jLabel1.setText("  Cadastro de clientes");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeMouseClicked
        nome.setText("");
    }//GEN-LAST:event_nomeMouseClicked

    private void cpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpfMouseClicked
        cpf.setText("");
    }//GEN-LAST:event_cpfMouseClicked

    private void rgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgMouseClicked
        rg.setText("");
    }//GEN-LAST:event_rgMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setText("");
    }//GEN-LAST:event_emailMouseClicked

    private void ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseEntered
        Confirmar.setBackground(new Color(169,255,109));
    }//GEN-LAST:event_ConfirmarMouseEntered

    private void ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseExited
        Confirmar.setBackground(new Color (168,224,99));
    }//GEN-LAST:event_ConfirmarMouseExited

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
    if (nome.getText().equals("") || cpf.getText().equals("") || rg.getText().equals("") ||
        ano.getSelectedItem().equals("Ano") || mes.getSelectedItem().equals("Mês") || dia.getSelectedItem().equals("Dia") || !M.isSelected() && !F.isSelected()){
        JOptionPane.showMessageDialog(null,"Um campo ou mais está vazio!");
                
    }else{
        CadastroS Cadastro = new CadastroS();
        Cadastro.nomec = nome.getText();
        Cadastro.rg = rg.getText();
        Cadastro.cpf = cpf.getText();
        Cadastro.ano = ano.getSelectedItem().toString();
        Cadastro.mes = mes.getSelectedItem().toString();
        Cadastro.dia = dia.getSelectedItem().toString();
        String dataSQL = Cadastro.ano+"-"+Cadastro.mes+"-"+Cadastro.dia;
        Cadastro.datac = dataSQL;
        if (M.isSelected()) {
            Cadastro.sexo = "M";
        }
        if (F.isSelected()) {
            Cadastro.sexo = "F";
        }
        Cadastro.email = email.getText();     
       
        Cadastro.gravac();   
        if (cs == null){
        cs = new CadastroSucesso();
        }
        cs.setVisible(true);
    }
    
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void cpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfKeyTyped
        int maxn=13;
        if (cpf.getText().length()>maxn) {
        evt.consume();
        JOptionPane.showMessageDialog(rootPane,"Utilize apenas números e caracteres presentes em seu CPF!");
        }
    }//GEN-LAST:event_cpfKeyTyped

    private void rgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgKeyTyped
      int maxn=11;
        if (rg.getText().length()>maxn) {

            evt.consume();

            JOptionPane.showMessageDialog(rootPane,"Utilize apenas números e caracteres presentes no seu RG!");
}  
    }//GEN-LAST:event_rgKeyTyped

    private void RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseClicked
        if(rc == null){
        rc = new RemoverCliente();
        }
        rc.setVisible(true);
    }//GEN-LAST:event_RemoverMouseClicked

    private void RemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseEntered
        Remover.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_RemoverMouseEntered

    private void RemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseExited
        Remover.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_RemoverMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton M;
    private javax.swing.JButton Remover;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cpf;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    // End of variables declaration//GEN-END:variables
}
