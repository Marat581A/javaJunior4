package lesson10;

public class Main {
    public static void main(String[] args) {

        Rastenia rast = new Rastenia();
        Vodorosli vodr = new Vodorosli("красные","деление","для суши",false);
        Mhi mhi = new Mhi("orang","po4kovanie","pod polom",true);
        Kornevie korn = new Kornevie();
        Paporotniri papo = new Paporotniri("zelenii","korn",
                "gorsh","koren",true,true);
        Derevya der = new Derevya("zelen","korn",
                "iz zemli","koren",true,"the best");

        Rastenia [] arr = new Rastenia[]{vodr,mhi,korn,papo,der};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());

        }
    }
}
