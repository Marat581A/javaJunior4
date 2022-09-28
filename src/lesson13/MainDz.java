package lesson13;

public class MainDz {
    public static void main(String[] args) {
        Stringut b = new Stringut();
        String  o = "Привет пока в здравствуйте в пока досвидания пока";
        String p = "пока";

        try {
            int[] word = b.findWord(o,p);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("ss");


    }
}

