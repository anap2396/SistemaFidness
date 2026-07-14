package sistemafidness;

public class InicioSesion extends javax.swing.JFrame {
    
    private AdmUsuarios admUsuarios;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InicioSesion.class.getName());

    public InicioSesion() {
        initComponents();
        admUsuarios = new AdmUsuarios();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInicioSesionTitulo = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblContrasehna = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnCrearUsuario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtContrasenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInicioSesionTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblInicioSesionTitulo.setText("Iniciar Sesión");

        lblNombreUsuario.setText("Nombre de usuario");

        lblContrasehna.setText("Contraseña");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(this::btnIngresarActionPerformed);

        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(this::btnCrearUsuarioActionPerformed);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        txtContrasenha.addActionListener(this::txtContrasenhaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(lblContrasehna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContrasenha)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnIngresar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrearUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addComponent(lblInicioSesionTitulo))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblInicioSesionTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasehna, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnCrearUsuario)
                    .addComponent(btnSalir))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    
        String nombreUsuario = txtUsuario.getText().trim();
        String contrasenha = new String(txtContrasenha.getPassword());

        if (nombreUsuario.isEmpty() || contrasenha.isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe completar todos los campos.");

            return;
    }

        Usuario usuario = admUsuarios.iniciarSesion(nombreUsuario, contrasenha);

        if (usuario != null) {

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Inicio de sesión correcto.");

            MenuPrincipal menu = new MenuPrincipal();
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);

            dispose();

        } else {

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Nombre de usuario o contraseña incorrectos.");
        }
            
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtContrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenhaActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        
        CrearUsuario ventanaCrearUsuario = new CrearUsuario();
        ventanaCrearUsuario.setLocationRelativeTo(null);
        ventanaCrearUsuario.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new InicioSesion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblContrasehna;
    private javax.swing.JLabel lblInicioSesionTitulo;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JPasswordField txtContrasenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
