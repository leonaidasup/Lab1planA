/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.calculator.front.Componets;
import com.mycompany.calculator.back.ElementalFunctions.BooleanFunctions;

/**
 *
 * @author ASUS
 */
public class BooleanPanel extends javax.swing.JPanel {

    /**
     * Creates new form BooleanPanel
     */
    public BooleanPanel() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resultadoA = new javax.swing.JLabel();
        andButton = new javax.swing.JButton();
        NegacionButton = new javax.swing.JButton();
        orButton = new javax.swing.JButton();
        productoButton = new javax.swing.JButton();
        sumaButton = new javax.swing.JButton();
        sumaExButton = new javax.swing.JButton();
        valor1 = new javax.swing.JComboBox<>();
        valor2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 221));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Primer valor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Segundo valor");

        resultadoA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultadoA.setText(".");

        andButton.setBackground(new java.awt.Color(142, 205, 221));
        andButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        andButton.setText("Y");

        NegacionButton.setBackground(new java.awt.Color(142, 205, 221));
        NegacionButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NegacionButton.setText("Negacion");
        NegacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegacionButtonActionPerformed(evt);
            }
        });

        orButton.setBackground(new java.awt.Color(142, 205, 221));
        orButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        orButton.setText("O");

        productoButton.setBackground(new java.awt.Color(142, 205, 221));
        productoButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productoButton.setText("Producto");

        sumaButton.setBackground(new java.awt.Color(142, 205, 221));
        sumaButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sumaButton.setText("Suma");

        sumaExButton.setBackground(new java.awt.Color(142, 205, 221));
        sumaExButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sumaExButton.setText("Suma exclusiva");

        valor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));

        valor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NegacionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sumaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(andButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sumaExButton)
                            .addComponent(orButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(resultadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valor1)
                    .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NegacionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumaExButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NegacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegacionButtonActionPerformed
        String var1 = valor1.getSelectedItem().toString();
        String var2 = valor2.getSelectedItem().toString();
        
        boolean b1 = Boolean.parseBoolean(var1);
        boolean b2 = Boolean.parseBoolean(var2);
        
        

    }//GEN-LAST:event_NegacionButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NegacionButton;
    private javax.swing.JButton andButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton orButton;
    private javax.swing.JButton productoButton;
    private javax.swing.JLabel resultadoA;
    private javax.swing.JButton sumaButton;
    private javax.swing.JButton sumaExButton;
    private javax.swing.JComboBox<String> valor1;
    private javax.swing.JComboBox<String> valor2;
    // End of variables declaration//GEN-END:variables
}
