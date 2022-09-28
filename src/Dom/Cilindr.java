package Dom;

public class Cilindr {

    private double visota;
    private double radius;

    public void setVisota(double a){
        this.visota = a;
    }
    public void setRadius(double b){
        this.radius = b;
    }

    public double getRadius() {
        return radius;
    }

    public double getVisota() {
        return visota;
    }

    public double ploshad1(){
        return Math.PI * Math.pow(radius,2);
    }
    public double ploshad2BokPoverx(){
        return 2*Math.PI*radius*visota;
    }
    public double obshayaPloshad(){
        return ploshad1() * 2 + ploshad2BokPoverx();
    }
}
