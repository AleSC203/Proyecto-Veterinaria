
package Frames;

import ClasesPaciente.Raza;
import Clases_Cita.Vacunas;
import Clases_Cita.tipoVacuna;
import static Frames.TipoDeEdicion.AGREGAR;
import static Frames.TipoDeEdicion.CONSULTAR;
import static Frames.TipoDeEdicion.MODIFICAR;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class dlgMantenimientoVacuna extends javax.swing.JDialog {
    private TipoDeEdicion tipo;
    private Vacunas vacuna;
    private int codigoVacunasAgregar = 1;
    
    
    public dlgMantenimientoVacuna(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public dlgMantenimientoVacuna(TipoDeEdicion tipoEdit, Vacunas vacunaP) throws Exception {
        initComponents();
        conocerCodigo();
        switch (tipoEdit) {
            
            case AGREGAR:
                this.txtCostoVacuna.setEnabled(true);
                this.txtTipoVacuna.setEnabled(true);
                this.cboAnimalVacuna.setEditable(true);
                this.lblCodigoVacuna.setText(this.codigoVacunasAgregar + "");
                break;
                
            case MODIFICAR:
               this.txtCostoVacuna.setEnabled(true);
               this.txtTipoVacuna.setEnabled(true);
               this.cboAnimalVacuna.setEditable(true);
               this.lblCodigoVacuna.setText(vacunaP.getCodigo() + "");
               this.vacuna = vacunaP;
              
                
                break;
                
            case CONSULTAR:
                this.txtCostoVacuna.setEnabled(false);
               this.txtTipoVacuna.setEnabled(false);
               this.cboAnimalVacuna.setEditable(false);
                this.txtCostoVacuna.setText(vacunaP.getCosto() + "");
               this.txtTipoVacuna.setText(vacunaP.getNombreVacuna() + "");
               this.cboAnimalVacuna.setSelectedItem(vacunaP.getAnimalPertenece());
               this.lblCodigoVacuna.setText(vacunaP.getCodigo() + "");
                break;
                

        }
        
       this.tipo = tipoEdit;
    }
    
    public void conocerCodigo() throws Exception{
        
        
        for (Vacunas object : Vacunas.listado()) {
            ++this.codigoVacunasAgregar;
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtTipoVacuna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboAnimalVacuna = new javax.swing.JComboBox<>();
        txtCostoVacuna = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblCodigoVacuna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Tipo Vacuna");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Animal al que pertenece");

        jLabel3.setText("Costo");

        cboAnimalVacuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato" }));

        jLabel4.setText("Codigo");

        lblCodigoVacuna.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnAceptar)
                .addGap(99, 99, 99)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtTipoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCostoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(78, 78, 78))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cboAnimalVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCodigoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboAnimalVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCodigoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnVolver))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
         switch (tipo) {
            case AGREGAR: {
                try {
                    if (Raza.consultar(txtTipoVacuna.getText()) == null) {
                        this.vacuna = new Vacunas((String)this.cboAnimalVacuna.getSelectedItem(), txtTipoVacuna.getText(),Integer.parseInt(txtCostoVacuna.getText()));
                    } else {
                        JOptionPane.showMessageDialog(this,"Esta vacuna ya esta registrada");
                        return;
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Error en Agregar la vacuna a los archivos");
                }
            }

            break;

            case MODIFICAR:
                if (txtTipoVacuna != null && txtCostoVacuna != null && cboAnimalVacuna.getSelectedIndex() != -1) {
                  this.vacuna = new Vacunas((String)this.cboAnimalVacuna.getSelectedItem(), txtTipoVacuna.getText(),Integer.parseInt(txtCostoVacuna.getText()));
                }
                break;
        }
        if (this.vacuna != null) {
             try {
                 ventanaMantenimientoVacunas.setVacuna(this.vacuna); //Esto lo hace para que en el otro frame ya tenga el nombre de la raza
//                 Vacunas.agregar(vacuna);
             } catch (Exception ex) {
                 Logger.getLogger(dlgMantenimientoVacuna.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else{
            JOptionPane.showMessageDialog(this, "No se ha registrado la Vacuna en los archivos");
        }
        
        
        if (((String)cboAnimalVacuna.getSelectedItem()).equalsIgnoreCase("Gato")) {
            String nombreVacuna = (String)cboAnimalVacuna.getSelectedItem();
            if (nombreVacuna.contains("Perro")) {
                JOptionPane.showMessageDialog(null, "No puedes elegir esta opción ya que al parecer es una vacuna para perros y tu mascota es un gatito");
                cboAnimalVacuna.setSelectedIndex(-1);
            }
            else{
                this.dispose();
            }
        } else if (((String)cboAnimalVacuna.getSelectedItem()).equalsIgnoreCase("Perro")) {
             String nombreVacuna = (String)cboAnimalVacuna.getSelectedItem();
            if (nombreVacuna.contains("Gato")) {
                JOptionPane.showMessageDialog(null, "No puedes elegir esta opción ya que al parecer es una vacuna para Gatos y tu mascota es un perrito");
                cboAnimalVacuna.setSelectedIndex(-1);
            }
            else{
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        mantenimientoRaza.setTipoRaza(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(dlgMantenimientoVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgMantenimientoVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgMantenimientoVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgMantenimientoVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgMantenimientoVacuna dialog = new dlgMantenimientoVacuna(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboAnimalVacuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCodigoVacuna;
    private javax.swing.JTextField txtCostoVacuna;
    private javax.swing.JTextField txtTipoVacuna;
    // End of variables declaration//GEN-END:variables
}
