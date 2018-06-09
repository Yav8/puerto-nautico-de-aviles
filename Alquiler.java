/**
 * La clase Alquiler contiene informacion relacionada con 
 * el precio y dias que se alquila un barco.
 * 
 * @author Adrian Bermejo Gonzalez, Javier de Cea Dominguez.
 * @version 09-05-2018.
 */
public class Alquiler {
    public static final int MULTIPLICADOR_ESLORA = 10;
    public static final int PRECIO_BASE = 300;
    private int dias;
    private Barco barco;
    
    /**
     * Constructor para objetos de la clase Alquiler.
     * 
     * @param dias El numero de dias que se alquila un barco.
     * @param barco El barco a alquilar.
     */
    public Alquiler(int dias, Barco barco) {
        this.dias = dias;
        this.barco = barco;
    }
    
    /**
     * Devuelve el precio del alquiler.
     * 
     * @return Devuelve un double que es el precio del alquiler.
     */
    public double getPrecio() {
        return (dias * MULTIPLICADOR_ESLORA * barco.getEslora()) + (PRECIO_BASE * barco.getCoeficienteBernua());
    }
    
    /**
     * Devuelve toda la informacion del alquiler.
     * 
     * @return Devuelve una cadena con toda la informacion del alquiler.
     */
    @Override
    public String toString() {
        return getPrecio() + " es el precio del alquiler del siguiente barco:\n" + barco;
    }
}