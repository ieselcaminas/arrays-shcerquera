package PRACTICAS_ARRAYS;
//Calcula la media de un array de 10 posiciones
public class Exe_4 {
    public static void main(String[] args) {

        int [] numeros = {3,6,5,7,9,10,8,2,1,8};
        int suma = 0;
        double media;
        for (int i = 0; i <numeros.length ; i++) {
            suma += numeros[i];
        }
        media= (suma / numeros.length);
        System.out.println(media);
    }
}
