package dom3;

public class M13 {
    public static void main(String[] args) {
        int[][] g = new int[10][10];
        int l = 0;
        int z = 0;
        int x = 0;



        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                l++;
                z++;
                x++;

                if ((l%7 == 0 )){
                    int t = 0;
                    t = l * 3;
                    System.out.print(t + " " );}
                else  System.out.print(l + " ");





            }
            System.out.println();

        }


    }
}



