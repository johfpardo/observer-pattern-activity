/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author John Fredy
 */
public class CalculateWords implements Observer{
    
    Observable observable;

    @Override
    public void update(Observable o, Object o1) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String cadena =(String)o1;                
        String[] splits = cadena.split(" ");
        System.out.println("Palabras = " + splits.length);
    }
    
}
