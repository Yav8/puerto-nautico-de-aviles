

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    private Persona persona1;
    private EmbarcacionAMotor embarcac1;
    private Alquiler alquiler1;
    private Puerto puerto1;

    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        persona1 = new Persona("fdsa", "asdf");
        embarcac1 = new EmbarcacionAMotor("fasd", 25, 54, persona1, 5);
        alquiler1 = new Alquiler(5, embarcac1);
        alquiler1.toString();
        alquiler1.getPrecio();
        puerto1 = new Puerto();
        puerto1.verEstadoAmarres();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
