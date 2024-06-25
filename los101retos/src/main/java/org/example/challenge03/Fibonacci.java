package org.example.challenge03;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Fibonacci {

    public static void createFibonacciSequence(){
        int p0 = 0;
        int p1 = 1;
        int cont = 0;

        for(int i=0; cont<=50; i++){
            System.out.println(p0);
            cont++;

            int fib = p0 + p1;
            p0 = p1;
            p1 = fib;
        }
    }
}
