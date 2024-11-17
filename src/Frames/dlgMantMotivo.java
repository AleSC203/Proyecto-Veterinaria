
package Frames;

import ClasesPaciente.Raza;
import Clases_Cita.Motivo;
import Clases_Cita.TipoMotivo;
import Clases_Cita.Vacunas;
import Clases_Cita.tipoVacuna;
import static Frames.TipoDeEdicion.AGREGAR;
import static Frames.TipoDeEdicion.CONSULTAR;
import static Frames.TipoDeEdicion.MODIFICAR;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class dlgMantMotivo extends javax.swing.JDialog {
    private tipoVacuna tipoVacunA;
    private String descripcion;
    private int precio;
    private boolean examen;
    private TipoDeEdicion edit;
    private Motivo motivo;
    
    private  String animal;
    
    
    
    public dlgMantMotivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
    }
    public dlgMantMotivo(TipoDeEdicion tipoEdit,Motivo motivoP ,String animalP){
        initComponents();
        llenarComboVacunas();
        cboTipoVacuna.setSelectedIndex(-1);
         
         switch(tipoEdit){
           case AGREGAR:
               txtPrecioMotivo.setEnabled(true);
               cboMotivo.setEnabled(true);
               cboTipoVacuna.setEnabled(true);
               this.animal = animalP;
               
               break;
               
           case MODIFICAR:
               this.txtPrecioMotivo.setEnabled(true);
               this.cboMotivo.setEnabled(true);
               this.cboTipoVacuna.setEnabled(true);
               this.motivo = motivoP;
               this.animal = animalP;
             
               break;
               
           case CONSULTAR:
               txtPrecioMotivo.setEnabled(false);
               cboMotivo.setEnabled(false);
               cboTipoVacuna.setEnabled(false);
               
               
               txtPrecioMotivo.setText(motivoP.getPrecio() + "");
               cboMotivo.setSelectedItem(motivoP.getDescripcion());
               cboTipoVacuna.setSelectedItem(motivoP.getVacuna());
               this.animal = animalP;
               break;
          
       }
        
       this.edit = tipoEdit;
      
       
    }
    
    public void llenarComboVacunas(){
       try {
        for (Vacunas vacuna : Vacunas.listado()) {
            cboTipoVacuna.addItem(vacuna);
        }
    } catch (NullPointerException e) {
        System.err.println("Error al llenar el combo box: " + e.getMessage());
    } catch (Exception e) {
        System.err.println("Error inesperado: " + e.getMessage());
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboMotivo = new javax.swing.JComboBox<>();
        checkAplicaExamen = new javax.swing.JCheckBox();
        txtPrecioMotivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboTipoVacuna = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Descripcion ");

        jLabel2.setText("Precio");

        cboMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacunación", "Desparacitación", "Chequeo General", "Enfermedad", "Cirugía" }));
        cboMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMotivoActionPerformed(evt);
            }
        });

        checkAplicaExamen.setText("Aplicacion De examen");
        checkAplicaExamen.setEnabled(false);

        jLabel3.setText("Tipo Vacuna");

        cboTipoVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoVacunaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(cboTipoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2))
                            .addComponent(txtPrecioMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkAplicaExamen))
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnGuardar)
                .addGap(48, 48, 48)
                .addComponent(btnVolver)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAplicaExamen)
                    .addComponent(cboTipoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnVolver))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        // TODO add your handling code here:
        switch (this.edit) {
            case AGREGAR: {
                try {
                    //Necesito Validacion de si ya esta creado o no aunque creo que no se puede repetir
                    this.motivo = new Motivo(this.examen, this.descripcion, this.precio, this.tipoVacunA);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }

            break;

            case MODIFICAR:
                if (txtPrecioMotivo != null && cboMotivo.getSelectedItem() != null && cboTipoVacuna.getSelectedItem() != null) {
                    boolean examenP = false;
                    if (checkAplicaExamen.isSelected()) {
                        examenP = true;
                    }
                    String descripcionP = (String) cboMotivo.getSelectedItem();
                    int precioP = Integer.parseInt(txtPrecioMotivo.getText());
                    tipoVacuna vacunaP = (tipoVacuna) cboTipoVacuna.getSelectedItem();
                    this.motivo = new Motivo(examenP, descripcionP, precioP, vacunaP);
                }
                break;
        }
        if (motivo != null) {
            internalMotivo.setMotivo(motivo);
        } else {
            JOptionPane.showMessageDialog(null, "Motivo no valido");
        }

        internalMotivo.setMotivo(motivo);
        

        if (animal.equalsIgnoreCase("Gato")) {
            tipoVacuna tipoVacuna = (tipoVacuna)cboTipoVacuna.getSelectedItem();
            if (tipoVacuna.getAnimal().equalsIgnoreCase("Perro")) {
                JOptionPane.showMessageDialog(null, "No puedes elegir esta opción ya que es una vacuna para perros y tu mascota es un gatito");
                cboTipoVacuna.setSelectedIndex(-1);
            }
            else{
                this.dispose();
            }
        } else if (animal.equalsIgnoreCase("Perro")) {
             tipoVacuna tipoVacuna = (tipoVacuna)cboTipoVacuna.getSelectedItem();
            if (tipoVacuna.getAnimal().equalsIgnoreCase("Gato")) {
                JOptionPane.showMessageDialog(null, "No puedes elegir esta opción ya que es una vacuna para Gatos y tu mascota es un perrito");
                cboTipoVacuna.setSelectedIndex(-1);
            }
            else{
                this.dispose();
            }
        }
      

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        internalMotivo.setMotivo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cboMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMotivoActionPerformed
        // TODO add your handling code here:
        String motivoo = (String)cboMotivo.getSelectedItem();
        if (motivoo.equalsIgnoreCase("Desparacitación")) {
            txtPrecioMotivo.setText(2000+"");
             checkAplicaExamen.setSelected(false);
        }
        else if (motivoo.equalsIgnoreCase("Chequeo General")) {
            txtPrecioMotivo.setText(8000+"");
            checkAplicaExamen.setSelected(true);
        }
        else if (motivoo.equalsIgnoreCase("Enfermedad")) {
            txtPrecioMotivo.setText("");
            checkAplicaExamen.setSelected(true);
        }
        else if (motivoo.equalsIgnoreCase("Cirugía")) {
             txtPrecioMotivo.setText("");
            checkAplicaExamen.setSelected(true);
        }
        else if (motivoo.equalsIgnoreCase("Vacunación")) {
             txtPrecioMotivo.setText("");
            checkAplicaExamen.setSelected(false);
        }
        
        
    }//GEN-LAST:event_cboMotivoActionPerformed

    private void cboTipoVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoVacunaActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_cboTipoVacunaActionPerformed

  
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
            java.util.logging.Logger.getLogger(dlgMantMotivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgMantMotivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgMantMotivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgMantMotivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgMantMotivo dialog = new dlgMantMotivo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboMotivo;
    private javax.swing.JComboBox<Vacunas> cboTipoVacuna;
    private javax.swing.JCheckBox checkAplicaExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtPrecioMotivo;
    // End of variables declaration//GEN-END:variables
}
