package lesson8;

public class WallEnty1 {
    private String zap;
    private String kartinka;
    private Komment1[] kom1 = new Komment1[100];

    public WallEnty1() {
    }

    public WallEnty1(String zap, String kartinka, Komment1[] kom1) {
        this.zap = zap;
        this.kartinka = kartinka;
        this.kom1 = kom1;
    }

    public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        this.zap = zap;
    }

    public String getKartinka() {
        return kartinka;
    }

    public void setKartinka(String kartinka) {
        this.kartinka = kartinka;
    }

    public Komment1[] getKom1() {
        return kom1;
    }

    public void setKom1(Komment1[] kom1) {
        this.kom1 = kom1;
    }
}
