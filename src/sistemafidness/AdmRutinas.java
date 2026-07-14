package sistemafidness;

public class AdmRutinas {

    private static Rutina rutinaActual;

    public static Rutina getRutinaActual() {
        return rutinaActual;
    }

    public static void setRutinaActual(Rutina rutinaActual) {
        AdmRutinas.rutinaActual = rutinaActual;
    }
}
