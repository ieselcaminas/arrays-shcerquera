package main.PRACTICAS_ARRAYS;

import java.util.Scanner;

public class Exe_7 {
    public static int calcularMAximo(String[]cadenas) {
        int maxima = cadenas[0].length();
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > maxima) {
                maxima = cadenas[i].length();
    }
}
        return maxima;
    }
    public static void main(String[] args) {


        String[] cadenas = new String[5];
        System.out.println(" introduce 5 cadenas de texto. ");
        Scanner miScanner;
        int maxima;


        //leer las cadenas
        miScanner = new Scanner(System.in);

        for (int i = 0; i < cadenas.length ; i++) {
            cadenas[i] = miScanner.next();

        }
        //calcular la longitud
        maxima = calcularMAximo(cadenas);
        for (int i = 0; i <maxima + 4 ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // imprimir astriscos

}



