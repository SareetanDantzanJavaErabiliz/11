/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package salbuespenak1;

public class Salbuespenak1 {

    public static void main( String[ ] parametroak ) {
        int emaitza;
        NireZatiketa zat = new NireZatiketa( 20, 0 );
        
        emaitza = zat.zatiketaBerezia( );
        System.out. println( "Zatiketa bereziaren emaitza: "+emaitza );
        
    }
    
}
