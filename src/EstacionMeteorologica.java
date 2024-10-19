import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;
    private float presion;
    private float humedad;

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(temperatura, presion, humedad);
        }
    }

    public void setMediciones(float temperatura, float presion, float humedad) {
        this.temperatura = temperatura;
        this.presion = presion;
        this.humedad = humedad;
        notificarObservadores();
    }
}
