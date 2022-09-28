package Dom5;

public class Book extends Biblioteka {
    private String avtor;

    public Book() {

    }


    public Book(String nazvanie, int god, String izdatelstvo, int kolstr, String avtor) {
        super(nazvanie, god, izdatelstvo, kolstr);
        this.avtor = avtor;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }
}

