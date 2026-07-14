package sistemafidness;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CrearRutina extends javax.swing.JFrame {
    
    private AdmEjercicios admEjercicios;

    private DefaultListModel<Ejercicio> modeloDisponibles;
    private DefaultListModel<Ejercicio> modeloRutina;

    private ArrayList<Ejercicio> ejerciciosRutina;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CrearRutina.class.getName());
    
    public CrearRutina() {
       
        initComponents();

        admEjercicios = new AdmEjercicios();

        modeloDisponibles = new DefaultListModel<>();
        modeloRutina = new DefaultListModel<>();

        ejerciciosRutina = new ArrayList<>();

        lstEjerciciosDisponibles.setModel(modeloDisponibles);
        lstEjerciciosRutina.setModel(modeloRutina);

        cargarEjercicios();
    }

    private void cargarEjercicios() {

        modeloDisponibles.clear();

        for (Ejercicio ejercicio : admEjercicios.getListaEjercicios()) {
            modeloDisponibles.addElement(ejercicio);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCrearRutinaTitulo = new javax.swing.JLabel();
        lblNombreRutina = new javax.swing.JLabel();
        txtNombreRutina = new javax.swing.JTextField();
        lblEjerciciosDisponibles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEjerciciosDisponibles = new javax.swing.JList<>();
        lblRutina = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        btnGuardarRutina = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEjerciciosRutina = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCrearRutinaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCrearRutinaTitulo.setText("Crear Rutina");

        lblNombreRutina.setText("Nombre de la rutina");

        txtNombreRutina.addActionListener(this::txtNombreRutinaActionPerformed);

        lblEjerciciosDisponibles.setText("Ejercicios disponibles");

        jScrollPane1.setViewportView(lstEjerciciosDisponibles);

        lblRutina.setText("Rutina");

        btnAgregar.setText("Agregar +");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnQuitar.setText("Quitar -");
        btnQuitar.addActionListener(this::btnQuitarActionPerformed);

        btnGuardarRutina.setText("Guardar Rutina");
        btnGuardarRutina.addActionListener(this::btnGuardarRutinaActionPerformed);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(this::btnRegresarActionPerformed);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        jScrollPane3.setViewportView(lstEjerciciosRutina);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(lblCrearRutinaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(lblNombreRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(114, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEjerciciosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(btnGuardarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCrearRutinaTitulo)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreRutina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutina)
                    .addComponent(lblEjerciciosDisponibles))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnQuitar)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarRutina)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRutinaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        Ejercicio ejercicio = lstEjerciciosDisponibles.getSelectedValue();

        if (ejercicio == null) {

            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un ejercicio.");

            return;
    }
        if (!ejerciciosRutina.contains(ejercicio)) {

            ejerciciosRutina.add(ejercicio);
            modeloRutina.addElement(ejercicio);

        } else {

            JOptionPane.showMessageDialog(this,
                    "El ejercicio ya fue agregado a la rutina.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        
        Ejercicio ejercicio = lstEjerciciosRutina.getSelectedValue();

        if (ejercicio == null) {

            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un ejercicio de la rutina.");

            return;
        }
        ejerciciosRutina.remove(ejercicio);
        modeloRutina.removeElement(ejercicio);
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnGuardarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRutinaActionPerformed
        
        String nombreRutina = txtNombreRutina.getText().trim();

        if (nombreRutina.isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Debe ingresar el nombre de la rutina.");

            return;
        }

        if (ejerciciosRutina.isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Debe agregar al menos un ejercicio.");

            return;
        }

        Rutina rutina = new Rutina(nombreRutina);

        for (Ejercicio ejercicio : ejerciciosRutina) {
        rutina.agregarEjercicio(ejercicio);
        }
        
        AdmRutinas.setRutinaActual(rutina);
        
        System.out.println("Rutina guardada: " + AdmRutinas.getRutinaActual().getNombreRutina());

            JOptionPane.showMessageDialog(this,
                    "Rutina guardada correctamente.");

            txtNombreRutina.setText("");
            ejerciciosRutina.clear();
            modeloRutina.clear();
            txtNombreRutina.requestFocus();

    }//GEN-LAST:event_btnGuardarRutinaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CrearRutina().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardarRutina;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCrearRutinaTitulo;
    private javax.swing.JLabel lblEjerciciosDisponibles;
    private javax.swing.JLabel lblNombreRutina;
    private javax.swing.JLabel lblRutina;
    private javax.swing.JList<Ejercicio> lstEjerciciosDisponibles;
    private javax.swing.JList<Ejercicio> lstEjerciciosRutina;
    private javax.swing.JTextField txtNombreRutina;
    // End of variables declaration//GEN-END:variables
}
