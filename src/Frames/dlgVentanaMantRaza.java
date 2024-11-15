
package Frames;

import ClasesPaciente.Raza;
import static Frames.TipoDeEdicion.AGREGAR;
import static Frames.TipoDeEdicion.CONSULTAR;
import static Frames.TipoDeEdicion.MODIFICAR;
import javax.swing.JOptionPane;


public class dlgVentanaMantRaza extends javax.swing.JDialog {
    private TipoDeEdicion tipo;
    private Raza razaCreada;
    private String tipoAnimal;
    
    public dlgVentanaMantRaza(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        razaCreada = new Raza();
    }
    
    public dlgVentanaMantRaza(TipoDeEdicion tipoEdit, Raza raza) {
        initComponents();
        switch (tipoEdit) {
            
            case AGREGAR:
                this.txtNombreRaza.setEnabled(true);
                this.rdbGato.setEnabled(true);
                this.rdbPerro.setEnabled(true);
                
                break;
                
            case MODIFICAR:
                this.txtNombreRaza.setEnabled(true);
                this.rdbGato.setEnabled(false);
                this.rdbPerro.setEnabled(false);
                this.razaCreada = raza;
                
                break;
                
            case CONSULTAR:
                this.txtNombreRaza.setEnabled(false);
                this.rdbGato.setEnabled(false);
                this.rdbPerro.setEnabled(false);
                if (raza.getTipoRaza().equalsIgnoreCase("Perro")) {
                    this.rdbPerro.setSelected(true);
                    this.rdbGato.setSelected(false);
                    razaCreada.setDescripcion(raza.getDescripcion());
                    razaCreada.setTipoRaza(raza.getTipoRaza());
                }
                else if(raza.getTipoRaza().equalsIgnoreCase("Gato")){
                    this.rdbGato.setSelected(true);
                    this.rdbPerro.setSelected(false);
                    razaCreada.setDescripcion(raza.getDescripcion());
                    razaCreada.setTipoRaza(raza.getTipoRaza());
                }
                this.txtNombreRaza.setText(raza.getDescripcion());
                lblNumRazasGuardadas.setText(raza.getNumeroRaza()+"");
                break;
                

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rdbGato.setText("Gato");

        rdbPerro.setText("Perro");

        jLabel2.setText("Codigo Raza");

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gatito.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perro.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(txtNombreRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptarRaza)
                                .addGap(42, 42, 42)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbGato)
                                .addGap(81, 81, 81)
                                .addComponent(rdbPerro)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNumRazasGuardadas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(211, 211, 211))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbGato)
                        .addComponent(rdbPerro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
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

        //Necesito alguna Validacion
        switch (tipo) {
            case AGREGAR: {
                try {
                    if (Raza.consultar(txtNombreRaza.getText()) == null) {
                        this.tipoAnimal = "";
                        if (rdbGato.isSelected()) {
                            this.tipoAnimal = "Gato";
                        } else if (rdbPerro.isSelected()) {
                            this.tipoAnimal = "Perro";
                        }
                        this.razaCreada = new Raza(this.tipoAnimal, txtNombreRaza.getText());
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Este Tipo de Raza ya existe");
                        return;
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }

            break;

            case MODIFICAR:
                if (txtNombreRaza != null) {
                    this.tipoAnimal = "";
                    if (rdbGato.isSelected()) {
                        this.tipoAnimal = "Gato";
                    } else if (rdbPerro.isSelected()) {
                        this.tipoAnimal = "Perro";
                    }
                    String nombreRaza = txtNombreRaza.getText();
                    this.razaCreada = new Raza(this.tipoAnimal, nombreRaza);
                }
                break;
        }
        if (razaCreada != null) {
             mantenimientoRaza.setTipoRaza(razaCreada); //Esto lo hace para que en el otro frame ya tenga el nombre de la raza
        }
        else{
            JOptionPane.showMessageDialog(this, "No se ha creado una raza válida.");
        }
        
        mantenimientoRaza.setTipoRaza(razaCreada);
        this.dispose();
    }//GEN-LAST:event_btnAceptarRazaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        mantenimientoRaza.setTipoRaza(null);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNumRazasGuardadas;
    private javax.swing.JRadioButton rdbGato;
    private javax.swing.JRadioButton rdbPerro;
    private javax.swing.JTextField txtNombreRaza;
    // End of variables declaration//GEN-END:variables
}
