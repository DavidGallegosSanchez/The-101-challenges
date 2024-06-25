package org.example.challenge07;

public class ReverseChains {

    /*
     * Crea un programa que invierta el orden de una cadena de texto
     * sin usar funciones propias del lenguaje que lo hagan de forma automática.
     * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
     */
    public static String reverseChain(String chain){
        StringBuilder reverseChain = new StringBuilder();
        for(int i = chain.length()-1; i >= 0; i--) {
            reverseChain.append(chain.charAt(i));
        }
        return reverseChain.toString();
    }
}
