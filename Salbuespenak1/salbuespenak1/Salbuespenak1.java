/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salbuespeanak1;

/**
 *
 * @author ibp1718
 */
public class Salbuespeanak1 {

    public static void main( String[ ] parametroak ) {
        int emaitza;
        NireZatiketa zat = new NireZatiketa( 20, 0 );
        
        emaitza = zat.zatiketaBerezia( );
        System.out. println( "Zatiketa bereziaren emaitza: "+emaitza );
        
    }
    
}
