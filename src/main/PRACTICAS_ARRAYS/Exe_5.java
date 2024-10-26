package main.PRACTICAS_ARRAYS;

//Realiza un programa que pida diez números e imprima el mayor
public class Exe_5 {
    public static void main(String[] args) {
        //almacenar 10 numeros
        int[] numeros = {5, 10, 12, 24, 35, 13, 78, 100, 9, 7};

        int mayor = 0;

        //recorrer el array para encontrar el mayor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("EL número mayor es: " + mayor);

    }
}
