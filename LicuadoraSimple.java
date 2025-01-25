public class LicuadoraSimple implements Licuadora {
    private boolean encendida = false;
    private int velocidad = 0; // Velocidad entre 0 y 10
    private double contenido = 0; // Peso actual del contenido en la licuadora
    private final double capacidadMaxima = 1000; // Capacidad máxima en ml


    @Override
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Licuadora encendida.");
        } else {
            System.out.println("La licuadora ya está encendida.");
        }
    }

    @Override
    public void apagar() {
        if (encendida) {
            encendida = false;
            velocidad = 0;
            System.out.println("Licuadora apagada.");
        } else {
            System.out.println("La licuadora ya está apagada.");
        }
    }
}
