package Lesson7.shop;

public class Otziv {
    private int rate;
    private String komment;

    public Otziv() {

    }

    public Otziv(int rate, String komment) {
        this.rate = rate;
        this.komment = komment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getKomment() {
        return komment;
    }

    public void setKomment(String komment) {
        this.komment = komment;
    }
}
