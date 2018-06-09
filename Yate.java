/**
 * La clase Yate contiene informacion relacionada 
 * con los barcos yate especificos.
 *
 * @author Adrian Bermejo Gonzalez, Javier de Cea Dominguez.
 * @version 09-05-2018.
 */
public class Yate extends EmbarcacionAMotor
{
    private int camarotes;

    /**
     * Constructor para objetos de la clase Yate.
     * 
     * @param matricula La matricula del yate.
     * @param eslora La longitud en metros del yate.
     * @param anoFabricacion El ano en que se ha fabricado el yate.
     * @param persona El cliente interesado en el yate.
     * @param potenciaCV La potencia en CV del yate.
     * @param camarote El numero de camarotes del yate.
     */
    public Yate(String matricula, double eslora, int anoFabricacion, Persona persona, int potenciaCV, int camarotes)
    {
        super(matricula, eslora, anoFabricacion, persona, potenciaCV);
        this.camarotes = camarotes;
    }

    /**
     * Devuelve el coeficiente bernua.
     * 
     * @return Devuelve un int que es el coeficiente bernua.
     */
    public int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + camarotes;
    }

    /**
     * Devuelve la informacion del yate.
     * 
     * @return Devuelve una cadena con toda la informacion del yate.
     */
    @Override
    public String toString()
    {
        String aDevolver= "";
        aDevolver += super.toString();
        aDevolver += "numero de camarotes: " + camarotes + "\n";
        return aDevolver;
    }
}