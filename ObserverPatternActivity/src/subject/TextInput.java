/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

import java.util.Observable;

/**
 *
 * @author sneiderhc
 */
public class TextInput extends Observable {
    String text;

    public void setText(String text) {
        this.text = text;
        textChanged();
    }
    
    public void textChanged() {
        setChanged();
        notifyObservers(text);
    }
}
