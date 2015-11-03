/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_bl;

/**
 *
 * @author sara
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Punto2 punto1 = new Punto2(2,3);
     Punto2 punto2 = new Punto2(4,5);
     
     Segmento seg1 = new Segmento(punto1, punto2, 3, 6);
     Segmento seg2 = new Segmento(punto1, punto2, 8, 9 );
     
     Rectangulo22 rect = new Rectangulo22(seg1, seg2, punto1, punto2, 7, 9);
     
     
        
     System.out.println(rect.toString());   
        
        
        
    }
    
}
