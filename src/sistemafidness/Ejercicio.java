package sistemafidness;

public class Ejercicio {

    private String nombre;
    private String descripcion;
    private String instrucciones;
    private String dificultad;
    private int repeticiones;
    private CategoriaEjercicio categoria;

    public Ejercicio(String nombre, String descripcion, String instrucciones, String dificultad, int repeticiones, CategoriaEjercicio categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.dificultad = dificultad;
        this.repeticiones = repeticiones;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public CategoriaEjercicio getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEjercicio categoria) {
        this.categoria = categoria;
    }
    
    public String mostrarInformacion() {
    return "Nombre: " + nombre
            + "\nDescripción: " + descripcion
            + "\nInstrucciones: " + instrucciones
            + "\nDificultad: " + dificultad
            + "\nRepeticiones: " + repeticiones
            + "\nCategoría: " + categoria.getNombreCategoria();
    }
    
    @Override
    public String toString() {
        return nombre;
    }     
}