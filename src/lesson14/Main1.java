package lesson14;

import java.util.HashMap;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {
        TreeMap<Integer,Student> map = new TreeMap<>();

        Student student1 = new Student("petya",22);
        Student student2 = new Student("vasya",23);
        Student student3 = new Student("kolya",24);
        Student student4 = new Student("petya",25);

        map.put(4,student1);
        map.put(5,student2);
        map.put(3,student3);
        map.put(2,student4);

        System.out.println(map);
    }
}
