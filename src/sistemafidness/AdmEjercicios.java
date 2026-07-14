package sistemafidness;

import java.util.ArrayList;

public class AdmEjercicios {

    private ArrayList<Ejercicio> listaEjercicios;

    public AdmEjercicios() {
        listaEjercicios = new ArrayList<>();
        cargarEjercicios();
    }

    public ArrayList<Ejercicio> getListaEjercicios() {
        return listaEjercicios;
    }

    private void cargarEjercicios() {

        CategoriaEjercicio fuerza = new CategoriaEjercicio(1, "Fuerza");
        CategoriaEjercicio cardio = new CategoriaEjercicio(2, "Cardio");

        listaEjercicios.add(new EjercicioFuerza(
                "Sentadillas",
                "Fortalece piernas",
                "Realizar 3 series de 25 repeticiones",
                "Media",
                25,
                fuerza,
                "Peso corporal"));
        
         listaEjercicios.add(new EjercicioFuerza(
            "Peso muerto",
            "Fortalece espalda y piernas",
            "Realizar 4 series de 10 repeticiones",
            "Alta",
            10,
            fuerza,
            "Barra"));
         
         listaEjercicios.add(new EjercicioFuerza(
            "Plancha",
            "Fortalece abdomen y zona media",
            "Mantener la posición durante el tiempo indicado",
            "Media",
            3,
            fuerza,
            "Peso corporal"));
         
         listaEjercicios.add(new EjercicioFuerza(
            "Fondos para tríceps",
            "Fortalece tríceps y pecho",
            "Realizar 3 series de 12 repeticiones",
            "Media",
            12,
            fuerza,
            "Banco"));

        listaEjercicios.add(new EjercicioFuerza(
                "Flexiones",
                "Fortalece pecho y brazos",
                "Realizar 3 series de 12 repeticiones",
                "Alta",
                12,
                fuerza,
                "Ninguno"));

        listaEjercicios.add(new EjercicioCardio(
                "Correr",
                "Mejora la resistencia",
                "Correr a ritmo moderado",
                "Media",
                0,
                cardio,
                30));

        listaEjercicios.add(new EjercicioCardio(
                "Saltar en trampolín",
                "Ejercicio cardiovascular",
                "Saltar en bucle o coreografía",
                "Alta",
                0,
                cardio,
                20));
        
         listaEjercicios.add(new EjercicioCardio(
            "Saltar cuerda",
            "Incrementa la resistencia física",
            "Saltar continuamente",
            "Alta",
            0,
            cardio,
            20));

        listaEjercicios.add(new EjercicioCardio(
            "Circuito cardiovascular",
            "Combinación de ejercicios cardiovasculares",
            "Alternar jumping jacks, burpees y trote durante el tiempo indicado",
            "Alta",
            0,
            cardio,
            25));
    }
}