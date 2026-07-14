package sistemafidness;

import javax.swing.table.DefaultTableModel;

public class ConsultarEjercicios extends javax.swing.JFrame {
    
    private AdmEjercicios admEjercicios;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultarEjercicios.class.getName());
    
    public ConsultarEjercicios() {
        initComponents();
        admEjercicios = new AdmEjercicios();
        cargarTabla(admEjercicios.getListaEjercicios());
    }
    
    private void cargarTabla(java.util.ArrayList<Ejercicio> ejercicios) {

    DefaultTableModel modelo = (DefaultTableModel) tblEjercicios.getModel();

    modelo.setRowCount(0);

    for (Ejercicio ejercicio : ejercicios) {

        Object[] fila = {
            ejercicio.getNombre(),
            ejercicio.getDescripcion(),
            ejercicio.getDificultad(),
            ejercicio.getRepeticiones(),
            ejercicio.getCategoria().getNombreCategoria()
        };

        modelo.addRow(fila);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConsultarEjerciciosTitulo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEjercicios = new javax.swing.JTable();
        btnVerInformacion = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConsultarEjerciciosTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblConsultarEjerciciosTitulo.setText("Consultar ejercicios");

        lblCategoria.setText("Categoría");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Fuerza", "Cardio" }));
        cmbCategoria.addActionListener(this::cmbCategoriaActionPerformed);

        tblEjercicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Dificultad", "Repeticiones", "Categoría"
            }
        ));
        jScrollPane1.setViewportView(tblEjercicios);

        btnVerInformacion.setText("Ver información");
        btnVerInformacion.addActionListener(this::btnVerInformacionActionPerformed);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(this::btnRegresarActionPerformed);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(lblConsultarEjerciciosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnVerInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultarEjerciciosTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerInformacion)
                            .addComponent(btnSalir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(63, 63, 63))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        
        String categoriaSeleccionada = cmbCategoria.getSelectedItem().toString();

        if (categoriaSeleccionada.equals("Todos")) {

            cargarTabla(admEjercicios.getListaEjercicios());

        } else {

            java.util.ArrayList<Ejercicio> ejerciciosFiltrados = new java.util.ArrayList<>();

            for (Ejercicio ejercicio : admEjercicios.getListaEjercicios()) {

                if (ejercicio.getCategoria().getNombreCategoria()
                    .equalsIgnoreCase(categoriaSeleccionada)) {

                    ejerciciosFiltrados.add(ejercicio);
            }
        }

            cargarTabla(ejerciciosFiltrados);
        }
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInformacionActionPerformed
        
        int filaSeleccionada = tblEjercicios.getSelectedRow();

        if (filaSeleccionada == -1) {

            javax.swing.JOptionPane.showMessageDialog(this,
                "Debe seleccionar un ejercicio.");

            return;
        }

        String nombreEjercicio = tblEjercicios
                .getValueAt(filaSeleccionada, 0)
                .toString();

        Ejercicio ejercicioSeleccionado = null;

        for (Ejercicio ejercicio : admEjercicios.getListaEjercicios()) {

            if (ejercicio.getNombre().equals(nombreEjercicio)) {
                ejercicioSeleccionado = ejercicio;
                break;
            }
        }

        if (ejercicioSeleccionado != null) {

            javax.swing.JOptionPane.showMessageDialog(this,
                    ejercicioSeleccionado.mostrarInformacion(),
                    "Información del ejercicio",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVerInformacionActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ConsultarEjercicios().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerInformacion;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblConsultarEjerciciosTitulo;
    private javax.swing.JTable tblEjercicios;
    // End of variables declaration//GEN-END:variables
}
