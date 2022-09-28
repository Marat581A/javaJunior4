package lesson10.Fig;

public class Treug implements iObem,iPloshad{
    private int a,b,c;

    @Override
    public double obem() {
        return a*b*c;
    }

    @Override
    public double ploshad() {
        return a+b+c;
    }
}
