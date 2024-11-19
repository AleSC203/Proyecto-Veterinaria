
package Frames;

import Clases_Cita.PruebaLaboratorio;
import Clases_Cita.Vacunas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class internalPruebaLab extends javax.swing.JInternalFrame {
    private DefaultListModel<PruebaLaboratorio> modeloListaPruebasLab = new DefaultListModel<>();
    private static PruebaLaboratorio prueba;
    
    public static PruebaLaboratorio getPrueba() {
        return prueba;
    }

    public static void setPrueba(PruebaLaboratorio pruebaP) {
        internalPruebaLab.prueba = pruebaP;
    }
    
    public internalPruebaLab() {
        initComponents();
        try {
            cboTipoPruebasLab.setModel(new DefaultComboBoxModel(PruebaLaboratorio.consultarArray().toArray()));
        } catch (Exception ex) {
            Logger.getLogger(internalPruebaLab.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No esta funcionando");
        }
        this.listaPruebasLaboratorio.setModel(modeloListaPruebasLab);
    }

    
    public void llenarLista(){
        try {
            modeloListaPruebasLab.clear();
            for (PruebaLaboratorio object : PruebaLaboratorio.listado()) {
                modeloListaPruebasLab.addElement(object);
            }
        } catch (Exception ex) {
            Logger.getLogger(internalPruebaLab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnModificar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnConsultar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnEliminar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPruebasLaboratorio = new javax.swing.JList<>();
        cboTipoPruebasLab = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);
        jToolBar1.add(jSeparator3);

        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        jScrollPane1.setViewportView(listaPruebasLaboratorio);

        cboTipoPruebasLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoPruebasLabActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipos de pruebas de laboratorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cboTipoPruebasLab, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboTipoPruebasLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         try {
             //Variables en uso
             
             dlgMantPruebaLab obj = new dlgMantPruebaLab(TipoDeEdicion.AGREGAR, (PruebaLaboratorio)cboTipoPruebasLab.getSelectedItem());
             //Ventana
             obj.setLocationRelativeTo(null);
             obj.setVisible(true);
             
             //objeto
             
             if (prueba != null) {
                 try {
                     modeloListaPruebasLab.addElement(prueba);
                     PruebaLaboratorio.agregar(prueba);
                 } catch (Exception ex) {
                     System.out.println(ex.getMessage());
                     JOptionPane.showMessageDialog(null, "No se ha logrado agregar la Prueba");
                 }
             }
             else{
                 JOptionPane.showMessageDialog(null, "La Prueba esta null");
             }} catch (Exception ex) {
             Logger.getLogger(ventanaMantenimientoVacunas.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if (listaPruebasLaboratorio.getSelectedValue() != null) {

            String nombrePrueba = listaPruebasLaboratorio.getSelectedValue().getDescripcion();
            try {
                prueba = PruebaLaboratorio.consultar(nombrePrueba);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en la busqueda de la Prueba");
            }
            if (prueba != null) {
                try {
                    dlgMantPruebaLab obj = new dlgMantPruebaLab(TipoDeEdicion.MODIFICAR, prueba);
                    obj.setLocationRelativeTo(null);
                    obj.setVisible(true);
                    
                    //Los modifica en el archivo
                    try {
                        PruebaLaboratorio.modificar(prueba);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        JOptionPane.showMessageDialog(null, "Error en la actualización de la Prueba");
                    }
                    llenarLista();
                } catch (Exception ex) {
                    Logger.getLogger(ventanaMantenimientoVacunas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        if (listaPruebasLaboratorio.getSelectedValue() != null) {
            try {
                String nombrePrueba = listaPruebasLaboratorio.getSelectedValue().getDescripcion();
                try {
                    prueba = PruebaLaboratorio.consultar(nombrePrueba);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Error");
                }
                dlgMantPruebaLab obj = new dlgMantPruebaLab(TipoDeEdicion.CONSULTAR, prueba);
                obj.setModal(true);
                obj.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(ventanaMantenimientoVacunas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboTipoPruebasLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoPruebasLabActionPerformed
        // TODO add your handling code here:
        if (((PruebaLaboratorio)cboTipoPruebasLab.getSelectedItem()).getCodigo() == 1) {
            modeloListaPruebasLab.clear();
            try {
                for (PruebaLaboratorio object : PruebaLaboratorio.listado()) {
                    if (object.getCodigo() == 1) {
                       modeloListaPruebasLab.addElement(object);  
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(internalPruebaLab.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (((PruebaLaboratorio)cboTipoPruebasLab.getSelectedItem()).getCodigo() == 2) {
            modeloListaPruebasLab.clear();
            try {
                for (PruebaLaboratorio object : PruebaLaboratorio.listado()) {
                    if (object.getCodigo() == 2) {
                       modeloListaPruebasLab.addElement(object);  
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(internalPruebaLab.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (((PruebaLaboratorio)cboTipoPruebasLab.getSelectedItem()).getCodigo() == 3) {
            modeloListaPruebasLab.clear();
            try {
                for (PruebaLaboratorio object : PruebaLaboratorio.listado()) {
                    if (object.getCodigo() == 3) {
                       modeloListaPruebasLab.addElement(object);  
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(internalPruebaLab.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (((PruebaLaboratorio)cboTipoPruebasLab.getSelectedItem()).getCodigo() == 4) {
            modeloListaPruebasLab.clear();
            try {
                for (PruebaLaboratorio object : PruebaLaboratorio.listado()) {
                    if (object.getCodigo() == 4) {
                       modeloListaPruebasLab.addElement(object);  
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(internalPruebaLab.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_cboTipoPruebasLabActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if (listaPruebasLaboratorio.getSelectedIndex() != -1) {
            int codigo = (Integer)modeloListaPruebasLab.indexOf(listaPruebasLaboratorio.getSelectedValue());
            
             try {
                 Vacunas.eliminar(codigo);
             } catch (Exception ex) {
                 System.out.println(ex.getMessage());
                 JOptionPane.showMessageDialog(null, "Error en la eliminacion de La Vacuna");
             }
            llenarLista();
         }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<PruebaLaboratorio> cboTipoPruebasLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<PruebaLaboratorio> listaPruebasLaboratorio;
    // End of variables declaration//GEN-END:variables
}
