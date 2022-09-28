package lesson6;

public class Krug {

    private int diametr;

    public void setDiametr(int diametr){
        this.diametr = diametr;
    }
    public int getDiametr (){
        return this.diametr;
    }
    public double perimetr(){

        return Math.PI * diametr ;
    }
    public double ploshad(){
        return Math.PI * diametr / 2 * diametr /2;

    }
}
