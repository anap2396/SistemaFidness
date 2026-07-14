package sistemafidness;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoUsuarios {

    private static final String NOMBRE_ARCHIVO = "Usuarios.user";

    public static void escribirUsuarios(ArrayList<Usuario> listaUsuarios) throws IOException {

        try (ObjectOutputStream salida = new ObjectOutputStream(
                new FileOutputStream(NOMBRE_ARCHIVO))) {

            salida.writeObject(listaUsuarios);
        }
    }

    public static ArrayList<Usuario> leerUsuarios()
            throws IOException, ClassNotFoundException {

        try (ObjectInputStream entrada = new ObjectInputStream(
                new FileInputStream(NOMBRE_ARCHIVO))) {

            return (ArrayList<Usuario>) entrada.readObject();
        }
    }
}