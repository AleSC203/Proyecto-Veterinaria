/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Frames;

import ClasesPaciente.Raza;
import javax.swing.DefaultListModel;
import ClasesPaciente.Raza;
import Clases_Cita.Motivo;
import Clases_Cita.Vacunas;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class ventanaMantenimientoVacunas extends javax.swing.JInternalFrame {

    private DefaultListModel<Vacunas> modeloListaVacunas = new DefaultListModel<>();
    private static Vacunas vacuna;
    private String tipoAnimal ;
    
     public static Vacunas getVacuna() {
        return vacuna;
    }

    public static void setVacuna(Vacunas vacunaP) {
        ventanaMantenimientoVacunas.vacuna = vacunaP;
    }
   
    public ventanaMantenimientoVacunas() {
        initComponents();
        listaVacunas.setModel(modeloListaVacunas);
        llenarLista();
    }

    private void llenarLista(){
        //eliminar todas las filas de la tabla
       modeloListaVacunas.clear();
        try {
            for (Vacunas vacuna : Vacunas.listado()) {
                modeloListaVacunas.addElement(vacuna);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\n" + "No se logro guardar la vacuna en la lista");
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVacunas = new javax.swing.JList<>();
        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnModificar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnConsultar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnEliminar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnEliminar1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();

        jLabel1.setText("Vacunas");

        listaVacunas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaVacunas);

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

        btnEliminar1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        btnEliminar1.setText("Salir");
        btnEliminar1.setFocusable(false);
        btnEliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar1);
        jToolBar1.add(jSeparator5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         try {
             //Variables en uso
             
             dlgMantenimientoVacuna obj = new dlgMantenimientoVacuna(TipoDeEdicion.AGREGAR, null);
             //Ventana
             obj.setLocationRelativeTo(null);
             obj.setVisible(true);
             
             //objeto
             
             if (vacuna != null) {
                 try {
                     modeloListaVacunas.addElement(vacuna);
                     Vacunas.agregar(vacuna);
                 } catch (Exception ex) {
                     System.out.println(ex.getMessage());
                     JOptionPane.showMessageDialog(null, "No se ha logrado agregar la vacuna");
                 }
             }
             else{
                 JOptionPane.showMessageDialog(null, "La vacuna esta null");
             }} catch (Exception ex) {
             Logger.getLogger(ventanaMantenimientoVacunas.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (listaVacunas.getSelectedValue() != null) {

            String nombreVacuna = listaVacunas.getSelectedValue().getNombreVacuna();
            try {
                vacuna = Vacunas.consultar(nombreVacuna);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en la busqueda de la vacuna");
            }
            if (vacuna != null) {
                try {
                    dlgMantenimientoVacuna obj = new dlgMantenimientoVacuna(TipoDeEdicion.MODIFICAR, vacuna);
                    obj.setLocationRelativeTo(null);
                    obj.setVisible(true);
                    
                    //Los modifica en el archivo
                    try {
                        Vacunas.modificar(vacuna);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        JOptionPane.showMessageDialog(null, "Error en la actualización de la Vacuna");
                    }
                    llenarLista();
                } catch (Exception ex) {
                    Logger.getLogger(ventanaMantenimientoVacunas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:

        if (listaVacunas.getSelectedValue() != null) {
            try {
                String nombreVacuna = listaVacunas.getSelectedValue().getNombreVacuna();
                try {
                    vacuna = Vacunas.consultar(nombreVacuna);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Error");
                }
                dlgMantenimientoVacuna obj = new dlgMantenimientoVacuna(TipoDeEdicion.CONSULTAR, vacuna);
                obj.setModal(true);
                obj.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(ventanaMantenimientoVacunas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      
        if (listaVacunas.getSelectedIndex() != -1) {
            int codigo = (Integer)modeloListaVacunas.indexOf(listaVacunas.getSelectedValue());
            
             try {
                 Vacunas.eliminar(codigo);
             } catch (Exception ex) {
                 System.out.println(ex.getMessage());
                 JOptionPane.showMessageDialog(null, "Error en la eliminacion de La Vacuna");
             }
            llenarLista();
         }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_btnEliminar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<Vacunas> listaVacunas;
    // End of variables declaration//GEN-END:variables
}
