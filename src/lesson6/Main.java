package lesson6;

public class Main {
    public static void main(String[] args) {

        Treugolnik tr1 = new Treugolnik();
        tr1.setA(3);
        tr1.setB(4);
        tr1.setC(5);


        System.out.println("Треуголтник со сторонами: а = " + tr1.getA() + " б = "
        + tr1.getB() + " c = " + tr1.getC());

        System.out.println("периметр треуголника = " + tr1.perimetr());
        System.out.println();
        System.out.println("площадб " + tr1.ploshad());



    }
}
