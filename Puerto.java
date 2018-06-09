/**
 * La clase Puerto contiene informacion relacionada con 
 * el estado de los amarres existentes, el alquiler de 
 * cada amarrre y su liquidacion.
 * 
 * @author Adrian Bermejo Gonzalez, Javier de Cea Dominguez.
 * @version 09-05-2018.
 */
public class Puerto {
    Alquiler[] numeroAmarres;
    
    /**
     * Constructor para objetos de la clase Puerto.
     */
    public Puerto() {
        numeroAmarres = new Alquiler[4];
    }
    
    /**
     * Muestra por pantalla los datos referentes a los alquileres
     * de cada amarre existente.
     */
    public void verEstadoAmarres() {
        for (int contador = 0; contador < numeroAmarres.length; contador++) {
            if (numeroAmarres[contador] != null) {
                System.out.println(numeroAmarres[contador]);
            }
        }
    }
    
    /**
     * Devuelve el precio del alquiler de cada amarre.
     * 
     * @param dias El numero de dias que va a ser ocupado el amarre.
     * @param barco El barco a alquilar.
     * @return Devuelve un double con el precio del alquiler del primer amarre libre. Si 
     * no hay ningun amarre libre devuelve -1.
     */
    public double alquilarAmarre(int dias, Barco barco) {
        double aDevolver = -1;
        boolean amarreLibreEncontrado = false;
        
        for (int contador = 0; contador < numeroAmarres.length && amarreLibreEncontrado == false; contador++) {
            if (numeroAmarres[contador] == null) {
                numeroAmarres[contador] = new Alquiler(dias, barco);
                aDevolver = numeroAmarres[contador].getPrecio();
                amarreLibreEncontrado = true;
            }
        }
        return aDevolver;
    }
    
    /**
     * Devuelve el precio del amarre que el usuario introduzca 
     * por parametro y libera el alquiler de dicho amarre.
     * 
     * @param numeroAmarre El amarre concreto que va a ser liberado.
     * @return Devuelve un double que contiene el precio del amarre que 
     * va a ser liberado. Si el numero introducido por parametro no 
     * corresponde con ningun amarre existente o si ese amarre no ha sido 
     * alquilado todavia, devuelve -1.
     */
    public double liquidarAlquilerAmarre(int numeroAmarre) {
        double aDevolver = -1;
        
        if (numeroAmarre >= 0 && numeroAmarre < numeroAmarres.length && numeroAmarres[numeroAmarre] != null) {
            aDevolver = numeroAmarres[numeroAmarre].getPrecio();
            numeroAmarres[numeroAmarre] = null;
        }
        return aDevolver;
    }
    
    /**
     * Devuelve las caracteristicas del puerto.
     * 
     * @return Devuelve una cadena con las caracteristicas del puerto.
     */
    @Override
    public String toString() {
        return "";
    }
}