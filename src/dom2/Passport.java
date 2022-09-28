package dom2;

public class Passport {
    private String name;
    private int nomer;
    private String born;
    private String propiska;
    private People jena;

    public People getJena() {
        return jena;
    }

    public void setJena(People jena) {
        this.jena = jena;
    }

    public Passport() {
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
