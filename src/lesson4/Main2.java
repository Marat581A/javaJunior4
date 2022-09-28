package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String s = "q.we.rty.ui,op";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                c++;

            }
            if (c == 0) {
                System.out.println("нет точек");
            }


        }
        System.out.println("точки в количестве " + c);
    }
}
