package Lesson9;

public class Main2 {
    public static void main(String[] args) {


        Figura f = new Figura();
        Treugolnik tr = new Treugolnik();

        Figura[] arr = new Figura[]{f, tr};
        for (int i = 0; i < arr.length; i++) {
            arr[i].printObem();
            arr[i].printPloshad();
            System.out.println();

        }
    }
}