package lesson5;

public class Main2 {
    public static void main(String[] args) {

        String [][] turs = {
                {"Египет","5","Самолет","30000"},
                {"Сочи","4","Самолет","40000"},
                {"Стамбул","2","Поезд","25000"},
                {"Сочи","3","Автобус","10000"},
                {"Крым","4","Поезд","60000"},
                {"Америка","5","Самолет","90000"}};

        //Ture.getCountry(turs,"Сочи");
        System.out.println();
        //int t = Ture.getTureStars(turs,5);
        //System.out.println(t);
        System.out.println();
        //Ture.getCumma(turs,30000,50000);
        System.out.println();
        //Ture.getStars2(turs,3,4);
        //System.out.println();
        Ture.getTransport(turs,"Автобус");
    }

}
