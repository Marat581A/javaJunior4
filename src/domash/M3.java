package domash;

public class M3 {
    public static void main(String[] args) {
        String s = "Marat.Bce.Cmozhet";
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                c++;
            }



        }
        System.out.println("Точек " + c);

    }
}
