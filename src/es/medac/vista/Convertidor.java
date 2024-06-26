/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.vista;

import java.util.Set;

/**
 *
 * @author Manu
 */
public class Convertidor extends javax.swing.JFrame {

    /**
     * Creates new form Convertidor
     */
    public Convertidor() {
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

        jL_titulo = new javax.swing.JLabel();
        jL_texto_ingrese = new javax.swing.JLabel();
        jT_grados = new javax.swing.JTextField();
        jC_grados_f_c = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("panel_menu"); // NOI18N
        setSize(new java.awt.Dimension(800, 600));

        jL_titulo.setBackground(new java.awt.Color(255, 204, 255));
        jL_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jL_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_titulo.setText("CONVERTIDOR");
        jL_titulo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jL_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jL_titulo.setDoubleBuffered(true);
        jL_titulo.setName(""); // NOI18N

        jL_texto_ingrese.setText("Ingrese los grados para la conversión:");

        jT_grados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jT_grados.setText(" 0");
        jT_grados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_gradosActionPerformed(evt);
            }
        });

        jC_grados_f_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ºC - F", "F - ºC" }));
        jC_grados_f_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_grados_f_cActionPerformed(evt);
            }
        });

        jT_resultado.setEditable(false);
        jT_resultado.setBackground(new java.awt.Color(147, 202, 231));
        jT_resultado.setColumns(20);
        jT_resultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jT_resultado.setRows(5);
        jScrollPane1.setViewportView(jT_resultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jT_grados, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jC_grados_f_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(348, 348, 348))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jL_texto_ingrese, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jL_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jL_texto_ingrese, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jT_grados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jC_grados_f_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_gradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_gradosActionPerformed
        
        double numIngresado = Double.parseDouble(jT_grados.getText()) ;
        System.out.println("Grados usuario" + numIngresado);
        
        if(jC_grados_f_c.getSelectedItem().equals("ºC - F")){
            
            double cToF = 32+(9*numIngresado/5);
            System.out.println("Grados usuario C" + cToF);
            jT_resultado.setText(cToF + "F");        
        }else
        {
            double fToC = (numIngresado -32)*5/9;
            System.out.println("Grados usuario F" + fToC);
            jT_resultado.setText(fToC + "C");        


        }
        
        
    }//GEN-LAST:event_jT_gradosActionPerformed

    private void jC_grados_f_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_grados_f_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_grados_f_cActionPerformed

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
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jC_grados_f_c;
    private javax.swing.JLabel jL_texto_ingrese;
    private javax.swing.JLabel jL_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_grados;
    private javax.swing.JTextArea jT_resultado;
    // End of variables declaration//GEN-END:variables
}
