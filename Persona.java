/**
 * La clase Persona contiene los datos basicos de una persona.
 *
 * @author Adrian Bermejo Gonzalez, Javier de Cea Dominguez.
 * @version 09-05-2018.
 */
public class Persona 
{
    private String nombre;
    private String dni;

    /**
     * Constructor para objetos de la clase Persona.
     * 
     * @param nombre El nombre de la persona.
     * @param dni El DNI de la persona.
     */
    public Persona(String nombre, String dni)
    {    
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Devuelve la informacion de la persona.
     * @return Devuelve una cadena con toda la informacion de la persona.
     */
    @Override
    public String toString()
    {
        return "nombre - " + nombre + " - DNI - " + dni; 
    }
}