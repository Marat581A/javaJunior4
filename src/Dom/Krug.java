package Dom;

public class Krug {

    private int diametr;

    public void setDiametr(int p){
        this.diametr = p;
    }
    public int getDiametr(){
        return this.diametr;
    }
    public double radius(){
        return diametr/2;
    }

    public double perimetr(){
        return Math.PI * diametr;
    }
    public double ploshad(){
        return Math.PI * Math.pow(radius(),2);

    }


    }

