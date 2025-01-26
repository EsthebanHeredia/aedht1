public interface Licuadora {
    // Enciende la licuadora
    void encender();

    // Apaga la licuadora
    void apagar();

    // Devuelve si la licuadora está encendida
    boolean estaEncendida();

    // Llena la licuadora con un volumen especificado y devuelve el volumen restante
    double llenar(double volumen);

    // Vacía la licuadora y devuelve el volumen vaciado
    double vaciar();

    // Sirve una cantidad especificada y devuelve el volumen servido
    double servir(double volumen);

    // Incrementa la velocidad y devuelve la nueva velocidad
    int incrementarVelocidad();

    // Disminuye la velocidad y devuelve la nueva velocidad
    int decrecerVelocidad();

    // Consulta la velocidad actual de la licuadora
    int consultarVelocidad();

    // Devuelve si la licuadora está llena
    boolean estaLlena();
}