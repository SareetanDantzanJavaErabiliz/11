/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package trywithresources2;

import java.util.Scanner;

public class TryWithResources2 {

    public static void main( String[ ] parametroak ) {
        
        // jarraian scanner baliabidea zabalduko dugu
        try( Scanner teklatua = new Scanner( System.in ) ) {
            System.out.println( "try baliabideekin aztertu" );
            String [ ] izenak = {"Arratiako Jota",
                                 "Mahaiganekoa",
                                 "Uztaritzeko Ihauteria",
                                 "Brokel dantza"}; 
            System.out.print( "Zein dantza? (1,2,3,4): " );
            String non = teklatua.next( );
            
            // Hurrengo lerroan aukera dago NumberFormatException salbuespena botatzeko
            int i = Integer.parseInt( non );
            
            // Hurrengo lerroan aukera dago ArrayIndexOutOfBoundsException salbuespena botatzeko
            System.out.println( izenak[ i-1 ] );
            System.out.println( "try blokearen azken sententzia egikaritu da" );
        }

        catch(ArrayIndexOutOfBoundsException s) {
            System.out.println("Salbuespena hartuta: arrayaren indize desegokia");
            System.out.println(s);
        }
        
        catch (NumberFormatException s) {
            System.out.println( "Salbuespena hartuta: zenbakirik ez " );
            System.out.println( s );
        }

        System.out.println( "Ondo izan" );
    }
}
