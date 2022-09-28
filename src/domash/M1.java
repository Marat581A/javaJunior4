package domash;

public class M1 {
    public static void main(String[] args) {

      int [] [] arr = new int[3][3];
      int i = 0;

      while (i < arr.length){
          System.out.print(i + " ");
          int j = 0;
          while (j < arr[i].length){
          System.out.print(j + " ");
          j ++;
          }
          i++;
          System.out.println();
        }



    }
}
