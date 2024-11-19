/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Frames;

import Clases_Cita.PruebaLaboratorio;
import Clases_Cita.Vacunas;
import static Frames.TipoDeEdicion.AGREGAR;
import static Frames.TipoDeEdicion.CONSULTAR;
import static Frames.TipoDeEdicion.MODIFICAR;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class dlgMantPruebaLab extends javax.swing.JDialog {
    private TipoDeEdicion tipo;
    private PruebaLaboratorio pruebaLab;
    private PruebaLaboratorio pruebaAgregar; // Uso esta variable para asignarle el tipo de categoria y despues poder instanciarlo
   
   
    public dlgMantPruebaLab(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
    }
    
    public dlgMantPruebaLab(TipoDeEdicion edit, PruebaLaboratorio pruebaLabP){
        
         switch (edit) {
            
            case AGREGAR:
               this.txtNombreSubCategoria.setEnabled(true);
               this.txtPrecioSubCategoria.setEnabled(true);
               this.pruebaAgregar = pruebaLabP;
                break;
                
            case MODIFICAR:
               this.txtNombreSubCategoria.setEnabled(true);
               this.txtPrecioSubCategoria.setEnabled(true);
               this.pruebaLab = pruebaLabP;
              
                
                break;
                
            case CONSULTAR:
               this.txtNombreSubCategoria.setEnabled(false);
               this.txtPrecioSubCategoria.setEnabled(false);
               this.txtNombreSubCategoria.setText(pruebaLabP.getDescripcion());
               this.txtPrecioSubCategoria.setText(pruebaLabP.getPrecio() + "");
                
               break;
                

        }
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreSubCategoria = new javax.swing.JTextField();
        txtPrecioSubCategoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre ");

        jLabel1.setText("Precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombreSubCategoria)
                        .addComponent(txtPrecioSubCategoria)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnGuardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                            .addComponent(btnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
        //Falta hacer lo de mandar el objeto o los objetos en null
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     
        switch (tipo) {
            case AGREGAR: {
                try {
                    if (PruebaLaboratorio.consultar(txtNombreSubCategoria.getText()) == null) {
                        this.pruebaLab = pruebaAgregar;
                        this.pruebaLab.setDescripcion(txtNombreSubCategoria.getText());
                        this.pruebaLab.setPrecio(Integer.parseInt(txtPrecioSubCategoria.getText()));
                    } else {
                        JOptionPane.showMessageDialog(this,"Esta vacuna ya esta registrada");
                        return;
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
//                    JOptionPane.showMessageDialog(null, "Error en Agregar la Prueba de laboratorio a los archivos");
                }
            }

            break;

            case MODIFICAR:
                if (txtNombreSubCategoria.getText() != null && txtPrecioSubCategoria.getText() != null ) {
                 this.pruebaLab.setDescripcion(txtNombreSubCategoria.getText());
                 this.pruebaLab.setPrecio(Integer.parseInt(txtPrecioSubCategoria.getText()));
                }
                break;
        }
        
                 internalPruebaLab.setPrueba(this.pruebaLab); //Esto lo hace para que en el otro frame ya tenga el nombre de la raza
                 this.dispose();
            
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(dlgMantPruebaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgMantPruebaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgMantPruebaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgMantPruebaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgMantPruebaLab dialog = new dlgMantPruebaLab(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNombreSubCategoria;
    private javax.swing.JTextField txtPrecioSubCategoria;
    // End of variables declaration//GEN-END:variables
}
