package domash2;

public class Main {
    public static void main(String[] args) {
        String text  = "asmkdlamsafsvcvxcvx";
        char [] b = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            b[i] = text.charAt(i);
            System.out.print(b[i] + " ");

        }

    }
}
