package Dom5;

public class Magazine extends Biblioteka  {
    private int nomer;

    public Magazine() {

    }

    public Magazine(String nazvanie, int god, String izdatelstvo, int kolstr, int nomer) {
        super(nazvanie, god, izdatelstvo, kolstr);
        this.nomer = nomer;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }
}
