package Dom5;

public class Biblioteka {
    private String nazvanie;
    private int god;
    private String izdatelstvo;
    private int kolstr;

    public Biblioteka() {
    }

    public Biblioteka(String nazvanie, int god, String izdatelstvo,int kolstr) {
        this.nazvanie = nazvanie;
        this.god = god;
        this.izdatelstvo = izdatelstvo;
        this.kolstr = kolstr;

    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }

    public int getKolstr() {
        return kolstr;
    }

    public void setKolstr(int kolstr) {
        this.kolstr = kolstr;
    }

    @Override
    public String toString() {
        return
                "Название: " + nazvanie +
                " год " + god +
                " издательство: " + izdatelstvo +
                " кол -во страниц: " + kolstr;
    }
}
