package cifradoderivada;

import java.util.StringTokenizer;

/**
 *
 * @author Wasp
 */
public class cifrarTexto {
    
    public String cifrar(String texto) {
        char[] cadenaTexto = texto.toCharArray();
        int asciiValue;
        String resultado = "";
        
        for(int i = 0; i < cadenaTexto.length; i ++) {
            asciiValue = (int)cadenaTexto[i];
            resultado += asciiValue + "X^" + (asciiValue - 1) + " ";
        }
        
        return resultado;
    }
    
    public String descifrar(String texto) {
        StringTokenizer tokens = new StringTokenizer(texto," ");
        StringTokenizer letra;
        String resultado = "";
        int n;
        
        while(tokens.hasMoreTokens()) {
            letra = new StringTokenizer(tokens.nextToken(),"X^");
            n = Integer.parseInt(letra.nextToken());
            resultado += (char)n;
        }
        
        return resultado;
    }
}
