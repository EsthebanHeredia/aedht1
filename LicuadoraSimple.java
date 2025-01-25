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

    @Override
    public double llenar(double volumen) {

        if (contenido + volumen <= capacidadMaxima) {
            contenido += volumen;
            System.out.println("Licuadora llena con " + volumen + " ml. Contenido total: " + contenido + " mililitros.");
        } else {
            System.out.println("No se puede agregar " + volumen + " ml. Excede la capacidad máxima.");
        }
        return contenido;
    }

    @Override
    public double vaciar() {
        contenido = 0;
        return contenido;
    }

    @Override
    public double servir(double volumen) {
        if(volumen > 0 && volumen < contenido){
            contenido -= volumen;
        }else{
            System.out.println("No se puede vaciar " + volumen + " ml. No hay contenido suficiente.");
        }
        return contenido;
    }

    @Override
    public int incrementarVelocidad() {
        if (!encendida) {
            System.out.println("Debe encender la licuadora antes de cambiar la velocidad.");
        } else if (contenido == 0) {
            System.out.println("Debe llenar la licuadora antes de cambiar la velocidad.");
        } else if (velocidad < 10) {
            velocidad++;
            System.out.println("Velocidad incrementada a: " + velocidad);
        } else {
            System.out.println("La velocidad ya está al máximo.");
        }
        return velocidad;
    }

    @Override
    public int decrecerVelocidad() {
        if (!encendida) {
            System.out.println("Debe encender la licuadora antes de cambiar la velocidad.");
        } else if (velocidad > 0) {
            velocidad--;
            System.out.println("Velocidad disminuida a: " + velocidad);
        } else {
            System.out.println("La velocidad ya está en 0.");
        }
        return velocidad;
    }

    @Override
    public int consultarVelocidad() {
        System.out.println("La velocidad actual es: " + velocidad);
        return velocidad;
    }

    @Override
    public boolean estaLlena() {
        System.out.println("Contenido actual: " + contenido + " mililitros.");
        return contenido > 0;
    }

    @Override
    public boolean estaEncendida() {
        return encendida;
    }
}
