package domash;

public class M4 {
    public static void main(String[] args) {
        String s = "mfldsmfkvsldfl.sf";

        for (int i = 0; i < s.length(); i = i + 3) {
            if (s.charAt(i) == '.'){
                break;
            }else {
                System.out.println(s.charAt(i));
            }


        }
    }
}
