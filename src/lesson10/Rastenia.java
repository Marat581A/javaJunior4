package lesson10;

public class Rastenia {
    private String listya;
    private String razmnozhenie;
    private String osobennosti;

    public Rastenia() {
    }

    public Rastenia(String listya, String razmnozhenie, String osobennosti) {
        this.listya = listya;
        this.razmnozhenie = razmnozhenie;
        this.osobennosti = osobennosti;
    }

    public String getListya() {
        return listya;
    }

    public void setListya(String listya) {
        this.listya = listya;
    }

    public String getRazmnozhenie() {
        return razmnozhenie;
    }

    public void setRazmnozhenie(String razmnozhenie) {
        this.razmnozhenie = razmnozhenie;
    }

    public String getOsobennosti() {
        return osobennosti;
    }

    public void setOsobennosti(String osobennosti) {
        this.osobennosti = osobennosti;
    }

    @Override
    public String toString() {
        return "Rastenia{" +
                "listya='" + listya + '\'' +
                ", razmnozhenie='" + razmnozhenie + '\'' +
                ", osobennosti='" + osobennosti + '\'' +
                '}';
    }
}
