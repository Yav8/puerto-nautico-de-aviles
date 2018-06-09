/**
 * La clase EmbarcacionAMotor contiene informacion de aquellos
 * barcos que funcionan con motor.
 *
 * @author Adrian Bermejo Gonzalez, Javier de Cea Dominguez.
 * @version 09-05-2018.
 */
public class EmbarcacionAMotor extends Barco
{
    private int potenciaCV;

    /**
     * Constructor para objetos de la clase EmbarcacionAMotor.
     * 
     * @param matricula La matricula del barco a motor.
     * @param eslora La longitud en metros del barco a motor.
     * @param anoFabricacion El ano en que se ha fabricado el barco a motor.
     * @param persona El cliente interesado en el barco a motor.
     * @param potenciaCV La potencia en CV del barco a motor.
     */
    public EmbarcacionAMotor(String matricula, double eslora, int anoFabricacion, Persona persona, int potenciaCV)
    {
        super(matricula, eslora, anoFabricacion, persona);
        this.potenciaCV = potenciaCV;
    }

    /**
     * Devuelve el Coeficiente Bernua.
     * 
     * @return potenciaCV.
     */
    public int getCoeficienteBernua()
    {
        return potenciaCV;
    }

    /**
     * Devuelve la informacion de la entrada.
     * 
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString()
    {
        String aDevolver= "";
        aDevolver += super.toString();
        aDevolver += "potenciaCV: " + potenciaCV + "\n";
        return aDevolver;
    }
}