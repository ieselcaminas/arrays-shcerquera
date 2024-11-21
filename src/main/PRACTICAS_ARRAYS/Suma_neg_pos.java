package main.PRACTICAS_ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;

//Crea un programa que pida 10 números enteros por teclado, los almacene en un array y
// luego muestre por separado la suma de todos los valores positivos y negativos.
public class Suma_neg_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.print("introduce los 10 números: ");

        //solicitar 10 numeros.
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        ArrayList<Integer> positivos = filtrarPositivos(numeros);
        ArrayList<Integer> negativos = filtrarNegativos(numeros);

        int sumaPositivos = sumarNumeros(positivos);
        int sumaNegativos = sumarNumeros(negativos);

        System.out.println("Números positivos: ");
        for (int num : positivos) {
            System.out.println(num + "");
        }

        System.out.println("Números negativos: ");
        for (int num : negativos) {
            System.out.println(num + "");
        }

        System.out.print("Suma de valores positivos: " + sumaPositivos);
        System.out.print("\nSuma de valores negativos: " + sumaNegativos);
    }

    public static ArrayList<Integer> filtrarPositivos(int[] numeros) {
        ArrayList<Integer> numPositivos = new ArrayList<>();

        for (int numero : numeros) {
            if (numero > 0) {
                numPositivos.add(numero);
            }
        }

        return numPositivos;
    }

    public static ArrayList<Integer> filtrarNegativos(int[] numeros) {
        ArrayList<java.lang.Integer> numNegativos = new ArrayList<>();

        int suma = 0;

        for (int numero : numeros) {

            if (numero < 0) {
                numNegativos.add(numero);
                suma = suma + numero;
            }
        }

        return numNegativos;
    }

    public static int sumarNumeros(ArrayList<Integer> listNums) {
        int suma = 0;

        for (int numero : listNums) {
            suma = suma + numero;
        }

        return suma;
    }
}

