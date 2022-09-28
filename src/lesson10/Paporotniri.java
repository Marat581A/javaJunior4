package lesson10;

public class Paporotniri extends Kornevie{
    private boolean kust;

    public Paporotniri() {

    }



    public Paporotniri(String listya, String razmnozhenie, String osobennosti, String koren2, Boolean stebel2, boolean kust) {
        super(listya, razmnozhenie, osobennosti, koren2, stebel2);
        this.kust = kust;
    }

    public boolean isKust() {
        return kust;
    }

    public void setKust(boolean kust) {
        this.kust = kust;
    }
}
