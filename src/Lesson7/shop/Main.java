package Lesson7.shop;

public class Main {
    public static void main(String[] args) {
        Tovar vedro = new Tovar("Ведро черное",100);
        Tovar kastr = new Tovar("Кастрюля золотая",2000);
        Tovar plazma = new Tovar("ТЕлик тонкий",10000);
        Tovar stiralka = new Tovar("Стиралка для холостяка",5000);

        Otziv otziv = new Otziv(5,"Супер");
        Otziv otziv1 = new Otziv(2,"ПЛохо");
        Otziv otziv2 = new Otziv(3,"Норм");
        Otziv otziv3 = new Otziv(5,"Хороший");
        Otziv otziv4 = new Otziv(5,"Супер");

        vedro.setOtziv(otziv);
        kastr.setOtziv(otziv1);
        plazma.setOtziv(otziv2);
        stiralka.setOtziv(otziv3);
        stiralka.setOtziv(otziv4);



        System.out.println(vedro.srednii());

    }
}
