package org.example.challenge09;

public class Conversion {

    /*
     * Crea un programa se encargue de transformar un número
     * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
     */
    public static void convertDecimalToBinary(int number){
        System.out.print("Decimal number " + number + " in binary is: ");
        int[] binary = new int[1000];

        int i = 0;
        while(number > 0){
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }

        for(int j = i-1; j >= 0; j--){
            System.out.print(binary[j]);
        }
    }
}
