package PRACTICAS_ARRAYS;
// de forma descendete  imprime el contenido del array mediante un bucle for
public class Exe_2 {
    public static void main(String[] args) {
        int[] anArray;

        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        for (int i = anArray.length - 1;i >=0 ; i--) {

            System.out.println(anArray[i]);
        }

    }
}
