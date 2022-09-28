package Lesson9;

public abstract class Transport {
    private String name;
    private int koles;
    private boolean sport;

    public boolean isSport() {
        return sport;
    }

    public void printName(){
        System.out.println(name);
    }

    public Transport() {
    }

    public Transport(String name, int koles) {
        this.name = name;
        this.koles = koles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKoles() {
        return koles;
    }

    public void setKoles(int koles) {
        this.koles = koles;
    }
    public abstract void edet();
}
