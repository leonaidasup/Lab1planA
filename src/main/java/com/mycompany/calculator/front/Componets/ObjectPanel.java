/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.calculator.front.Componets;

import java.awt.BorderLayout;

/**
 *
 * @author Jhomar_Arrieta
 */
public class ObjectPanel extends javax.swing.JPanel {

    /**
     * Creates new form ObjectPanel
     */
    public ObjectPanel() {
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

        ConTernarioButton = new javax.swing.JButton();
        OpBasicasButton = new javax.swing.JButton();
        ObPanelContent = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 250, 221));

        ConTernarioButton.setBackground(new java.awt.Color(142, 205, 221));
        ConTernarioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConTernarioButton.setText("Condicional Ternario");
        ConTernarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConTernarioButtonActionPerformed(evt);
            }
        });

        OpBasicasButton.setBackground(new java.awt.Color(142, 205, 221));
        OpBasicasButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OpBasicasButton.setText("Operaciones básicas");
        OpBasicasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpBasicasButtonActionPerformed(evt);
            }
        });

        ObPanelContent.setBackground(new java.awt.Color(255, 250, 221));

        javax.swing.GroupLayout ObPanelContentLayout = new javax.swing.GroupLayout(ObPanelContent);
        ObPanelContent.setLayout(ObPanelContentLayout);
        ObPanelContentLayout.setHorizontalGroup(
            ObPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ObPanelContentLayout.setVerticalGroup(
            ObPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(OpBasicasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(ConTernarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(ObPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConTernarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpBasicasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ObPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ConTernarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConTernarioButtonActionPerformed
        // TODO add your handling code here:
        TernarioPanel terPanel = new TernarioPanel();
        terPanel.setSize(510,340);
        terPanel.setLocation(0,0);
        
        ObPanelContent.removeAll();
        ObPanelContent.add(terPanel, BorderLayout.CENTER);
        ObPanelContent.revalidate();
        ObPanelContent.repaint();
    }//GEN-LAST:event_ConTernarioButtonActionPerformed

    private void OpBasicasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpBasicasButtonActionPerformed
        Object2Panel obPanel = new Object2Panel();
        obPanel.setSize(510,340);
        obPanel.setLocation(0,0);
        
        ObPanelContent.removeAll();
        ObPanelContent.add(obPanel, BorderLayout.CENTER);
        ObPanelContent.revalidate();
        ObPanelContent.repaint();
    }//GEN-LAST:event_OpBasicasButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConTernarioButton;
    private javax.swing.JPanel ObPanelContent;
    private javax.swing.JButton OpBasicasButton;
    // End of variables declaration//GEN-END:variables
}
