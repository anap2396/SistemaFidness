package sistemafidness;

import java.io.IOException;

import java.util.ArrayList;

public class AdmUsuarios {

    private ArrayList<Usuario> listaUsuarios;

    public AdmUsuarios() {

        try {
            listaUsuarios = ArchivoUsuarios.leerUsuarios();
        } catch (IOException | ClassNotFoundException ex) {
            listaUsuarios = new ArrayList<>();
        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public boolean registrarUsuario(Usuario usuario) {

        for (Usuario u : listaUsuarios) {

            if (u.getNombreUsuario().equalsIgnoreCase(usuario.getNombreUsuario())) {
                return false;
            }
        }

        listaUsuarios.add(usuario);

        try {
            ArchivoUsuarios.escribirUsuarios(listaUsuarios);
        } catch (IOException ex) {
            listaUsuarios.remove(usuario);
            return false;
        }

        return true;
    }

    public Usuario iniciarSesion(String nombreUsuario, String contrasenha) {

        for (Usuario u : listaUsuarios) {

            if (u.getNombreUsuario().equalsIgnoreCase(nombreUsuario)
                    && u.getContrasenha().equals(contrasenha)) {

                return u;
            }
        }

        return null;
    }

    public Usuario buscarUsuario(String nombreUsuario) {

        for (Usuario u : listaUsuarios) {

            if (u.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return u;
            }
        }

        return null;
    }
}