/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.calculator.front.Componets;

/**
 *
 * @author ASUS
 */
public class BytePanel extends javax.swing.JPanel {

    /**
     * Creates new form BytePanel
     */
    public BytePanel() {
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

        cambiarBitsButton = new javax.swing.JButton();
        desplazarIzqButton = new javax.swing.JButton();
        desplazarDerSignoButton = new javax.swing.JButton();
        desplazarDerCeroButton = new javax.swing.JButton();
        cambiarBitsAndButton = new javax.swing.JButton();
        cambiarBitsOrButton = new javax.swing.JButton();
        cambiarBitsOrxButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        num2 = new javax.swing.JTextField();
        resultadoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 221));

        cambiarBitsButton.setBackground(new java.awt.Color(142, 205, 221));
        cambiarBitsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cambiarBitsButton.setText("Cambiar bits");

        desplazarIzqButton.setBackground(new java.awt.Color(142, 205, 221));
        desplazarIzqButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desplazarIzqButton.setText("Desplazar bit a la Izquierda");

        desplazarDerSignoButton.setBackground(new java.awt.Color(142, 205, 221));
        desplazarDerSignoButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desplazarDerSignoButton.setText("Desplazar bit a la Derecha con inclusion de signo");

        desplazarDerCeroButton.setBackground(new java.awt.Color(142, 205, 221));
        desplazarDerCeroButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desplazarDerCeroButton.setText("Desplazar bit a la Derecha\ncon inclusión de cero");

        cambiarBitsAndButton.setBackground(new java.awt.Color(142, 205, 221));
        cambiarBitsAndButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cambiarBitsAndButton.setText("Cambiar bits AND");

        cambiarBitsOrButton.setBackground(new java.awt.Color(142, 205, 221));
        cambiarBitsOrButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cambiarBitsOrButton.setText("Cambiar bits OR");

        cambiarBitsOrxButton.setBackground(new java.awt.Color(142, 205, 221));
        cambiarBitsOrxButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cambiarBitsOrxButton.setText("Cambiar bits ORX");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numero entero");

        num1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Numero entero");

        num2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num2.setToolTipText("");

        resultadoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultadoLabel.setText(".");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cambiarBitsOrButton)
                        .addGap(18, 18, 18)
                        .addComponent(desplazarDerCeroButton))
                    .addComponent(cambiarBitsOrxButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cambiarBitsAndButton)
                            .addComponent(cambiarBitsButton))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desplazarIzqButton)
                            .addComponent(desplazarDerSignoButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiarBitsButton)
                    .addComponent(desplazarIzqButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desplazarDerSignoButton)
                    .addComponent(cambiarBitsAndButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desplazarDerCeroButton)
                    .addComponent(cambiarBitsOrButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cambiarBitsOrxButton)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarBitsAndButton;
    private javax.swing.JButton cambiarBitsButton;
    private javax.swing.JButton cambiarBitsOrButton;
    private javax.swing.JButton cambiarBitsOrxButton;
    private javax.swing.JButton desplazarDerCeroButton;
    private javax.swing.JButton desplazarDerSignoButton;
    private javax.swing.JButton desplazarIzqButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel resultadoLabel;
    // End of variables declaration//GEN-END:variables
}
