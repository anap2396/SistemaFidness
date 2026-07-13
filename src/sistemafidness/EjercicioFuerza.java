package sistemafidness;

public class EjercicioFuerza extends Ejercicio {

    private String equipoNecesario;

    public EjercicioFuerza(String nombre, String descripcion, String instrucciones,
            String dificultad, int repeticiones, CategoriaEjercicio categoria,
            String equipoNecesario) {

        super(nombre, descripcion, instrucciones, dificultad, repeticiones, categoria);
        this.equipoNecesario = equipoNecesario;
    }

    public String getEquipoNecesario() {
        return equipoNecesario;
    }

    public void setEquipoNecesario(String equipoNecesario) {
        this.equipoNecesario = equipoNecesario;
    }

    @Override
    public String mostrarInformacion() {
        return "Ejercicio de fuerza\n"
                + "Nombre: " + getNombre()
                + "\nDescripción: " + getDescripcion()
                + "\nInstrucciones: " + getInstrucciones()
                + "\nDificultad: " + getDificultad()
                + "\nRepeticiones: " + getRepeticiones()
                + "\nCategoría: " + getCategoria().getNombreCategoria()
                + "\nEquipo necesario: " + equipoNecesario;
    }
}
