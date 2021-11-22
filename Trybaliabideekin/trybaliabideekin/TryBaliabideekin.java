/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package trybaliabideekin;

public class TryBaliabideekin implements AutoCloseable {
    
    private int id = 0;
    
    public TryBaliabideekin( int id ) {    
        this.id = id;
    }
    
    public void zabaldu( ) {
        System.out.println( "Zabalik= " + id );
    }
    
    public void lanEgin( ) {
        System.out.println( "Lanean= " + id );
    }

    @Override
    public void close( ) {
        System.out.println( "Itxita= " + id );
    }

    public static void main( String[ ] parametroak ) {
        
        try ( TryBaliabideekin baliabide1 = new TryBaliabideekin (1);
              TryBaliabideekin baliabide2 = new TryBaliabideekin (2) ) {
            baliabide1.zabaldu();
            baliabide1.lanEgin();
            baliabide2.zabaldu();
            baliabide2.lanEgin();
        }
        catch( Exception s ) {
            System.out.println( s.getClass( ).getName( )+": "+s.getMessage( ) );
        }
    
    }
    
}
