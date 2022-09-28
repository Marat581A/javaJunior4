package lesson10;

public class Derevya extends Kornevie{
    private String type;

    public Derevya() {

    }



    public Derevya(String listya, String razmnozhenie, String osobennosti, String koren2, Boolean stebel2, String type) {
        super(listya, razmnozhenie, osobennosti, koren2, stebel2);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
