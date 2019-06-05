/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author RLCR
 */
public class principal extends javax.swing.JFrame {

   
    public principal() {
        initComponents();
        configurarRB();
        ConfigRB();
    }

    public void configurarRB(){
    
    ButtonGroup mensajes = new ButtonGroup();
    
    mensajes.add(RD1);
    mensajes.add(RD2);
    mensajes.add(RD3);
    mensajes.add(RD4);
    RD1.setSelected(true);
    
    }
    
    public void ConfigRB(){
    
     ButtonGroup aritmetica = new ButtonGroup();
    
    aritmetica.add(sum);
    aritmetica.add(res);
    aritmetica.add(mul);
    aritmetica.add(div);
    aritmetica.add(pot);
    }
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RD1 = new javax.swing.JRadioButton();
        RD2 = new javax.swing.JRadioButton();
        RD3 = new javax.swing.JRadioButton();
        RD4 = new javax.swing.JRadioButton();
        btn_aceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        sum = new javax.swing.JRadioButton();
        res = new javax.swing.JRadioButton();
        mul = new javax.swing.JRadioButton();
        div = new javax.swing.JRadioButton();
        pot = new javax.swing.JRadioButton();
        resultado = new javax.swing.JButton();
        num3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        RD1.setText("ver showMessageDialog");

        RD2.setText("ver showInputDialog");

        RD3.setText("ver showConfirmDialog");

        RD4.setText("ver showOptionDialog");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ejemplo1"));

        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        sum.setText("Sumar");

        res.setText("Restar");

        mul.setText("Multiplicar");

        div.setText("Dividir");

        pot.setText("Potencia");

        resultado.setText("Resultado");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num1)
                    .addComponent(num2)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pot)
                            .addComponent(div)
                            .addComponent(mul)
                            .addComponent(res)
                            .addComponent(sum))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(num3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(res)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(div)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RD1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(RD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RD3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RD4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RD1)
                .addGap(18, 18, 18)
                .addComponent(RD2)
                .addGap(18, 18, 18)
                .addComponent(RD3)
                .addGap(18, 18, 18)
                .addComponent(RD4)
                .addGap(34, 34, 34)
                .addComponent(btn_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        
        if(RD1.isSelected()){
        
            JOptionPane.showMessageDialog(null, "RD1");
        
        }
        if(RD2.isSelected()){
        
            JOptionPane.showInputDialog(null,"RD2");
        
        }
        if(RD3.isSelected()){
        
            JOptionPane.showConfirmDialog(null, RD3);
            
        
        }
        if(RD4.isSelected()){
        
            String[] rd = {"opción 1","opción 2","opción 3"};
            
            JOptionPane.showOptionDialog(null, "RD4","Titulo",0,0,null,rd,null);
            
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_num1ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
        
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
       
        if(sum.isSelected()){
       
            int c = a + b ; 
      
             num3.setText(Integer.toString(c));
        }
        if(res.isSelected()){
        
            int d = a - b;
           
            num3.setText(Integer.toString(d));
        }
        if(mul.isSelected()){
        
            int e = a * b ;
            
           num3.setText(Integer.toString(e));
        }
        if(div.isSelected()){
        
          int f = a / b;
            
          num3.setText(Integer.toString(f));
        }
        if(pot.isSelected()){
        
        int g = (int) Math.pow(a, b);
        
           num3.setText(Integer.toString(g));
        }
        
    }//GEN-LAST:event_resultadoActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RD1;
    private javax.swing.JRadioButton RD2;
    private javax.swing.JRadioButton RD3;
    private javax.swing.JRadioButton RD4;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JRadioButton div;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton mul;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JTextField num3;
    private javax.swing.JRadioButton pot;
    private javax.swing.JRadioButton res;
    private javax.swing.JButton resultado;
    private javax.swing.JRadioButton sum;
    // End of variables declaration//GEN-END:variables
}
