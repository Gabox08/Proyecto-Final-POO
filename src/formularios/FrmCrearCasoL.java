/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.DCasoLaboral;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FrmCrearCasoL extends javax.swing.JFrame {

    private DCasoLaboral casoLaboral = new DCasoLaboral();
    private boolean esNuevo=true;
    private int posActual = 0;
    private int idCaso = 0; 
    private String caso= "";
    
    private void limpiar(){
        TfFecha.setText(null);
        TfMontoLitigar.setText(null);
        TfPorcentajeGanancia.setText(null);
        TfDescripcion.setText(null);
        TfPoderGeneralJudicial.setText(null);
        TfMontoLitigar.requestFocus();
    }
    
    private void mostrarEnTF(int fila){
        if(!casoLaboral.getLista().isEmpty()){
            caso = casoLaboral.getLista().get(fila).getTipoCaso();
            TfEstado.setText(casoLaboral.getLista().get(fila).getEstadoCaso());
            TfDescripcion.setText(casoLaboral.getLista().get(fila).getDescripcionProblema());
            TfFecha.setText(String.valueOf(casoLaboral.getLista().get(fila).getFecha()));
            TfMontoLitigar.setText(String.valueOf(casoLaboral.getLista().get(fila).getMontoALitigar()));
            TfPorcentajeGanancia.setText(String.valueOf(casoLaboral.getLista().get(fila).getPorcentajeGanancia()));
            TfPoderGeneralJudicial.setText(casoLaboral.getLista().get(fila).getPoderGeneralJudicial());
            idCaso = casoLaboral.getLista().get(fila).getId_caso();
            esNuevo = false;
            
            int ultReg = casoLaboral.getLista().size();
            LbCantidad.setText("" + (fila + 1) + " de " + ultReg);
            TfFecha.requestFocus();
    
    
        }else{
            limpiar();
        
        }
    
    
    }

    
    /**
     * Creates new form FrmCasoL
     */
    public FrmCrearCasoL() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        BtnAnterior = new javax.swing.JButton();
        LbCantidad = new javax.swing.JLabel();
        BtnSiguiente = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        BtnActualizarBD = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LabelMontoLitigar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TfMontoLitigar = new javax.swing.JTextField();
        TfPorcentajeGanancia = new javax.swing.JTextField();
        TfPoderGeneralJudicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TfFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TfDescripcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TfEstado = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setTitle("Caso Laboral");

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Nuevo.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setFocusable(false);
        BtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Guardar.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.setFocusable(false);
        BtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setFocusable(false);
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BtnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/anterior.png"))); // NOI18N
        BtnAnterior.setText("Anterior");
        BtnAnterior.setFocusable(false);
        BtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnteriorActionPerformed(evt);
            }
        });

        LbCantidad.setText("0 de 0");

        BtnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/next.png"))); // NOI18N
        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.setFocusable(false);
        BtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        BtnActualizarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/ActualizarBD.png"))); // NOI18N
        BtnActualizarBD.setText("Actualizar BD");
        BtnActualizarBD.setFocusable(false);
        BtnActualizarBD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnActualizarBD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnActualizarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarBDActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Caso Laboral"));

        LabelMontoLitigar.setText("Monto a litigar");

        jLabel4.setText("Poder general judicial");

        jLabel5.setText("Porcentaje de ganancia");

        jLabel3.setText("Fecha");

        jLabel6.setText("Descripcion del Problema");

        jLabel7.setText("Estado del Caso: ");

        TfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelMontoLitigar)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TfPoderGeneralJudicial, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(TfMontoLitigar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfPorcentajeGanancia)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMontoLitigar)
                    .addComponent(TfMontoLitigar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TfPoderGeneralJudicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TfPorcentajeGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAnterior)
                        .addGap(78, 78, 78)
                        .addComponent(LbCantidad)
                        .addGap(60, 60, 60)
                        .addComponent(BtnSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(BtnActualizarBD)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 359, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 359, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 359, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 359, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnActualizarBD)
                            .addComponent(BtnSiguiente)
                            .addComponent(BtnNuevo)
                            .addComponent(BtnGuardar)
                            .addComponent(BtnEliminar)
                            .addComponent(BtnAnterior)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(LbCantidad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 170, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 170, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 170, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 170, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        if(TfEstado.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar la Estado", "Caso_laboral", JOptionPane.WARNING_MESSAGE);
            this.TfFecha.requestFocus();
            return;
        }
        if(TfFecha.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar la fecha", "Caso Laboral", JOptionPane.WARNING_MESSAGE);
            this.TfFecha.requestFocus();
            return;
        } 
        if(TfMontoLitigar.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar el monto a litigar", "Caso Laboral", JOptionPane.WARNING_MESSAGE);
            this.TfMontoLitigar.requestFocus();
            return;
        }
         if(TfPorcentajeGanancia.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar un porcentaje ganancia", "Caso Laboral", JOptionPane.WARNING_MESSAGE);
            this.TfPorcentajeGanancia.requestFocus();
            return;
        }
         
         if(TfDescripcion.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar la descripción", "Caso Laboral", JOptionPane.WARNING_MESSAGE);
            this.TfDescripcion.requestFocus();
            return;
        }
        if(TfPoderGeneralJudicial.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar el Poder general judicial", "Caso Penal", JOptionPane.WARNING_MESSAGE);
            this.TfPoderGeneralJudicial.requestFocus();
            return;
        }
        
        int b = 0;
        if(esNuevo){
            
            b = casoLaboral.agregarCasoLaboral(TfDescripcion.getText(), TfFecha.getText(), TfEstado.getText(), Float.parseFloat(TfMontoLitigar.getText()), TfPoderGeneralJudicial.getText(), Integer.parseInt(TfPorcentajeGanancia.getText()));
        }else{
        
            b = casoLaboral.editarCasoLaboral(idCaso, TfDescripcion.getText(), TfFecha.getText(), TfEstado.getText(), Float.parseFloat(TfMontoLitigar.getText()), TfPoderGeneralJudicial.getText(), Integer.parseInt(TfPorcentajeGanancia.getText()));
        }
        
        if (b == 1){
        JOptionPane.showMessageDialog(this, "Registro guardado...",
            "Caso_Laboral", JOptionPane.INFORMATION_MESSAGE);
        posActual = casoLaboral.getLista().size();
        
        }else{
            JOptionPane.showMessageDialog(this, "Error al guardar registro",
                    "Caso_Laboral", JOptionPane.ERROR_MESSAGE);
              
        
        }
        
        this.mostrarEnTF(0);
        limpiar();
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        esNuevo = true;
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void TfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfEstadoActionPerformed

    private void BtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnteriorActionPerformed
        // TODO add your handling code here:
        if (posActual == 0) posActual = casoLaboral.getLista().size();
        posActual--;
        this.mostrarEnTF(posActual);
    }//GEN-LAST:event_BtnAnteriorActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        // TODO add your handling code here:
       posActual++;
       if (posActual == casoLaboral.getLista().size()) posActual = 0;  
       this.mostrarEnTF(posActual); 
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnActualizarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarBDActionPerformed
        // TODO add your handling code here:
        String msn = casoLaboral.actualizarBD();
        JOptionPane.showMessageDialog(this, msn, "Actualizar Base de Datos",
                JOptionPane.INFORMATION_MESSAGE);
        posActual =0;
        mostrarEnTF(posActual);
    }//GEN-LAST:event_BtnActualizarBDActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCrearCasoL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearCasoL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearCasoL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearCasoL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearCasoL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarBD;
    private javax.swing.JButton BtnAnterior;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JLabel LabelMontoLitigar;
    private javax.swing.JLabel LbCantidad;
    private javax.swing.JTextField TfDescripcion;
    private javax.swing.JTextField TfEstado;
    private javax.swing.JTextField TfFecha;
    private javax.swing.JTextField TfMontoLitigar;
    private javax.swing.JTextField TfPoderGeneralJudicial;
    private javax.swing.JTextField TfPorcentajeGanancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
