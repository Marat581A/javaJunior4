package Dom;

public class Treugolnik {

    private int a;
    private int b;
    private int c;

    public void setA(int qwe){
        this.a = qwe;
    }
    public void setB(int asd){
        this.b = asd;
    }
    public void setC(int zxc){
        this.c = zxc;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public int  perimetr(){
        int p = a + b + c;
        return p;

    }
    public double ploshad(){
        double pp = (a+b+c)/2;
        double g = Math.sqrt (pp*(pp-a)*(pp - b) * (pp - c));
        return g;
    }

}

