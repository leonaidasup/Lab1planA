/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.calculator.front.Componets;

import com.mycompany.calculator.back.ElementalFunctions.ObjectFuntioncs;

/**
 *
 * @author Jhomar_Arrieta
 * 
 */
public class Object2Panel extends javax.swing.JPanel {

    /**
     * Creates new form Object2Panel
     */
    public Object2Panel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dato1 = new javax.swing.JTextField();
        dato2 = new javax.swing.JTextField();
        concatenarButton = new javax.swing.JButton();
        resultadoComparar = new javax.swing.JLabel();
        CompararButton = new javax.swing.JButton();
        resultadoConcatenar = new javax.swing.JLabel();
        criterio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Primer dato");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Segundo dato");

        dato1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dato2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        concatenarButton.setBackground(new java.awt.Color(142, 205, 221));
        concatenarButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        concatenarButton.setText("Concatenar");
        concatenarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concatenarButtonActionPerformed(evt);
            }
        });

        resultadoComparar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultadoComparar.setText(".");

        CompararButton.setBackground(new java.awt.Color(142, 205, 221));
        CompararButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CompararButton.setText("Comparar");
        CompararButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompararButtonActionPerformed(evt);
            }
        });

        resultadoConcatenar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultadoConcatenar.setText(".");

        criterio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        criterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iguales?", "diferentes?" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Criterio de comparación");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Resultado:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(dato1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(92, 92, 92)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(dato2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(concatenarButton)
                                .addGap(207, 207, 207))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CompararButton)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(criterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resultadoConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 140, Short.MAX_VALUE))
                            .addComponent(resultadoComparar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(concatenarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(resultadoConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(criterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CompararButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(resultadoComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void concatenarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concatenarButtonActionPerformed
        String var1 = dato1.getText();
        String var2 = dato2.getText();
        
        String resultado = ObjectFuntioncs.concatenation(var1, var2);
        
        resultadoConcatenar.setText(resultado);
        
    }//GEN-LAST:event_concatenarButtonActionPerformed

    private void CompararButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompararButtonActionPerformed
        String var1 = dato1.getText();
        String var2 = dato2.getText();
        String comparacion = criterio.getSelectedItem().toString();
        boolean resultado;
        
        if (comparacion.equals("iguales?")){
            resultado = ObjectFuntioncs.equal(var1, var2);
        }
        else{
            resultado = ObjectFuntioncs.different(var1, var2);
        }
        
        resultadoComparar.setText("" + resultado);
        
    }//GEN-LAST:event_CompararButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CompararButton;
    private javax.swing.JButton concatenarButton;
    private javax.swing.JComboBox<String> criterio;
    private javax.swing.JTextField dato1;
    private javax.swing.JTextField dato2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel resultadoComparar;
    private javax.swing.JLabel resultadoConcatenar;
    // End of variables declaration//GEN-END:variables
}
