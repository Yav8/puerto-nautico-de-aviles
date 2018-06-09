/**
 * La clase Velero contiene informacion de aquellos barcos 
 * considerados veleros.
 *
 * @author Adrian Bermejo Gonzalez, Javier de Cea Dominguez.
 * @version 09-05-2018.
 */
public class Velero extends Barco
{
    private int mastiles;

    /**
     * Constructor para objetos de la clase Velero.
     * 
     * @param matricula La matricula del velero.
     * @param eslora La longitud en metros del velero.
     * @param anoFabricacion El ano en que se ha fabricado el velero.
     * @param persona El cliente interesado en el velero.
     * @param mastiles El numero de mastiles del velero.
     */
    public Velero(String matricula, double eslora, int anoFabricacion, Persona persona, int mastiles)
    {
        super(matricula, eslora, anoFabricacion, persona);
        this.mastiles = mastiles;
    }

    /**
     * Devuelve el coeficiente bernua.
     * 
     * @return Devuelve un int que es el coeficiente bernua.
     */
    public int getCoeficienteBernua()
    {
        return mastiles;
    }

    /**
     * Devuelve toda la informacion del velero.
     * 
     * @return Devuelve una cadena con toda la informacion del velero.
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        aDevolver += super.toString();
        aDevolver += "numero de mastiles: " + mastiles + "\n";
        return aDevolver;
    } 
}