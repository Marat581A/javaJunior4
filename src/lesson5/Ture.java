package lesson5;

public class Ture {
    public static void getCountry(String[][] mass, String name) {

        for (int i = 0; i < mass.length; i++) {
            if (mass[i][0].equals(name)) {
                System.out.println("Направление: " + mass[i][0] + " Отель: " + mass[i][1] +
                        " Транспорт: " + mass[i][2] + " Цена: " + mass[i][3]);
            }

        }

    }

    public static void getCountry(String[][] mass, String name, int summa) {

        for (int i = 0; i < mass.length; i++) {
            if (mass[i][0].equals(name) && Integer.parseInt(mass[i][3]) < summa) {
                System.out.println("Направление: " + mass[i][0] + " Отель: " + mass[i][1] +
                        " Транспорт: " + mass[i][2] + " Цена: " + mass[i][3]);
            }

        }

    }

    public static int getTureStars(String[][] mass, int s) {
        int b = 0;
        for (int i = 0; i < mass.length; i++) {


            if (Integer.parseInt(mass[i][1]) == s) {
                b++;

            }

        }
        return b;
    }

    public static void getCumma(String[][] mass, int b, int g) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][3]) >= b && Integer.parseInt(mass[i][3]) <= g) {
                System.out.println("Направление: " + mass[i][0] + " Отель: " + mass[i][1] +
                        " Транспорт: " + mass[i][2] + " Цена: " + mass[i][3]);


            }


        }


    }

    public static void getStars2(String[][] mass, int a, int b) {

        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][1]) >= a && Integer.parseInt(mass[i][1]) <= b) {
                System.out.println("Направление: " + mass[i][0] + " Отель: " + mass[i][1] +
                        " Транспорт: " + mass[i][2] + " Цена: " + mass[i][3]);


            }


        }
    }
    public static void getTransport(String[][] mass, String trans){

        for (int i = 0; i < mass.length; i++) {
            if(!mass[i][2].equals(trans)){
                System.out.println("Направление: " + mass[i][0] + " Отель: " + mass[i][1] +
                        " Транспорт: " + mass[i][2] + " Цена: " + mass[i][3]);

            }

        }
    }
}
