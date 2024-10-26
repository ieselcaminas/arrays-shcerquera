package main.PRACTICAS_ARRAYS;
//Realiza un programa que lea un DNI sin letra y calcula la misma (usad un array para almacenar las letras)
//con metodo
import java.util.Scanner;

public class EXE_3_MET {
    public static char  letraDNI(int dni){
        char[] letrasDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        // calcualr resto
        int resto = dni % 23;

        //obtener letra DNI
        char letra = letrasDNI[resto];

        return letra;
    }
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
