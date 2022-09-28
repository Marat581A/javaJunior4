package dom3;

public class M14 {
    public static void main(String[] args) {
        int[][] o = new int[10][10];
        int d = 0;

        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o[i].length; j++) {
                d++;
                if (j == (o.length -1) - i)
                System.out.print(d + "  ");

                else System.out.print(d + " ");
            }
            System.out.println();
        }

    }
}
