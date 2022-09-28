package domash2;

public class A {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int a = arr.length / 2;
        int b = a;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == (arr.length - 1) - i)
                    System.out.print("* ");
                else
                    System.out.print(arr[i][j] + " ");


            }
            System.out.println();
        }
    }
}
