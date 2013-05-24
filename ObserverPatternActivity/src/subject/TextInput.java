/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;
import observers.*;

/**
 *
 * @author sneiderhc
 */
public class TextInput extends Observable {
    String text;

    public TextInput() { }

    public void setText(String text) {
        this.text = text;
        textChanged();
    }

    public void textChanged() {
        setChanged();
        notifyObservers(text);
    }
    
    public static void main(String[] args) throws IOException {
        Observable textInput = new TextInput();
        textInput.addObserver(new CalculateCharacters());
        textInput.addObserver(new CalculateKeywords());
        textInput.addObserver(new CalculateWords());
        textInput.addObserver(new StopwordsDisplay());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sTexto;
        while(!(sTexto = br.readLine()).equals("**")) {
            ((TextInput)textInput).setText(sTexto);
        }
    }
}