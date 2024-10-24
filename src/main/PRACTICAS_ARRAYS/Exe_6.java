package PRACTICAS_ARRAYS;

public class Exe_6 {
    public static void main(String[] args) {
        int[] numeros = {5,8,7,4,6,92,203,17,12};

        int menor = numeros[0];

        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] < menor){
                menor = numeros[i];
            }

        }
        System.out.println("El núimero menor es: " + menor);
    }
}
