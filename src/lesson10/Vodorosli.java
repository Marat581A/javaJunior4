package lesson10;

public class Vodorosli extends Rastenia{

    private boolean po4va;

    public Vodorosli() {

    }

    public Vodorosli(String listya, String razmnozhenie, String osobennosti, boolean po4va) {
        super(listya, razmnozhenie, osobennosti);
        this.po4va = po4va;
    }

    public boolean isPo4va() {
        return po4va;
    }

    public void setPo4va(boolean po4va) {
        this.po4va = po4va;
    }
}
