package Lesson9;

public class Avto extends Transport {
    boolean sport;
    public Avto() {
    }

    public Avto(String name, int koles) {
        super(name, koles);
    }

    @Override
    public void edet() {
        System.out.println("edet");
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }
}
