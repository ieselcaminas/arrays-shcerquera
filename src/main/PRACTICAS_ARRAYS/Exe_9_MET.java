package main.PRACTICAS_ARRAYS;
//Realiza un programa que calcule cuántos números pares e impares tiene un array.

public class Exe_9_MET {
    public static int pares(int... args) {
        int resultado = 0;

        for (int numero : args) {
            if (numero % 2 == 0) {
                resultado++;
            }
        }

        return resultado;
    }

    public static int impares(int... args) {
        int resultado = 0;

        for (int numero : args) {
            if (numero % 2 != 0) {
                resultado++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int pares = pares(numeros);
        int impares = impares(numeros);

        System.out.println("los numeros pares son: " + pares);
        System.out.println("los números impares son: " + impares);


//        for (int numero : numeros) {
//            if (numero % 2 == 0){
//                pares++;
//                System.out.println("los numeros pares son: " + pares);
//        }else {
//                impares++;
//                System.out.println("los números impares son: " + impares);
//            }
//
//        }
        // corregir esta dando un error


    }
}
