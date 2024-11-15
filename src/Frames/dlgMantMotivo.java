
package Frames;

import Clases_Cita.TipoMotivo;
import Clases_Cita.tipoVacuna;
import static Frames.TipoDeEdicion.AGREGAR;
import static Frames.TipoDeEdicion.CONSULTAR;
import static Frames.TipoDeEdicion.MODIFICAR;


public class dlgMantMotivo extends javax.swing.JDialog {
    private TipoMotivo tipoMotivo;
    private tipoVacuna tipoVacunA;
    private int precio;
    private boolean examen;
   
    private TipoDeEdicion edit;
    
    public dlgMantMotivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public dlgMantMotivo(TipoDeEdicion tipoEdit, TipoMotivo nombreMotivoP, tipoVacuna nombreVacunaP, int precioP, boolean examen){
        initComponents();
         switch(tipoEdit){
           case AGREGAR:
               txtPrecioMotivo.setEnabled(true);
               cboMotivo.setEnabled(true);
               cboTipoVacuna.setEnabled(true);
               checkAplicaExamen.setEnabled(true);
               break;
               
           case MODIFICAR:
               this.txtPrecioMotivo.setEnabled(true);
               this.cboMotivo.setEnabled(true);
               this.cboTipoVacuna.setEnabled(true);
               this.checkAplicaExamen.setEnabled(true);
               
               this.tipoMotivo = nombreMotivoP;
               this.tipoVacunA = nombreVacunaP;
               this.precio = precioP;
               break;
               
           case CONSULTAR:
               txtPrecioMotivo.setEnabled(false);
               cboMotivo.setEnabled(false);
               cboTipoVacuna.setEnabled(false);
               checkAplicaExamen.setEnabled(false);
               
               txtPrecioMotivo.setText(precioP + "");
               cboMotivo.setSelectedItem(this.tipoMotivo.getDescripcion());
               cboTipoVacuna.setSelectedItem(this.tipoVacunA.getDescripcion());
               checkAplicaExamen.setSelected(examen);
               break;
          
       }
        if (nombreMotivoP != null || nombreVacunaP != null || precioP != 0 ) {
           this.tipoMotivo = nombreMotivoP;
           this.tipoVacunA = nombreVacunaP;
           this.precio = precioP;
        }
       this.edit = tipoEdit;
       internalMotivo.setTipoMotivo(this.tipoMotivo.getDescripcion());
       internalMotivo.setCostoMotivo(Integer.parseInt(txtPrecioMotivo.getText()));
       
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Descripcion ");

        jLabel2.setText("Precio");

        checkAplicaExamen.setText("Aplicacion De examen");

        jLabel3.setText("Tipo Vacuna");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(138, 378, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(138, 223, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboMotivo, javax.swing.GroupLayout.Alignment.LEADING, 0, 203, Short.MAX_VALUE)
                                    .addComponent(cboTipoVacuna, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(checkAplicaExamen))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel2)
                                        .addGap(58, 58, 58))
                                    .addComponent(txtPrecioMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAplicaExamen))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
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
    private javax.swing.JComboBox<TipoMotivo> cboMotivo;
    private javax.swing.JComboBox<tipoVacuna> cboTipoVacuna;
    private javax.swing.JCheckBox checkAplicaExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtPrecioMotivo;
    // End of variables declaration//GEN-END:variables
}
