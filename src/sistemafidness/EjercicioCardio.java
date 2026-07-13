package sistemafidness;

public class EjercicioCardio extends Ejercicio {

    private int duracionMinutos;

    public EjercicioCardio(String nombre, String descripcion, String instrucciones,
            String dificultad, int repeticiones, CategoriaEjercicio categoria,
            int duracionMinutos) {

        super(nombre, descripcion, instrucciones, dificultad, repeticiones, categoria);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String mostrarInformacion() {
        return "Ejercicio cardiovascular\n"
                + "Nombre: " + getNombre()
                + "\nDescripción: " + getDescripcion()
                + "\nInstrucciones: " + getInstrucciones()
                + "\nDificultad: " + getDificultad()
                + "\nRepeticiones: " + getRepeticiones()
                + "\nCategoría: " + getCategoria().getNombreCategoria()
                + "\nDuración: " + duracionMinutos + " minutos";
    } 
}
