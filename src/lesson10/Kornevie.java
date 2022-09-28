package lesson10;

public class Kornevie extends Rastenia{
    private String koren2;
    private Boolean stebel2;

    public Kornevie() {

    }

    public Kornevie(String koren2, Boolean stebel2) {
        this.koren2 = koren2;
        this.stebel2 = stebel2;
    }

    public Kornevie(String listya, String razmnozhenie, String osobennosti, String koren2, Boolean stebel2) {
        super(listya, razmnozhenie, osobennosti);
        this.koren2 = koren2;
        this.stebel2 = stebel2;
    }

    public String getKoren2() {
        return koren2;
    }

    public void setKoren2(String koren2) {
        this.koren2 = koren2;
    }

    public Boolean getStebel2() {
        return stebel2;
    }

    public void setStebel2(Boolean stebel2) {
        this.stebel2 = stebel2;
    }
}
