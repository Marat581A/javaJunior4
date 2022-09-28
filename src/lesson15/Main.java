package lesson15;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Tovar tovar = new Tovar("Tele",10000);
        Tovar tovar1 = new Tovar("Bolt",50);
        Tovar tovar2 = new Tovar("Samokat",15000);
        Tovar tovar3 = new Tovar("Tv",20000);
        Tovar tovar4 = new Tovar("xbox",35000);

        Otzivi otzivi = new Otzivi(1,"Super");
        Otzivi otzivi1 = new Otzivi(3,"Cool");
        Otzivi otzivi2 = new Otzivi(2,"Normal");
        Otzivi otzivi3 = new Otzivi(4,"Fuuuu");
        Otzivi otzivi4 = new Otzivi(5,"Good");

        Obzor obzor = new Obzor("Crashtest telephone","www.kloplon.ru");
        Obzor obzor1 = new Obzor("info tele","www.shipn.ru");
        Obzor obzor2 = new Obzor("laserphone","www.klmo.ru");

        tovar.addOtziv(otzivi);
        tovar1.addOtziv(otzivi1);
        tovar2.addOtziv(otzivi2);
        tovar3.addOtziv(otzivi3);
        tovar4.addOtziv(otzivi4);

        tovar.addObzor(obzor);
        tovar1.addObzor(obzor1);
        tovar2.addObzor(obzor2);

        TreeSet<Tovar> t = new TreeSet<>();
        t.add(tovar);
        t.add(tovar1);
        t.add(tovar2);
        t.add(tovar3);
        t.add(tovar4);
        System.out.println(t);
        System.out.println("_____");

        TreeSet<Tovar> tovars = Tovar.setTo(t);
        System.out.println(tovars);
        System.out.println("_______");

        TreeSet<Tovar> dssds = Tovar.dssds(t);
        System.out.println(dssds);


    }
}
