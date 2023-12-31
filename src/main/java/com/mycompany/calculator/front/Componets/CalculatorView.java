/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculator.front.Componets;
import java.awt.BorderLayout;
/**
 *
 * @author Jhomar_Arrieta
 */
public class CalculatorView extends javax.swing.JFrame {
    /**
     * Creates new form CalculatorView
     */
    public CalculatorView() {
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

        jPanel1 = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        arithmeticButton = new javax.swing.JButton();
        booleanButton = new javax.swing.JButton();
        ObjectButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        byteButton1 = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(142, 205, 221));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arithmeticButton.setBackground(new java.awt.Color(34, 102, 141));
        arithmeticButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        arithmeticButton.setForeground(new java.awt.Color(255, 255, 255));
        arithmeticButton.setText("Aritmeticos");
        arithmeticButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        arithmeticButton.setBorderPainted(false);
        arithmeticButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        arithmeticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arithmeticButtonActionPerformed(evt);
            }
        });
        menuPanel.add(arithmeticButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 40));

        booleanButton.setBackground(new java.awt.Color(34, 102, 141));
        booleanButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        booleanButton.setForeground(new java.awt.Color(255, 255, 255));
        booleanButton.setText("Booleanos");
        booleanButton.setBorderPainted(false);
        booleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booleanButtonActionPerformed(evt);
            }
        });
        menuPanel.add(booleanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, 40));

        ObjectButton.setBackground(new java.awt.Color(34, 102, 141));
        ObjectButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ObjectButton.setForeground(new java.awt.Color(255, 255, 255));
        ObjectButton.setText("de Objetos");
        ObjectButton.setBorderPainted(false);
        ObjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjectButtonActionPerformed(evt);
            }
        });
        menuPanel.add(ObjectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TIPOS DE DATOS");
        menuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CALCULADORA");
        menuPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        byteButton1.setBackground(new java.awt.Color(34, 102, 141));
        byteButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        byteButton1.setForeground(new java.awt.Color(255, 255, 255));
        byteButton1.setText("de Bytes");
        byteButton1.setBorderPainted(false);
        byteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byteButton1ActionPerformed(evt);
            }
        });
        menuPanel.add(byteButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 160, 40));

        jPanel1.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 410));

        contentPanel.setBackground(new java.awt.Color(255, 250, 221));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 510, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arithmeticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arithmeticButtonActionPerformed
        ArithmeticPanel aritPanel = new ArithmeticPanel();
        aritPanel.setSize(510,410);
        aritPanel.setLocation(0,0);    
        contentPanel.removeAll();
        contentPanel.add(aritPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_arithmeticButtonActionPerformed

    private void booleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booleanButtonActionPerformed
        BooleanPanel boolPanel = new BooleanPanel();
        boolPanel.setSize(510,410);
        boolPanel.setLocation(0,0);      
        contentPanel.removeAll();
        contentPanel.add(boolPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_booleanButtonActionPerformed

    private void ObjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjectButtonActionPerformed
        ObjectPanel obPanel = new ObjectPanel();
        obPanel.setSize(510,410);
        obPanel.setLocation(0,0);      
        contentPanel.removeAll();
        contentPanel.add(obPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_ObjectButtonActionPerformed

    private void byteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byteButton1ActionPerformed
        BytePanel obPanel = new BytePanel();
        obPanel.setSize(510,410);
        obPanel.setLocation(0,0); 
        contentPanel.removeAll();
        contentPanel.add(obPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_byteButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ObjectButton;
    private javax.swing.JButton arithmeticButton;
    private javax.swing.JButton booleanButton;
    private javax.swing.JButton byteButton1;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
