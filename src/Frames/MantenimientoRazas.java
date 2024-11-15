
package Frames;

import ClasesPaciente.Raza;
import Clases_Cita.Motivo;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.*;


public class MantenimientoRazas  {
    private DefaultListModel<Raza> modeloListaAnimales = new DefaultListModel<>();
    private static Raza raza;
    private String tipoAnimal ;
    
    
    
     public static Raza getTipoRaza() {
        return raza;
    }

    public static void setTipoRaza(Raza tipoRaza) {
        MantenimientoRazas.raza = tipoRaza;
    }
   
    
    //Constructor 

    
    public MantenimientoRazas() {
        initComponents();
        listaAnimales.setModel(modeloListaAnimales);
        tipoAnimal = (String) cboTipoAnimal.getSelectedItem();
        Raza.cambiarRuta(tipoAnimal);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAnimales = new javax.swing.JList<>();
        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnModificar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnConsultar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnEliminar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        cboTipoAnimal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Animales");

        listaAnimales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaAnimales);

        btnAgregar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregar);
        jToolBar1.add(jSeparator1);

        btnModificar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setFocusable(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnModificar);
        jToolBar1.add(jSeparator4);

        btnConsultar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrevista.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConsultar);
        jToolBar1.add(jSeparator2);

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEliminar);
        jToolBar1.add(jSeparator3);

        jLabel2.setText("Tipo de Animal");

        cboTipoAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gato", "Perro" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cboTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarTabla(){
        modeloListaAnimales.clear();
        try {
            for (Raza raza : Raza.listado()) {
              modeloListaAnimales.addElement(raza);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
            //Variables en uso
            String nombreRaza = raza.getTipoRaza();
            dlgVentanaMantRaza obj = new dlgVentanaMantRaza(TipoDeEdicion.AGREGAR, nombreRaza, tipoAnimal);
            
            //Ventana
            obj.setLocationRelativeTo(null);
            obj.setVisible(true);
            
            //objeto
            Raza nueva = new Raza(nombreRaza,tipoAnimal);
            
            if (nombreRaza != "") {
                try {
                    modeloListaAnimales.addElement(nueva);
                    nueva.agregar(raza);
                } catch (Exception ex) {
                    Logger.getLogger(MantenimientoRazas.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if (listaAnimales.getSelectedValue() != null) {
            
            String nombre = listaAnimales.getSelectedValue().getTipoRaza();
            try {
                raza = Raza.consultar(nombre);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            if (raza != null) {
                dlgVentanaMantRaza obj = new dlgVentanaMantRaza(TipoDeEdicion.MODIFICAR, nombre, tipoAnimal);
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
               
                //Los modifica en el archivo
                try {
                    Raza.modificar(raza);
                } catch (Exception ex) {
                   System.out.println(ex.getMessage());
                }
//                llenarTabla();  Necesito hacer un metodo que me modifique la lista
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        
         if (listaAnimales.getSelectedValue() != null) {
            String nombre = listaAnimales.getSelectedValue().getTipoRaza();
            try {
                raza = Raza.consultar(nombre);
            } catch (Exception ex) {
                System.out.println(ex.getMessage()); 
            }
            dlgVentanaMantRaza obj = new dlgVentanaMantRaza(TipoDeEdicion.CONSULTAR, nombre, tipoAnimal);
                obj.setVisible(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

  
    
   
//    public static void main(String args[]) {
//       
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MantenimientoRazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MantenimientoRazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MantenimientoRazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MantenimientoRazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MantenimientoRazas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboTipoAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<Raza> listaAnimales;
    // End of variables declaration//GEN-END:variables

   
