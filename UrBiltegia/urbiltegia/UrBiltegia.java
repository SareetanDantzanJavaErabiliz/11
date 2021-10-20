
package urbiltegia;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class UrBiltegia {


    public static void main( String[ ] parametroak ) throws UrNahikorikEzSalbuespena {
        
        BiltegiaMartxan biltegia = new BiltegiaMartxan( 100 );
        System.out.println( "Biltegia sortu dugu eta "+biltegia.getZenbat( )+" litro ditu");
        System.out.println( "Biltegian 500 litro sartuko ditugu" );
        biltegia.bete( 500.00 );      
      
        System.out.println( biltegia.getZenbat()+" litro ditugu biltegian" );
        System.out.println( "200 litro atara mesedez" );
        System.out.println( "200 litro ateratzen..." );
        biltegia.hustu( 200 );
        if ( biltegia.getZenbat() < 0 ){              
            throw new UrNahikorikEzSalbuespena( biltegia.getZenbat( ) );                            
        }          
        
        System.out.println( "Orain "+biltegia.getZenbat( )+" litro ditugu" );
        System.out.println( "700 litro ateratzen...." );
        biltegia.hustu( 700 );
        if ( biltegia.getZenbat() < 0 ) {              
            throw new UrNahikorikEzSalbuespena( biltegia.getZenbat( ) );                            
        }
                    
        System.out.println( "Orain "+biltegia.getZenbat( )+" litro ditugu" );         
    } 

}
    
