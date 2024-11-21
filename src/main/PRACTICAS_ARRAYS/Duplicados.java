package main.PRACTICAS_ARRAYS;
//Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.

import java.util.ArrayList;

public class Duplicados {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7};

        ArrayList<Integer> duplicados = encontrarDuplicados(numeros);

        System.out.print("vaslores duplicados encontrados: ");

        for (int duplicado : duplicados) {
            System.out.print(duplicado + ", ");
        }
    }

    public static ArrayList<Integer> encontrarDuplicados(int[] arr) {
        ArrayList<Integer> duplicados = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicados.contains(arr[i])) {
                    duplicados.add(arr[i]);
                }
            }
        }

        return duplicados;
    }
}
