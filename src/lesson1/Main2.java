package lesson1;

public class Main2 {
    public static void main(String[] args) {

        int a = 50;
        int b = 4;
        int c = 7;

        // равносторонний
        // равнобедренный
        // правельный  или нет

        if (a == b && b == c && c == a) {
            System.out.println("равносторонний" );
        } else if (a == b && c != a ||
                a != b && c == a ||
                a != c && b == a) {
            System.out.println("равнобедренный");
        } else if (a + b >= c && a + c >= b && c + b >= a) {
            System.out.println("Правильный");
        }
        else {
            System.out.println(" Не правильный");
        }
    }
}
