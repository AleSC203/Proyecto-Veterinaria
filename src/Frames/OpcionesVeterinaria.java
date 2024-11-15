
package Frames;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class OpcionesVeterinaria extends javax.swing.JFrame {

        public OpcionesVeterinaria() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        desktopPane = new DesktopConFondo("/Imagenes/Desktop1.png");
        desktopPane.setOpaque(false);
        menuBar = new javax.swing.JMenuBar();
        opcionSalir = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        opcionProcesosCitas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opcionListPacientes = new javax.swing.JMenuItem();
        opcionListCitasPacientes = new javax.swing.JMenuItem();
        opcionListCitasFechas = new javax.swing.JMenuItem();
        opcionListPruebaLabPaciente = new javax.swing.JMenuItem();
        opcionListResumenCitaPaci = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        opcionManEspeciesyRazas = new javax.swing.JMenuItem();
        opcionManPruebasLab = new javax.swing.JMenuItem();
        opcionManMotivo = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(desktopPane);

        opcionSalir.setMnemonic('f');
        opcionSalir.setText("Salir");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Salir");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        opcionSalir.add(openMenuItem);

        menuBar.add(opcionSalir);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Procesos");

        opcionProcesosCitas.setMnemonic('a');
        opcionProcesosCitas.setText("Proceso de Citas");
        opcionProcesosCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionProcesosCitasActionPerformed(evt);
            }
        });
        helpMenu.add(opcionProcesosCitas);

        menuBar.add(helpMenu);

        jMenu3.setText("Reportes");
        jMenu3.setEnabled(false);

        opcionListPacientes.setText("Listado de pacientes");
        opcionListPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionListPacientesActionPerformed(evt);
            }
        });
        jMenu3.add(opcionListPacientes);

        opcionListCitasPacientes.setText("Listado de citas por paciente");
        opcionListCitasPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionListCitasPacientesActionPerformed(evt);
            }
        });
        jMenu3.add(opcionListCitasPacientes);

        opcionListCitasFechas.setText("Listado de citas por fecha");
        opcionListCitasFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionListCitasFechasActionPerformed(evt);
            }
        });
        jMenu3.add(opcionListCitasFechas);

        opcionListPruebaLabPaciente.setText("Listado de pruebas de laboratorio por paciente");
        opcionListPruebaLabPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionListPruebaLabPacienteActionPerformed(evt);
            }
        });
        jMenu3.add(opcionListPruebaLabPaciente);

        opcionListResumenCitaPaci.setText("Resumen de la cita por paciente");
        opcionListResumenCitaPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionListResumenCitaPaciActionPerformed(evt);
            }
        });
        jMenu3.add(opcionListResumenCitaPaci);

        menuBar.add(jMenu3);

        editMenu.setMnemonic('e');
        editMenu.setText("Mantenimientos");
        editMenu.setEnabled(false);

        opcionManEspeciesyRazas.setMnemonic('p');
        opcionManEspeciesyRazas.setText("Mantenimiento de Especies y Razas");
        opcionManEspeciesyRazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionManEspeciesyRazasActionPerformed(evt);
            }
        });
        editMenu.add(opcionManEspeciesyRazas);

        opcionManPruebasLab.setMnemonic('d');
        opcionManPruebasLab.setText("Mantenimiento Pruebas Laboratorio");
        editMenu.add(opcionManPruebasLab);

        opcionManMotivo.setMnemonic('c');
        opcionManMotivo.setText("Mantenimiento Motivo");
        opcionManMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionManMotivoActionPerformed(evt);
            }
        });
        editMenu.add(opcionManMotivo);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        this.formWindowClosing(new WindowEvent(this, 0));

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Deseas Salir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == 1) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void opcionManMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionManMotivoActionPerformed

    }//GEN-LAST:event_opcionManMotivoActionPerformed

    private void opcionListPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionListPacientesActionPerformed

        //Ventana para mostrar la informacion de el paciente seleccionado
        //nombre,sexo,especie,raza, nombre dueño y telefono
    }//GEN-LAST:event_opcionListPacientesActionPerformed

    private void opcionManEspeciesyRazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionManEspeciesyRazasActionPerformed

        
    }//GEN-LAST:event_opcionManEspeciesyRazasActionPerformed

    private void opcionListCitasPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionListCitasPacientesActionPerformed

        //mostrar las citas que se le han hecho a un paciente especifico con la informacion basica de esas citas
    }//GEN-LAST:event_opcionListCitasPacientesActionPerformed

    private void opcionListCitasFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionListCitasFechasActionPerformed

        //se debe poder observar la informacion de las citas que se realizaron un dia especifico de todos los pacientes
        //Se debe ver la informacion basica de los pacientes y el costo de la cita
    }//GEN-LAST:event_opcionListCitasFechasActionPerformed

    private void opcionListPruebaLabPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionListPruebaLabPacienteActionPerformed

        //Se muestra todas las prubas de laboratorio realizadas a un paciente especifico 
    }//GEN-LAST:event_opcionListPruebaLabPacienteActionPerformed

    private void opcionListResumenCitaPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionListResumenCitaPaciActionPerformed

        //en esta se muestra toda la informacion del paciente en su ultima cita
    }//GEN-LAST:event_opcionListResumenCitaPaciActionPerformed

    private void opcionProcesosCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionProcesosCitasActionPerformed
        // TODO add your handling code here:
        FrmProcesoCitas obj = new FrmProcesoCitas();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_opcionProcesosCitasActionPerformed


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
            java.util.logging.Logger.getLogger(OpcionesVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesVeterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem opcionListCitasFechas;
    private javax.swing.JMenuItem opcionListCitasPacientes;
    private javax.swing.JMenuItem opcionListPacientes;
    private javax.swing.JMenuItem opcionListPruebaLabPaciente;
    private javax.swing.JMenuItem opcionListResumenCitaPaci;
    private javax.swing.JMenuItem opcionManEspeciesyRazas;
    private javax.swing.JMenuItem opcionManMotivo;
    private javax.swing.JMenuItem opcionManPruebasLab;
    private javax.swing.JMenuItem opcionProcesosCitas;
    private javax.swing.JMenu opcionSalir;
    private javax.swing.JMenuItem openMenuItem;
    // End of variables declaration//GEN-END:variables

}
