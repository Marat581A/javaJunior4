package Dom4;

public class Nm {
    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        int l = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                l++;
                arr[i][j] = l;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();
int m = 1;
        for (int i = 0; i < arr.length; i++) {
            m++;
            if(m%2==0){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] +" ");


                }
            }else {
                for (int j = arr[i].length - 1; j >= 0 ; j--) {
                    System.out.print(arr[i][j] + " ");

                }
            }
            System.out.println();

        }



    }
}
