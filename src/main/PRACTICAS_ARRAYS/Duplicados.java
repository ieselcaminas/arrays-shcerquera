package PRACTICAS_ARRAYS;
//Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.

import java.util.ArrayList;

public class Duplicados {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,1,2,3,4,5,6,7};
        encontrarDuplicados(numeros);
    }
    public static void encontrarDuplicados(int[]arr){
        ArrayList<Integer> duplicados = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]== arr[j]&& !duplicados.contains(arr[i])){
                    duplicados.add(arr[i]);

                }
                System.out.println("vaslores duplicados encontrados " + arr[i]);

            }


        }
    }
}
