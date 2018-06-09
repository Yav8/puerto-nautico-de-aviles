/**
 * La clase Barco contiene informacion comun a todos los tipos de barcos.
 *
 * @author Adrian Bermejo Gonzalez, Javier de Cea Dominguez.
 * @version 09-05-2018.
 */
public abstract class Barco
{
    private String matricula;
    private double eslora ;
    private int anoFabricacion;
    private Persona persona;

    /**
     * Constructor para objetos de la clase Barco.
     * 
     * @param matricula La matricula del barco.
     * @param eslora La longitud en metros del barco.
     * @param anoFabricacion El ano en que se ha fabricado el barco.
     * @param persona El cliente interesado en el barco.
     */
    public Barco(String matricula, double eslora, int anoFabricacion, Persona persona)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.persona = persona;
    }
    
    /**
     * Devuelve la eslora.
     * 
     * @return eslora.
     */
    public double getEslora()
    {
        return eslora;
    }

    /**
     * Devuelve el coeficiente bernua.
     * 
     * @return Devuelve un entero que es el coeficiente bernua.
     */
    public abstract int getCoeficienteBernua();

    /**
     * Devuelve la informacion del barco.
     * 
     * @return Devuelve una cadena con toda la informacion del barco.
     */
    @Override
    public String toString()
    {
        String aDevolver= "";
        aDevolver += "Matricula: " + matricula + "\n";
        aDevolver += "Eslora: " + getEslora() + "\n";
        aDevolver += "Ano Fabricacion: " + anoFabricacion + "\n";
        aDevolver += "Propietario: " + persona.toString() + "\n";
        return aDevolver;
    }
}