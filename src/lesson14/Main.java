package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap();

        Student student1 = new Student("petya",22);
        Student student2 = new Student("vasya",23);
        Student student3 = new Student("kolya",24);
        Student student4 = new Student("petya",25);


        map.put(student1,4);
        map.put(student2,5);
        map.put(student3,3);
        map.put(student4,2);

        student1.setAge(29);
        student1.setName("l=bob");
        map.put(student1,4);

        for(HashMap.Entry<Student,Integer> m: map.entrySet()){
            System.out.println("Key = " + m.getKey() + "Value = "+ m.getValue());
        }
        System.out.println();





    }
}
