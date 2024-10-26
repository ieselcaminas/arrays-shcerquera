package main.PRACTICAS_ARRAYS;
//Calcula la media de un array de 10 posiciones.METODO

public class EXE_4_MET {
    public static double media(int[] numeros){
        int suma = 0;
        double media;
        for (int i = 0; i <numeros.length ; i++) {
            suma += numeros[i];
        }
        media= ( suma / numeros.length);
        return media;

    }

    public static void main(String[] args) {
        int [] numeros = {3,6,5,7,9,10,8,2,1,8};

        double media= media(numeros);
        System.out.println(media);

}
}
