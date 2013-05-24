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
public class CalculateCharacters implements Observer{
    Observable observable;
    
    @Override
    public void update(Observable o, Object o1) {
        String cadena =(String)o1;                
        System.out.println("Caracteres = " + cadena.length());
    }
}
