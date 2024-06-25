package org.example.challenge10;

import java.util.HashMap;
import java.util.Map;

public class Morse {

    /*
     * Crea un programa que sea capaz de transformar texto natural a código
     * morse y viceversa.
     * - Debe detectar automáticamente de qué tipo se trata y realizar
     *   la conversión.
     * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
     *   o símbolos y dos espacios entre palabras "  ".
     * - El alfabeto morse soportado será el mostrado en
     *   https://es.wikipedia.org/wiki/Código_morse.
     */

    public static void toMorse(String text){
        text = text.toUpperCase();
        Map<String, String> codeMorse = createCodeMorseMap();

        System.out.println(text + " en codigo morse:");
        for(int i = 0; i<= text.length()-1; i++){
            System.out.print(codeMorse.get(Character.toString(text.charAt(i)))+ " ");
        }
        System.out.println();
    }

    public static void toAlphabetic(String text){
        String[] testList = text.split(" ");
        Map<String, String> codeMorse = createCodeMorseMap();

        System.out.println(text + " en codigo alfabético:");
        for(String str : testList){
            System.out.print(getKeyByValue(codeMorse, str));
        }
    }

    public static String getKeyByValue(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null; // or throw an exception, or return an optional, as needed
    }

    private static Map<String, String> createCodeMorseMap() {
        Map<String, String> codeMorse = new HashMap<>();
        codeMorse.put("A", "._");
        codeMorse.put("B", "_...");
        codeMorse.put("C", "_._.");
        codeMorse.put("D", "_..");
        codeMorse.put("E", ".");
        codeMorse.put("F", ".._.");
        codeMorse.put("G", "__.");
        codeMorse.put("H", "....");
        codeMorse.put("I", "..");
        codeMorse.put("J", ".___");
        codeMorse.put("K", "_._");
        codeMorse.put("L", "._..");
        codeMorse.put("M", "__");
        codeMorse.put("N", "_.");
        codeMorse.put("O", "___");
        codeMorse.put("P", ".__.");
        codeMorse.put("Q", "__._");
        codeMorse.put("R", "._.");
        codeMorse.put("S", "...");
        codeMorse.put("T", "_");
        codeMorse.put("U", ".._");
        codeMorse.put("V", "..._");
        codeMorse.put("W", ".__");
        codeMorse.put("X", "_.._");
        codeMorse.put("Y", "_.__");
        codeMorse.put("Z", "__..");
        codeMorse.put("0", "_____");
        codeMorse.put("1", ".____");
        codeMorse.put("2", "..___");
        codeMorse.put("3", "...__");
        codeMorse.put("4", "...._");
        codeMorse.put("5", ".....");
        codeMorse.put("6", "_....");
        codeMorse.put("7", "__...");
        codeMorse.put("8", "___..");
        codeMorse.put("9", "____.");
        codeMorse.put(" ", " ");

        return codeMorse;
    }
}
