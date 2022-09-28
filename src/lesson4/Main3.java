package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String s = "fjsdnfjk.asnfna";

        for (int i = 0; i < s.length(); i = i + 3) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) == '.') {
                break;
            }else {
                System.out.println(s.charAt(i));
            }

        }




    }
}
