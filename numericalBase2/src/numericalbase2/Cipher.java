/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalbase2;

/**
 *
 * @author AR
 */
public class Cipher {
    public String init(String text) {
        String result = "";
        char[] letter = text.toCharArray();
        int numericalBase = 2;
        
        for(int i = 0; i < letter.length; i++) {
            if(numericalBase == 37) numericalBase = 2;
            
            char ascii = (char) letter[i];
            result += Integer.toString(ascii, numericalBase) + " ";
            numericalBase++;
        }
        
        return result;
    }
    
    public String decipher(String text) {
        String result = "";
        String[] letter = text.split(" ");
        int numericalBase = 2;
        
        for(int i = 0; i < letter.length; i++) {
            if(numericalBase == 37) numericalBase = 2;
            int n = (Integer.parseInt(letter[i], numericalBase));
            result += (char)n;
            numericalBase++;
        }
        
        return result;
    }
}
