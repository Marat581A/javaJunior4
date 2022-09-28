package Lesson7.shop;

public class Tovar {
    private String name;
    private int price;
    private Otziv[] otzivi = new Otziv[100];

    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Otziv[] getOtzivi() {
        return otzivi;
    }

    public void setOtziv(Otziv otzivi) {
        int count = 0;
        for (int i = 0; i < this.otzivi.length; i++) {
            if(this.otzivi[i]==null){
                this.otzivi[i] = otzivi;
                break;
            }

            }
        if (count==this.otzivi.length){
            System.out.println("мест нет");

        }

    }
    public double srednii(){
        int count = 0;
        double rate = 0;
        for (int i = 0; i < this.otzivi.length; i++) {
            if (this.otzivi[i]!=null){
                count ++;
                rate = rate+this.otzivi[i].getRate();


            }

        }
        if(count == 0){
            return 0;
        }else {
            return rate/count;
        }



    }
}
