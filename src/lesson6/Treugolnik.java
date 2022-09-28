package lesson6;

public class Treugolnik {

    private int a;
    private int b;
    private int c;

    public void setA(int item){
        this.a = item;

    } public void setB(int b){
        this.b = b;
    }
    public void setC (int c){
        this.c = c;
    }

    public int getA(){
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public int perimetr(){
        return a+b+c;
    }
    public double ploshad(){
        double pr = perimetr() / 2;

        double pp = Math.sqrt(pr * (pr -a ) * (pr - b) * (pr - c));


        return pp;


    }
}
