import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class LicuadoraSimpleTest {
    private LicuadoraSimple licuadora;

    @Before
    public void setUp() {
        licuadora = new LicuadoraSimple();
    }

    @Test
    public void testEncenderApagar() {
        licuadora.encender();
        assertTrue(licuadora.estaEncendida());

        licuadora.apagar();
        assertFalse(licuadora.estaEncendida());
    }

    @Test
    public void testLlenarYVaciado() {
        assertEquals(0, licuadora.vaciar(), 0.001);
        licuadora.llenar(500);
        assertTrue(licuadora.estaLlena());
        licuadora.vaciar();
        assertFalse(licuadora.estaLlena());
    }

    @Test
    public void testIncrementarVelocidad() {
        licuadora.encender();
        licuadora.llenar(200);
        int velocidadInicial = licuadora.consultarVelocidad();
        licuadora.incrementarVelocidad();
        assertEquals(velocidadInicial + 1, licuadora.consultarVelocidad());
    }

    @Test
    public void testNoIncrementarVelocidadSiApagada() {
        int velocidadAntes = licuadora.consultarVelocidad();
        licuadora.incrementarVelocidad();
        assertEquals(velocidadAntes, licuadora.consultarVelocidad());
    }

}