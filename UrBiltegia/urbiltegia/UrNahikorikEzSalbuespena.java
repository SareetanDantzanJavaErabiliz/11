
package urbiltegia;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class UrNahikorikEzSalbuespena extends Exception {
    private double beharDena;
    
    public UrNahikorikEzSalbuespena( double beharDena ) {
        this.beharDena = beharDena;
        System.out.println( "Salbuespena. Behar dena: "+beharDena+" litro" );
    }
    
    public double getBeharDena( ) {
        return beharDena;
    }
    
}
