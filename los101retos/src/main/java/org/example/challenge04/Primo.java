package org.example.challenge04;

public class Primo {

    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */
    public static void generatePrimeNumbers (){
        System.out.println("1");

        for(int i=2; i<=100; i++){
            boolean isPrimo = true;
            for(int j=2; j*j<=i && isPrimo; j++){
                if(i%j == 0){
                    isPrimo = false;
                }
            }

            if(isPrimo){
                System.out.println(i);
            }
        }
    }
}
