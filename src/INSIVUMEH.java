public class INSIVUMEH implements Observador {
    @Override
    public void actualizar(float temperatura, float presion, float humedad) {
        System.out.println("INSIVUMEH ha recibido una actualización:");
        System.out.println("Temperatura: " + temperatura + "C");
        System.out.println("Presión: " + presion + " hPa");
        System.out.println("Humedad: " + humedad + "%\n");
    }
}