
package Frames;

import ClasesPaciente.Raza;
import Clases_Cita.Motivo;
import Clases_Cita.TipoMotivo;
import Clases_Cita.tipoVacuna;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class internalMotivo extends javax.swing.JInternalFrame {
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private static String nombreMotivo;
    private static int costoMotivo;
    Motivo motivo;
    
    public static String getTipoRaza() {
        return nombreMotivo;
    }

    public static void setTipoMotivo(String motivo) {
        nombreMotivo = motivo;
    }

    public static int getCostoMotivo() {
        return costoMotivo;
    }

    public static void setCostoMotivo(int costoMotivo) {
        internalMotivo.costoMotivo = costoMotivo;
    }
    
    
    public internalMotivo() {
        initComponents();
        modeloTabla = (DefaultTableModel)tablaMotivo.getModel();
        
    }
    
    public void actualizarTabla(){
        modeloTabla.setNumRows(0);
        try {
            for (Motivo motivoP : Motivo.listado()) {
              Object[] filaTabla = new Object[5];
              filaTabla[0] = motivoP.isAplicaExamen();
              filaTabla[1] = motivoP.getDescripcion();
              filaTabla[2] = motivoP.getPrecio();
              filaTabla[3] = motivoP.getCodigo();
              filaTabla[4] = motivoP.getVacuna();
              modeloTabla.addRow(filaTabla);  
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMotivo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cboAnimal = new javax.swing.JComboBox<>();

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

        tablaMotivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aplica Examen", "Descripcion", "Precio", "Codigo", "Tipo Vacuna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMotivo);

        jLabel1.setText("Animal");

        cboAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gato", "Perro" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(cboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      //  Variables en uso
      
      int fila = tablaMotivo.getSelectedRow();
        if (fila != -1) {
          try {
              boolean examen = (boolean)tablaMotivo.getValueAt(fila, 0);
              TipoMotivo Descripcion = (TipoMotivo)tablaMotivo.getValueAt(fila, 1);
              int precio = (Integer)tablaMotivo.getValueAt(fila, 2);
              int codigo = (Integer)tablaMotivo.getValueAt(fila, 3);
              tipoVacuna vacuna = (tipoVacuna)tablaMotivo.getValueAt(fila, 4);
              dlgMantMotivo obj = new dlgMantMotivo(TipoDeEdicion.AGREGAR, Descripcion, vacuna, precio, examen);
               this.motivo = new Motivo(examen, nombreMotivo, precio,vacuna);
              
              
              //Ventana
              obj.setLocationRelativeTo(null);
              obj.setVisible(true);
              
              Object[] filaTabla = new Object[5];
              filaTabla[0] = examen;
              filaTabla[1] = this.motivo.getDescripcion();
              filaTabla[2] = precio;
              filaTabla[3] = this.motivo.getCodigo();
              filaTabla[4] = vacuna;
              modeloTabla.addRow(filaTabla);
              motivo.agregar(this.motivo);
          } catch (Exception ex) {
              Logger.getLogger(internalMotivo.class.getName()).log(Level.SEVERE, null, ex);
          }

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

//        if (listaAnimales.getSelectedValue() != null) {
//
//            String nombre = listaAnimales.getSelectedValue().getTipoRaza();
//            try {
//                raza = Raza.consultar(nombre);
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//            if (raza != null) {
//                dlgVentanaMantRaza obj = new dlgVentanaMantRaza(TipoDeEdicion.MODIFICAR, nombre, tipoAnimal);
//                obj.setLocationRelativeTo(null);
//                obj.setVisible(true);
//
//                //Los modifica en el archivo
//                try {
//                    Raza.modificar(raza);
//                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
//                }
//                //                llenarTabla();  Necesito hacer un metodo que me modifique la lista
//            }
//        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:

//        if (listaAnimales.getSelectedValue() != null) {
//            String nombre = listaAnimales.getSelectedValue().getTipoRaza();
//            try {
//                raza = Raza.consultar(nombre);
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//            dlgVentanaMantRaza obj = new dlgVentanaMantRaza(TipoDeEdicion.CONSULTAR, nombre, tipoAnimal);
//            obj.setVisible(true);
//        }
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tablaMotivo;
    // End of variables declaration//GEN-END:variables
}