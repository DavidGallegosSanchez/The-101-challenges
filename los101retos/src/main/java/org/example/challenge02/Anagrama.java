package org.example.challenge02;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */
    public static Boolean isAnagrama(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su primera palabra: ");
        String textOne = teclado.nextLine();
        System.out.print("Introduzca su segunda palabra: ");
        String textTwo = teclado.nextLine();

        String textOneSorted = sortText(textOne);
        String textTwoSorted = sortText(textTwo);

        return textOneSorted.equals(textTwoSorted);
    }

    private static String sortText(String text) {
        char[] chars = text.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
