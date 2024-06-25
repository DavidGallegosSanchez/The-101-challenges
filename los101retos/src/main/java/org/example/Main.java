package org.example;

import org.example.challenge01.FizzBuzz;
import org.example.challenge02.Anagrama;
import org.example.challenge03.Fibonacci;
import org.example.challenge04.Primo;
import org.example.challenge05.Area;
import org.example.challenge07.ReverseChains;
import org.example.challenge08.WordCount;
import org.example.challenge09.Conversion;
import org.example.challenge10.Morse;

public class Main {
    public static void main(String[] args) {
        // Challenge 01 - Fizz Buzz
        //FizzBuzz.fizzBuzz();

        // Challenge 02 - Anagrama
        // System.out.println("Es un anagrama? " + Anagrama.isAnagrama());

        // Challenge 03 - Fibonacci
        // Fibonacci.createFibonacciSequence();

        // Challenge 04 - Primo
        // Primo.generatePrimeNumbers();

        // Challenge 05 - Área de un Polígono
        // System.out.println("El area del triangulo es " + Area.calculateArea("Triangle", 10, 5));
        // System.out.println("El area del Rectangle es " + Area.calculateArea("Rectangle", 5, 7));
        // System.out.println("El area del Square es " + Area.calculateArea("Square", 4, 0));

        // Challenge 06 - Aspect ratio de una imagen

        // Challenge 07 - Invirtiendo cadenas
        // System.out.println("La cadena Hola mundo invertida es " + ReverseChains.reverseChain("Hola mundo"));

        // Challenge 08 - Contador palabras
        // WordCount.countWords("Hola, mi nombre es David. Mi nombre completo es David Gallegos.");

        // Challenge 09 - Decimal a Binario
        // Conversion.convertDecimalToBinary(17);

        // Challenge 10 - Codigo Morse
        Morse.toMorse("Hola mundo");
        Morse.toAlphabetic(".... ___ ._.. ._ __ .._ _. _.. ___");
    }
}