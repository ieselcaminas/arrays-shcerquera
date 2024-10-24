package PRACTICAS_ARRAYS;

import java.util.Scanner;
//Realiza un programa que lea un DNI sin letra y calcula la misma (usad un array para almacenar las letras)
public class Exe_3 {
    public static void main(String[] args) {
        char[] letrasDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner sc= new Scanner(System.in);  // crear un objeto.
        System.out.println("Introduce un numero DNI: "); // pedir el numero DNI
        int dni = sc.nextInt();

        // calcualr resto
        int resto = dni % 23;

        //obtener letra DNI
        char letra = letrasDNI[resto];

        System.out.println("El DNI completo es: " + dni + letra);
    }
}
