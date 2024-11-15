
package Frames;

import ClasesPaciente.Raza;
import static Frames.TipoDeEdicion.AGREGAR;
import static Frames.TipoDeEdicion.CONSULTAR;
import static Frames.TipoDeEdicion.MODIFICAR;
import javax.swing.JOptionPane;


public class dlgVentanaMantRaza extends javax.swing.JDialog {
    private TipoDeEdicion tipo;
    private Raza nombreRaza;
    private String tipoAnimal;
    
    public dlgVentanaMantRaza(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public dlgVentanaMantRaza(TipoDeEdicion tipoEdit, String nombreRazaP,String tipoAnimal){
        initComponents();
         switch(tipoEdit){
           case AGREGAR:
               txtNombreRaza.setEnabled(true);
               rdbGato.setEnabled(true);
               rdbPerro.setEnabled(true);
               
               break;
           case MODIFICAR:
               txtNombreRaza.setEnabled(true);
                rdbGato.setEnabled(false);
               rdbPerro.setEnabled(false);
               nombreRaza.setTipoRaza(nombreRazaP);
               break;
           case CONSULTAR:
               txtNombreRaza.setEnabled(false);
                rdbGato.setEnabled(false);
               rdbPerro.setEnabled(false);
               break;
          
       }
        if (nombreRazaP != null) {
           
            nombreRaza.setTipoRaza(nombreRazaP);
        }
       this.tipo = tipoEdit;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbGato = new javax.swing.JRadioButton();
        rdbPerro = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lblNumRazasGuardadas = new javax.swing.JLabel();
        btnAceptarRaza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombreRaza = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rdbGato.setText("Gato");

        rdbPerro.setText("Perro");

        jLabel2.setText("#Razas Guardadas");

        lblNumRazasGuardadas.setText("0");

        btnAceptarRaza.setText("Aceptar");
        btnAceptarRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRazaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Raza");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptarRaza)
                                .addGap(42, 42, 42)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbGato)
                                .addGap(81, 81, 81)
                                .addComponent(rdbPerro)))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNumRazasGuardadas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(195, 195, 195))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbGato)
                    .addComponent(rdbPerro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarRaza)
                    .addComponent(btnCancelar))
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblNumRazasGuardadas)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRazaActionPerformed
        // TODO add your handling code here:
 switch (tipo) {
            case AGREGAR: {
                try {
                    if (Raza.consultar(nombreRaza.getTipoRaza()) == null) {
                        Raza raza = new Raza(nombreRaza.getTipoRaza(),nombreRaza.getDescripcion());
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Este Tipo de Raza ya existe");
                        return;
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }

            break;

            case MODIFICAR:
                if (txtNombreRaza != null) {
                     nombreRaza.setTipoRaza(txtNombreRaza.getText());
                }
                break;
        }
        MantenimientoRazas.setTipoRaza(nombreRaza); //Esto lo hace para que en el otro frame ya tenga el nombre de la raza
        this.dispose();
    }//GEN-LAST:event_btnAceptarRazaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        MantenimientoRazas.getTipoRaza().getDescripcion();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

   
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(dlgVentanaMantRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgVentanaMantRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgVentanaMantRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgVentanaMantRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgVentanaMantRaza dialog = new dlgVentanaMantRaza(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptarRaza;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNumRazasGuardadas;
    private javax.swing.JRadioButton rdbGato;
    private javax.swing.JRadioButton rdbPerro;
    private javax.swing.JTextField txtNombreRaza;
    // End of variables declaration//GEN-END:variables
}
