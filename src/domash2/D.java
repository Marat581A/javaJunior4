package domash2;

public class D {
    public static void main(String[] args) {

        int [][] a = new int[3][3];
        int i = 0;


        while (i < a.length){
            int j = 0;
            while (j < a[i].length){
                System.out.print(a[i][j]);
                j++;


            }i++;
            System.out.println();

        }


    }
}
