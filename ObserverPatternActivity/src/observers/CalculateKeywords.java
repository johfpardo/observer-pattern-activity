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
public class CalculateKeywords implements Observer{
    
    Observable observable;

    @Override
    public void update(Observable o, Object o1) {
        String[] s = ((String) o1).split("[\\s\\p{Punct}]");
        int temp=0;
        String[] keywords = {"Abstract","assert", "Boolean", "break",
        "byte", "case", "catch", "char", "class", "const", "continue", 
        "default", "do", "double", "else", "enum", "extends", "final", 
        "finally", "float", "for", "goto", "if", "implements", "import",
        "instanceof", "int", "interface", "long", "native","new", "package","private", "protected", "public", 
        "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
        "transient", "try","void", "volatile", "while"};
        
        for(int i=0; i<s.length; i++) {
            for(int j=0; j<keywords.length; j++)
            if(s[i].equals(keywords[j])) {
                temp++;
                break;
            }
        }
        System.out.println("keywords = "+temp);
    }
}