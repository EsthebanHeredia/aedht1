public class LicuadoraSimple implements Licuadora {
    private boolean encendida = false;
    private int velocidad = 0; // Velocidad entre 0 y 10
    private double contenido = 0; // Peso actual del contenido en la licuadora
    private final double capacidadMaxima = 1000; // Capacidad máxima en ml
}
