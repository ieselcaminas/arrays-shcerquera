package main.PRACTICAS_ARRAYS;

import java.util.Scanner;

//Crea un programa que pida 10 números enteros por teclado, los almacene en un array y
// luego muestre por separado la suma de todos los valores positivos y negativos.
public class Exe_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPositivos=0;
        int sumaNegativos=0;

        //solicitar 10 numeros.
        for (int i = 0; i <numeros.length ; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ":");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0){
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaPositivos += numeros[i];

            }

        }

    }
}
