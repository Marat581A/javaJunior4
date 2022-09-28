package Dom;

import java.util.Scanner;

public class Ml {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру");
        System.out.println("1 треугольник");
        System.out.println("2 круг");
        System.out.println("3 квадрат");
        System.out.println("4 цилиндр");
        System.out.println("5 конус");

        Scanner ss = new Scanner(System.in);
        int figura = ss.nextInt();

        switch (figura){
            case 1:
                Treugolnik tr2 = new Treugolnik();
                System.out.println("введите а");
                tr2.setA(ss.nextInt());

                System.out.println("введите b");
                tr2.setB(ss.nextInt());

                System.out.println("введите c");
                tr2.setC(ss.nextInt());

                System.out.println("Периметр " + tr2.perimetr());
                System.out.println("Ploshad " + tr2.ploshad());


                break;
            case 2:
                Krug kr = new Krug();
                System.out.println("vvedite diametr");
                kr.setDiametr(ss.nextInt());
                System.out.println("radius " + kr.radius());
                System.out.println("perim " + kr.perimetr());
                System.out.println("plosh " + kr.ploshad());

                break;
            case 3:
                Kvadrat kv = new Kvadrat();
                System.out.println("vvedite dlinu storoni ");
                kv.setA(ss.nextInt());
                System.out.println("ploshad " + kv.ploshad());
                System.out.println("perimetr " + kv.perimetr());
                System.out.println("diaganal " + kv.diaganal());

                break;
            case 4:
                Cilindr cr = new Cilindr();
                System.out.println("введите высоту");
                cr.setVisota(ss.nextInt());
                System.out.println("введите радиус");
                cr.setRadius(ss.nextInt());
                System.out.println("Площадь одного основания " + cr.ploshad1());
                System.out.println("Площадь боковой поверхности цилиндра " + cr.ploshad2BokPoverx());
                System.out.println("Общая площадь " + cr.obshayaPloshad());
                break;
            case 5:
                Konus kon = new Konus();
                System.out.println("Введите радиус");
                kon.setRadius(ss.nextInt());
                System.out.println("Введите высоту");
                kon.setVisota(ss.nextInt());
                System.out.println("Объем конуса:  " + kon.obem());
                System.out.println("Длина образующей L: " + kon.l());
                System.out.println("Площадь боковой поверхности: " + kon.ploshadBok() );
                System.out.println("Общая площадь: " + kon.obshayaPloshad() );


                break;
            default:
                System.out.println("Нет такой фигуры");
        }
    }
}
