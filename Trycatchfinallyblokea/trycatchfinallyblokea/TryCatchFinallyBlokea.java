
package trycatchfinallyblokea;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class TryCatchFinallyBlokea {

    public static void main( String[ ] parametroak ) {
    
        int i = 777;
        int j = 0;
        
        try {            
            int emaitza = i / j;        
            System.out.println( "i / j = " + emaitza );
        } 
        catch( Exception s ) {
            int emaitza = i + j;
            System.out.println( "i + j = " + " " + emaitza );
        } 
        finally {
            System.out.println( "finally blokean dauden sententziak beti egikarituko dira." );
        }
        System.out.println( "Programaren exekuzioa ondo amaitu da" );
    }
}

