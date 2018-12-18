package cifradorino;

/**
 *
 * @author Neo
 */
import java.util.StringTokenizer;

public class Crypto {
    public String create(String word) {
        
        char[] arrayWord = word.toCharArray();
        char auxWord;
        int total = 0;
        String index = "", result = "";
        
        for(int i = 0; i < arrayWord.length; i++) {
            
            auxWord = arrayWord[i];
            System.out.println(auxWord);
            
            if(auxWord != '1') {
                for(int j = 0; j < arrayWord.length; j++) {
                    
                    if(auxWord == arrayWord[j]) 
                    {
                        if(j == (arrayWord.length - 1)) {
                            arrayWord[j] = '1';
                            index += j; total++;
                        } else {
                            arrayWord[j] = '1';
                            index += j + "$"; total++;
                        }
                    }
                }
            } else continue;
            
            
            result += auxWord + "%" + total + "╚" + index + "^";
            index = ""; total = 0;
            
            
        }
        
        return word.length() + "(/>♂<)/" + result;
    }
    
    public String killRino(String word) {
        StringTokenizer tokenSize = new StringTokenizer(word,"(/>♂<)/");
        int size = Integer.parseInt(tokenSize.nextToken());
        char[] arrayWord = new char[size];
        
        String result = "";
        char wordC;
        int index, rep;
        
        StringTokenizer tokenWord = new StringTokenizer(tokenSize.nextToken(), "^");
        
        while(tokenWord.hasMoreElements()) {
            StringTokenizer tokenChar = new StringTokenizer(tokenWord.nextToken(), "%╚$");
            
            while(tokenChar.hasMoreElements()) {
                wordC = tokenChar.nextToken().charAt(0);
                rep = Integer.parseInt(tokenChar.nextToken());
                for(int i = 0; i < rep; i++) {
                    index = Integer.parseInt(tokenChar.nextToken());
                    arrayWord[index] = wordC;
                }
            }
        }
        
        for(int i =0; i < arrayWord.length; i++) {
            result += arrayWord[i];
        }
        
        return result;
    }
}
