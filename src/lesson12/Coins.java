package lesson12;

public class Coins {
    private int diam;
    private int val;
    private String sostav;

    public Coins() {
    }

    public Coins(int diam, int val, String sostav) {
        this.diam = diam;
        this.val = val;
        this.sostav = sostav;
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getSostav() {
        return sostav;
    }

    public void setSostav(String sostav) {
        this.sostav = sostav;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coins coins = (Coins) o;

        if (diam != coins.diam) return false;
        if (val != coins.val) return false;
        return sostav != null ? sostav.equals(coins.sostav) : coins.sostav == null;
    }

    @Override
    public int hashCode() {
        int result = diam;
        result = 31 * result + val;
        result = 31 * result + (sostav != null ? sostav.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Монета " +
                "диаметр: " + diam +
                " цена: " + val +
                " сплав: " + sostav;
    }
    }

