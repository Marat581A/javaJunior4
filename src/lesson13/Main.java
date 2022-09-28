package lesson13;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setName(" ");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("sfs");
        p.setAge(1234);









    }
}
// chekit сразу анчекит после запуска