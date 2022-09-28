package lesson4;

public class Main {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        int[][] arr = new int[3][3];
         int i = 0;

         while (i < arr.length){
             int j = 0;
             while (j < arr[i].length){
                 System.out.print(arr[i][j]);
                 j++;

             }
             System.out.println();
             i++;
         }


    }
}
