package org.example.challenge08;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

    /*
     * Crea un programa que cuente cuantas veces se repite cada palabra
     * y que muestre el recuento final de todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que
     *   lo resuelvan automáticamente.
     */
    public static void countWords(String text){
        Map<String, Integer> counts = new HashMap<>();
        List<String> words = List.of(text.replaceAll("[(-+.^:,)]","").toLowerCase().split(" "));

        words.stream()
                .forEach( word ->
                    counts.put(word, Collections.frequency(words, word))
                );
        System.out.println("Analizando el texto: " + text);
        for (String key : counts.keySet()) {
            System.out.println("La palabra " + key + " se repite " + counts.get(key) + " veces.");
        }

    }
}
