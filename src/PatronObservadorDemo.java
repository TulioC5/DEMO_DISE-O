public class PatronObservadorDemo {
    public static void main(String[] args) {
        EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica();
        INSIVUMEH insivumeh = new INSIVUMEH();

        estacionMeteorologica.agregarObservador(insivumeh);

        // Simulación de nuevos datos meteorológicos
        estacionMeteorologica.setMediciones(25.3f, 1012.5f, 78.0f);
        estacionMeteorologica.setMediciones(22.1f, 1008.7f, 81.0f);
    }
}