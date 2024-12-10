package PRACTICAS_ARRAYS;

public class Minimo {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 7, 4, 6, 92, 203, 17, 12};

        int menor = valorMinimo(numeros);

        System.out.print("El núimero menor es: " + menor);
    }

    public static int valorMinimo(int[] numeros) {
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }
}
