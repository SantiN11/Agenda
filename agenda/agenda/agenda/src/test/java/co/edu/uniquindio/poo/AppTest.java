/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");
        assertThrows(Throwable.class, ()->new Contacto("", "", "", "", ""));
        LOG.info("Finalizando test datosVacios");
    }
    @Test
    public void validacionCorreo() {
        LOG.info("Iniciado test validacionCorreo");
        assertThrows(Throwable.class, ()-> new Contacto("Santiago", "Santi", "En la mondá", "23", "luisa"));
        LOG.info("Finalizando test validacionCorreo");
    }
}
