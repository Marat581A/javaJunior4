package Dom;

public class Konus {

    private double radius;
    private double visota;

    public void setRadius(double a){
        this.radius = a;
    }
    public void setVisota(double b){
        this.visota = b;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getVisota(){
        return this.visota;
    }

    public double obem(){
        double a = 1;
        double b = 3;
        return a/b*Math.PI*Math.pow(radius,2)*visota;
    }
    public double l(){
        return Math.sqrt(Math.pow(radius,2)+Math.pow(visota,2));
    }
    public double ploshadBok(){
        return Math.PI*radius*l();
    }
    public double obshayaPloshad(){
        return Math.PI*radius*l()+Math.PI*Math.pow(radius,2);
    }
}
