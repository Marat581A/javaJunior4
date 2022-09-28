package lesson5;

public class Main {
    public static void main(String[] args) {
        String [][]strings = new String[3][3];


        String text = "klsdjlfjlsfskfl kfsdfljslfjs,sdlfkvkjvkf.";
        char [] simvol = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            simvol[i] = text.charAt(i);
            System.out.print(simvol[i] + " ");


        }


    }
}
