package Dom;

public class Kvadrat {
    private int a;

    public void setA(int a) {
        this.a = a;
    }
    public int getA(){
        return a;
    }



    public int perimetr(){
        return 4*a;

    }
    public int ploshad(){

        return (int) Math.pow(a,2);

    } public double diaganal(){
        return a * Math.sqrt(2);
    }


}
