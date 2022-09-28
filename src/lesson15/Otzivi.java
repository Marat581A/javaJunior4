package lesson15;

public class Otzivi {
    private int rate;
    private String komment;

    public Otzivi() {
    }

    public Otzivi(int rate, String komment) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otzivi otzivi = (Otzivi) o;

        if (rate != otzivi.rate) return false;
        return komment != null ? komment.equals(otzivi.komment) : otzivi.komment == null;
    }

    @Override
    public int hashCode() {
        int result = rate;
        result = 31 * result + (komment != null ? komment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Otzivi{" +
                "rate=" + rate +
                ", komment='" + komment + '\'' +
                '}';
    }
}
