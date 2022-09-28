package Dom5;

public class Main {
    public static void main(String[] args) {

        Magazine mag = new Magazine("Из рук в руки",2021,"Радуга",102,5);
        Magazine mag1 = new Magazine("Автомир",2019,"Дождь",158,3);
        Magazine mag2 = new Magazine("Жигули",2016,"Солнце",92,2);
        Magazine mag3 = new Magazine("Мурзилка",2011,"Заря",35,1);

        Book kn = new Book("Лес",1996,"Берег",545,"150");
        Book kn2 = new Book("Море",1997,"Луна",169,"160");
        Book kn3= new Book("Гуси",1998,"Берег",155,"177");
        Book kn4 = new Book("Охота",1999,"Озеро",165,"136");

        Biblioteka[] bib = new Biblioteka[]{mag,mag1,mag2,mag3,kn,kn2,kn3,kn4};
        Biblioteka b = new Biblioteka();

        for (int i = 0; i < bib.length  ; i++) {
            if (bib[i].getKolstr()> b.getKolstr()){
                b = bib[i];

            }

        }
        System.out.println(b);


    }
}
