package lesson4;

public class Soed {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int a = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i + j == arr[i].length - 1 )) {
                    System.out.print("* ");


                }

                else {
                    System.out.print(arr[i][j] + " ");

                }


            }
            System.out.println();

        }

    }
}
