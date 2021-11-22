/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package urbiltegia;

public class BiltegiaMartxan {
    private double zenbat;
    
    public BiltegiaMartxan( double zenbat ) {
        this.zenbat = zenbat;
    }
    
    public void bete( double kantitatea ) {
        zenbat += kantitatea;
    }
    
    public void hustu( double kantitatea ) throws UrNahikorikEzSalbuespena {
        if ( kantitatea <= zenbat ){
            zenbat -= kantitatea;
        }
        else {
            double beharDena = kantitatea - zenbat;
            throw new UrNahikorikEzSalbuespena( beharDena );
        }
    }
    
    public double getZenbat( ){
        return zenbat;
    }
    
}
