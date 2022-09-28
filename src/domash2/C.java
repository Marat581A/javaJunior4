package domash2;

public class C {
    public static void main(String[] args) {
        int [][] arr = new int [5][5];
        int a = arr.length / 2;
        int b = a;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i+j)%2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(arr[i][j] + " ");


            }System.out.println();
            }

    }
}
