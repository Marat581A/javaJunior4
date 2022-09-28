package domash2;

public class B {
    public static void main(String[] args) {
        int [][] arr = new int [5][5];
        int a = arr.length / 2;
        int b = a;
        boolean g = true;
        boolean z = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j == a )|| (j == b))
                System.out.print("* ");
                else
                    System.out.print(arr[i][j] + " ");


            }if(i> arr.length / 2 - 1){
                a++;
                b--;
            }else {
                a--;
                b++;
            }
            System.out.println();

            }

        }

        }









