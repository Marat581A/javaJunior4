package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int [] arr = {0,2,4,6,8,10,12,14,16,18};
         for (int i = 0; i< arr.length; i=i+2){


             if (arr [i] % 2 == 0) {
                 System.out.println(arr[i]);
             }

         }

    }
}
