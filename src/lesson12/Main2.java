package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add("qwe"+i);
        }
        System.out.println("a " + (System.currentTimeMillis()-l));

        long l2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.add("qwe"+i);
        }
        System.out.println("b " + (System.currentTimeMillis()-l2));

        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        System.out.println("a " + (System.currentTimeMillis()-l1));

        long l3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.get(i);
        }
        System.out.println("b " + (System.currentTimeMillis()-l3));
    }
}
