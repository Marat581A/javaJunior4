package lesson2;

public class Chasi {
    public static void main(String[] args) throws InterruptedException {
        for (int god = 0; god < 1; god++) {
            for (int mes9c = 0; mes9c < 12; mes9c++) {
                for (int nedel9 = 0; nedel9 < 52; nedel9++) {
                    for (int dnei = 0; dnei < 31; dnei++) {
                        for (int chas = 0; chas < 24; chas++) {
                            for (int min = 0; min < 60; min++) {
                                for (int sec = 0; sec < 60; sec++) {
                                    System.out.println("Прошло " + god + " лет " + mes9c + " месяцев " + nedel9 +
                                            " недели " + dnei + " дней " + min + " минут " + chas + " часов " + sec + " секунд");
                                    Thread.sleep(1000);

                                }

                            }


                        }
                    }

                }
            }
        }
    }
}