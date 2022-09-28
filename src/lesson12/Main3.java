package lesson12;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        HashSet<Coins> coins = new HashSet<>();

        Coins c = new Coins(1,2,"med");
        Coins c1 = new Coins(3,4,"serebro");
        Coins c2 = new Coins(1,3,"zoloto");
        Coins c3 = new Coins(1,2,"med");

        coins.add(c);
        coins.add(c1);
        coins.add(c2);
        coins.add(c3);

        System.out.println(coins);
    }
}
