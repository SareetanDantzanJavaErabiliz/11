/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package salbuespenak1;

public class NireZatiketa {
    int x,y;
    
    public NireZatiketa( int x, int y ) {
        this.x = x;
        this.y = y;
    }
    
    public  int zatiketaBerezia( ) {
        try {
            return x / y;
        }
        catch( ArithmeticException salbuespena ) {
            System.out.println( "pila inprimitzera noa" );
            salbuespena.printStackTrace( );
            System.out.println( "Errorea :" +salbuespena.getMessage( )+" "+salbuespena.toString( ) );
            return 77777777;
        }
    }
}
