package dom2.shop;

import Lesson7.shop.Otziv;

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
        int c = 0;
        for (int i = 0; i < this.otzivi.length; i++) {
            if(this.otzivi[i] == null){
                this.otzivi[i] = otzivi;
                c = i;
                break;
            }

        }if (c == this.otzivi.length - 1){
            System.out.println("net");

        }

        }
        public void srednii(){


        }

    }

