/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja1;

/**
 *
 * @author hp main
 */
import javax.swing.*;
public class hojaDeTrabajo extends javax.swing.JFrame {

    /**
     * Creates new form hojaDeTrabajo
     */
    public hojaDeTrabajo() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("promedio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("factorial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("menor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("mayor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione una de las 4 operaciones");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ingrese un numero");

        jLabel3.setText("ingrese un numero");

        jLabel4.setText("ingrese un numero");

        jLabel5.setText("ingrese un numero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int variable1, variable2, variable3, variable4;
       variable1 = Integer.parseInt (jTextField1.getText());
       variable2 = Integer.parseInt (jTextField2.getText());
       variable3 = Integer.parseInt (jTextField3.getText());
       variable4 = Integer.parseInt (jTextField4.getText());
       
       int resultado;
       
       resultado = (variable1+variable2+variable3+variable4)/4;
       JOptionPane.showMessageDialog(null, "el promedio es " + resultado);
            
      
                
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      int variable1, variable2, variable3, variable4;
        variable1 = Integer.parseInt (jTextField1.getText());
       variable2 = Integer.parseInt (jTextField2.getText());
       variable3 = Integer.parseInt (jTextField3.getText());
       variable4 = Integer.parseInt (jTextField4.getText());
       
       if (variable1< variable2 && variable1 < variable3 && variable1 < variable4){
            JOptionPane.showMessageDialog(null, "el numero menor es " + variable1 + "_201503368");
       }
       else {
         if (variable2< variable1 && variable2 < variable3 && variable2 < variable4){
            JOptionPane.showMessageDialog(null, "el numero menor es " + variable2 + "_201503368");
       } 
         else
         {
          if (variable3< variable2 && variable3 < variable1 && variable3 < variable4){
            JOptionPane.showMessageDialog(null, "el numero menor es " + variable3 + "_201503368");
       }
          else
          {
           if (variable3 == variable2 && variable3 == variable1 && variable3 == variable4){
            JOptionPane.showMessageDialog(null, "los numeros son iguales" + "_201503368");
       }
           else {
            JOptionPane.showMessageDialog(null, "el numero menor es " + variable4 + "_201503368");
       }
          
        
          }
         }
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int variable1, variable2, variable3, variable4;
        variable1 = Integer.parseInt (jTextField1.getText());
       variable2 = Integer.parseInt (jTextField2.getText());
       variable3 = Integer.parseInt (jTextField3.getText());
       variable4 = Integer.parseInt (jTextField4.getText());
       
       int resultado1 =1,resultado2 = 1,resultado3 = 1,resultado4 = 1;
       
       for (int i = 2; i <= variable1; i++) {
                
                resultado1 = resultado1 * i;
            }
       for (int i = 2; i <= variable2; i++) {
                
                resultado2 = resultado2 * i;
            }
       for (int i = 2; i <= variable3; i++) {
                
                resultado3 = resultado3 * i;
            }
       for (int i = 2; i <= variable4; i++) {
                
                resultado4 = resultado4 * i;
            }
       
       JOptionPane.showMessageDialog(null, "el factorial de cada numero es " + resultado1 + ", " + resultado2 + ", " + resultado3 + ", " + resultado4 );

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int variable1, variable2, variable3, variable4;
        variable1 = Integer.parseInt (jTextField1.getText());
       variable2 = Integer.parseInt (jTextField2.getText());
       variable3 = Integer.parseInt (jTextField3.getText());
       variable4 = Integer.parseInt (jTextField4.getText());
       
       if (variable1> variable2 && variable1 > variable3 && variable1 > variable4){
            JOptionPane.showMessageDialog(null, "el numero mayor es " + variable1);
       }
       else {
         if (variable2> variable1 && variable2 > variable3 && variable2 > variable4){
            JOptionPane.showMessageDialog(null, "el numero mayor es " + variable2);
       } 
         else
         {
          if (variable3> variable2 && variable3 > variable1 && variable3 > variable4){
            JOptionPane.showMessageDialog(null, "el numero mayor es " + variable3);
       }
          else
          {
           if (variable3 == variable2 && variable3 == variable1 && variable3 == variable4){
            JOptionPane.showMessageDialog(null, "los numeros son iguales");
       }
           else {
            JOptionPane.showMessageDialog(null, "el numero mayor es " + variable4);
       }
          
        
          }
         }
       }      
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
