/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Frames;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class dlgMantPruebaLab extends javax.swing.JDialog {

    /**
     * Creates new form dlgMantPruebaLab
     */
    public dlgMantPruebaLab(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        limpiarTodo();
    }
    
    public void limpiarTodo(){
        this.cboTipoPruebasLab.setSelectedIndex(-1);
        //Sangre
        this.checkSerieRoja.setSelected(false);
        this.checkSerieBlancaCoagulacion.setSelected(false);
        this.checkSerieBlancaPlaquetas.setSelected(false);

        //Orina
        this.checkCultivoBacteriasOrina.setSelected(false);
        this.checkCultivoHongosOrina.setSelected(false);
        this.checkProteinasOrina.setSelected(false);
        this.checkSedimentosOrina.setSelected(false);

        //Heces
        this.checkBusquedaParasitosHeces.setSelected(false);
        this.checkBusquedaSangreHeces.setSelected(false);

        //Cultivos
        this.checkBacteriasCultivo.setSelected(false);
        this.checkHongosCultivos.setSelected(false);


        
        //Enabled
        
        
        //Sangre
        this.checkSerieRoja.setEnabled(false);
        this.checkSerieBlancaCoagulacion.setEnabled(false);
        this.checkSerieBlancaPlaquetas.setEnabled(false);

        //Orina
        this.checkCultivoBacteriasOrina.setEnabled(false);
        this.checkCultivoHongosOrina.setEnabled(false);
        this.checkProteinasOrina.setEnabled(false);
        this.checkSedimentosOrina.setEnabled(false);

        //Heces
        this.checkBusquedaParasitosHeces.setEnabled(false);
        this.checkBusquedaSangreHeces.setEnabled(false);

        //Cultivos
        this.checkBacteriasCultivo.setEnabled(false);
        this.checkHongosCultivos.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSangre = new javax.swing.JPanel();
        checkSerieRoja = new javax.swing.JCheckBox();
        checkSerieBlancaPlaquetas = new javax.swing.JCheckBox();
        checkSerieBlancaCoagulacion = new javax.swing.JCheckBox();
        panelHeces = new javax.swing.JPanel();
        checkBusquedaSangreHeces = new javax.swing.JCheckBox();
        checkBusquedaParasitosHeces = new javax.swing.JCheckBox();
        panelOrina = new javax.swing.JPanel();
        checkSedimentosOrina = new javax.swing.JCheckBox();
        checkProteinasOrina = new javax.swing.JCheckBox();
        checkCultivoHongosOrina = new javax.swing.JCheckBox();
        checkCultivoBacteriasOrina = new javax.swing.JCheckBox();
        panelCultivo = new javax.swing.JPanel();
        checkHongosCultivos = new javax.swing.JCheckBox();
        checkBacteriasCultivo = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cboTipoPruebasLab = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioTotalExamen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Prueba de Sangre"));

        checkSerieRoja.setText("Serie Roja");
        checkSerieRoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSerieRojaActionPerformed(evt);
            }
        });

        checkSerieBlancaPlaquetas.setText("Serie Blanca Plaquetas");
        checkSerieBlancaPlaquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSerieBlancaPlaquetasActionPerformed(evt);
            }
        });

        checkSerieBlancaCoagulacion.setText("Serie Blanca Coagulación");
        checkSerieBlancaCoagulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSerieBlancaCoagulacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSangreLayout = new javax.swing.GroupLayout(panelSangre);
        panelSangre.setLayout(panelSangreLayout);
        panelSangreLayout.setHorizontalGroup(
            panelSangreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSangreLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelSangreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkSerieBlancaCoagulacion)
                    .addComponent(checkSerieRoja)
                    .addComponent(checkSerieBlancaPlaquetas))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panelSangreLayout.setVerticalGroup(
            panelSangreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSangreLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(checkSerieRoja)
                .addGap(28, 28, 28)
                .addComponent(checkSerieBlancaPlaquetas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(checkSerieBlancaCoagulacion)
                .addGap(48, 48, 48))
        );

        panelHeces.setBorder(javax.swing.BorderFactory.createTitledBorder("Prueba de Heces"));

        checkBusquedaSangreHeces.setText("Búsqueda de Sangre");
        checkBusquedaSangreHeces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBusquedaSangreHecesActionPerformed(evt);
            }
        });

        checkBusquedaParasitosHeces.setText("Búsqueda de Parásitos");
        checkBusquedaParasitosHeces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBusquedaParasitosHecesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHecesLayout = new javax.swing.GroupLayout(panelHeces);
        panelHeces.setLayout(panelHecesLayout);
        panelHecesLayout.setHorizontalGroup(
            panelHecesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHecesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHecesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBusquedaParasitosHeces)
                    .addComponent(checkBusquedaSangreHeces))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHecesLayout.setVerticalGroup(
            panelHecesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHecesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(checkBusquedaSangreHeces)
                .addGap(39, 39, 39)
                .addComponent(checkBusquedaParasitosHeces)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        panelOrina.setBorder(javax.swing.BorderFactory.createTitledBorder("Prueba de Orina"));

        checkSedimentosOrina.setText("Sedimentos");
        checkSedimentosOrina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSedimentosOrinaActionPerformed(evt);
            }
        });

        checkProteinasOrina.setText("Proteínas");
        checkProteinasOrina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProteinasOrinaActionPerformed(evt);
            }
        });

        checkCultivoHongosOrina.setText("Cultivo para hongos");
        checkCultivoHongosOrina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCultivoHongosOrinaActionPerformed(evt);
            }
        });

        checkCultivoBacteriasOrina.setText("Cultivo para bacterias");
        checkCultivoBacteriasOrina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCultivoBacteriasOrinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOrinaLayout = new javax.swing.GroupLayout(panelOrina);
        panelOrina.setLayout(panelOrinaLayout);
        panelOrinaLayout.setHorizontalGroup(
            panelOrinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOrinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkSedimentosOrina)
                    .addComponent(checkProteinasOrina)
                    .addComponent(checkCultivoHongosOrina)
                    .addComponent(checkCultivoBacteriasOrina))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        panelOrinaLayout.setVerticalGroup(
            panelOrinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrinaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(checkSedimentosOrina)
                .addGap(18, 18, 18)
                .addComponent(checkProteinasOrina)
                .addGap(18, 18, 18)
                .addComponent(checkCultivoHongosOrina)
                .addGap(18, 18, 18)
                .addComponent(checkCultivoBacteriasOrina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCultivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Prueba de Cultivo"));

        checkHongosCultivos.setText("Hongos");
        checkHongosCultivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHongosCultivosActionPerformed(evt);
            }
        });

        checkBacteriasCultivo.setText("Bacterias");
        checkBacteriasCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBacteriasCultivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCultivoLayout = new javax.swing.GroupLayout(panelCultivo);
        panelCultivo.setLayout(panelCultivoLayout);
        panelCultivoLayout.setHorizontalGroup(
            panelCultivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCultivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCultivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkHongosCultivos)
                    .addComponent(checkBacteriasCultivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCultivoLayout.setVerticalGroup(
            panelCultivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCultivoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(checkHongosCultivos)
                .addGap(36, 36, 36)
                .addComponent(checkBacteriasCultivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cboTipoPruebasLab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sangre", "Heces", "Orina", "Cultivo" }));
        cboTipoPruebasLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoPruebasLabActionPerformed(evt);
            }
        });

        jLabel1.setText("Costo");

        txtPrecioTotalExamen.setEditable(false);
        txtPrecioTotalExamen.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelHeces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelSangre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelCultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelOrina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioTotalExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(106, 106, 106)
                                .addComponent(btnCancelar)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addGap(138, 138, 138))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(cboTipoPruebasLab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioTotalExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(cboTipoPruebasLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSangre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOrina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHeces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBusquedaParasitosHecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBusquedaParasitosHecesActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkBusquedaParasitosHeces.isSelected()) {
            nuevoPrecio = precioExamen + 4000;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkBusquedaParasitosHecesActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
        //Falta hacer lo de mandar el objeto o los objetos en null
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      
        this.limpiarTodo();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void checkSerieRojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSerieRojaActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkSerieRoja.isSelected()) {
            nuevoPrecio = precioExamen + 3200;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
        
        
       
    }//GEN-LAST:event_checkSerieRojaActionPerformed

    private void checkSerieBlancaPlaquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSerieBlancaPlaquetasActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkSerieBlancaPlaquetas.isSelected()) {
            nuevoPrecio = precioExamen + 3200;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkSerieBlancaPlaquetasActionPerformed

    private void checkSerieBlancaCoagulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSerieBlancaCoagulacionActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkSerieBlancaCoagulacion.isSelected()) {
            nuevoPrecio = precioExamen + 3200;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkSerieBlancaCoagulacionActionPerformed

    private void checkBusquedaSangreHecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBusquedaSangreHecesActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkBusquedaSangreHeces.isSelected()) {
            nuevoPrecio = precioExamen + 4000;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkBusquedaSangreHecesActionPerformed

    private void checkSedimentosOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSedimentosOrinaActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkSedimentosOrina.isSelected()) {
            nuevoPrecio = precioExamen + 3600;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkSedimentosOrinaActionPerformed

    private void checkProteinasOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProteinasOrinaActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkProteinasOrina.isSelected()) {
            nuevoPrecio = precioExamen + 3600;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkProteinasOrinaActionPerformed

    private void checkCultivoHongosOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCultivoHongosOrinaActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkCultivoHongosOrina.isSelected()) {
            nuevoPrecio = precioExamen + 3600;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkCultivoHongosOrinaActionPerformed

    private void checkCultivoBacteriasOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCultivoBacteriasOrinaActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkCultivoBacteriasOrina.isSelected()) {
            nuevoPrecio = precioExamen + 3600;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkCultivoBacteriasOrinaActionPerformed

    private void checkHongosCultivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHongosCultivosActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkHongosCultivos.isSelected()) {
            nuevoPrecio = precioExamen + 4800;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkHongosCultivosActionPerformed

    private void checkBacteriasCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBacteriasCultivoActionPerformed
        // TODO add your handling code here:
        int precioExamen = Integer.parseInt(txtPrecioTotalExamen.getText());
        int nuevoPrecio = 0;
        
        if (this.checkBacteriasCultivo.isSelected()) {
            nuevoPrecio = precioExamen + 4800;
            txtPrecioTotalExamen.setText(nuevoPrecio + "");
        }
    }//GEN-LAST:event_checkBacteriasCultivoActionPerformed

    private void cboTipoPruebasLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoPruebasLabActionPerformed
        // TODO add your handling code here:
        String opcion = (String) cboTipoPruebasLab.getSelectedItem();
        if (opcion.equalsIgnoreCase("Sangre")) {
            this.checkSerieBlancaPlaquetas.setEnabled(true);
            this.checkSerieRoja.setEnabled(true);
            this.checkSerieBlancaCoagulacion.setEnabled(true);

            this.checkCultivoBacteriasOrina.setEnabled(false);
            this.checkCultivoHongosOrina.setEnabled(false);
            this.checkProteinasOrina.setEnabled(false);
            this.checkSedimentosOrina.setEnabled(false);
            this.checkBacteriasCultivo.setEnabled(false);
            this.checkHongosCultivos.setEnabled(false);
            this.checkBusquedaParasitosHeces.setEnabled(false);
            this.checkBusquedaSangreHeces.setEnabled(false);
        } else if (opcion.equalsIgnoreCase("Orina")) {
            this.checkCultivoBacteriasOrina.setEnabled(true);
            this.checkCultivoHongosOrina.setEnabled(true);
            this.checkProteinasOrina.setEnabled(true);
            this.checkSedimentosOrina.setEnabled(true);

            this.checkSerieBlancaPlaquetas.setEnabled(false);
            this.checkSerieRoja.setEnabled(false);
            this.checkSerieBlancaCoagulacion.setEnabled(false);
            this.checkBacteriasCultivo.setEnabled(false);
            this.checkHongosCultivos.setEnabled(false);
            this.checkBusquedaParasitosHeces.setEnabled(false);
            this.checkBusquedaSangreHeces.setEnabled(false);
        } else if (opcion.equalsIgnoreCase("Cultivo")) {
            this.checkBacteriasCultivo.setEnabled(true);
            this.checkHongosCultivos.setEnabled(true);

            this.checkSerieBlancaPlaquetas.setEnabled(false);
            this.checkSerieRoja.setEnabled(false);
            this.checkSerieBlancaCoagulacion.setEnabled(false);
            this.checkCultivoBacteriasOrina.setEnabled(false);
            this.checkCultivoHongosOrina.setEnabled(false);
            this.checkProteinasOrina.setEnabled(false);
            this.checkSedimentosOrina.setEnabled(false);
            this.checkBusquedaParasitosHeces.setEnabled(false);
            this.checkBusquedaSangreHeces.setEnabled(false);
        } else if (opcion.equalsIgnoreCase("Heces")) {
            this.checkBusquedaParasitosHeces.setEnabled(true);
            this.checkBusquedaSangreHeces.setEnabled(true);

            this.checkSerieBlancaPlaquetas.setEnabled(false);
            this.checkSerieRoja.setEnabled(false);
            this.checkSerieBlancaCoagulacion.setEnabled(false);
            this.checkCultivoBacteriasOrina.setEnabled(false);
            this.checkCultivoHongosOrina.setEnabled(false);
            this.checkProteinasOrina.setEnabled(false);
            this.checkSedimentosOrina.setEnabled(false);
            this.checkBacteriasCultivo.setEnabled(false);
            this.checkHongosCultivos.setEnabled(false);
        }
    }//GEN-LAST:event_cboTipoPruebasLabActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea realizar este registro?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            // Aquí va el código para realizar las acciones de guardar

        } else {
            // Si el usuario selecciona "No", no se hace nada
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }
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
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboTipoPruebasLab;
    private javax.swing.JCheckBox checkBacteriasCultivo;
    private javax.swing.JCheckBox checkBusquedaParasitosHeces;
    private javax.swing.JCheckBox checkBusquedaSangreHeces;
    private javax.swing.JCheckBox checkCultivoBacteriasOrina;
    private javax.swing.JCheckBox checkCultivoHongosOrina;
    private javax.swing.JCheckBox checkHongosCultivos;
    private javax.swing.JCheckBox checkProteinasOrina;
    private javax.swing.JCheckBox checkSedimentosOrina;
    private javax.swing.JCheckBox checkSerieBlancaCoagulacion;
    private javax.swing.JCheckBox checkSerieBlancaPlaquetas;
    private javax.swing.JCheckBox checkSerieRoja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelCultivo;
    private javax.swing.JPanel panelHeces;
    private javax.swing.JPanel panelOrina;
    private javax.swing.JPanel panelSangre;
    private javax.swing.JTextField txtPrecioTotalExamen;
    // End of variables declaration//GEN-END:variables
}
