package Lesson7;

public class Passport {

    private String name;
    private int nomer;
    private String born;
    private String propiska;
    private Passport zhena;

    public Passport getZhena() {
        return zhena;
    }

    public void setZhena(Passport zhena) {
        this.zhena = zhena;
    }

    public Passport(){

    }

    public Passport(String name, int nomer, String born, String propiska) {
        this.name = name;
        this.nomer = nomer;
        this.born = born;
        this.propiska = propiska;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getPropiska() {
        return propiska;
    }

    public void setPropiska(String propiska) {
        this.propiska = propiska;
    }
}
