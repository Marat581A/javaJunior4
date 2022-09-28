package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MainDZ {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();




        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);



        CollectionUt collectionUt = new CollectionUt();
        Set<Integer> integers = collectionUt.intersectionWithoutDuplicate(arrayList, arrayList2);
        Collection<Integer> union = collectionUt.union(arrayList, arrayList2);


        System.out.println(collectionUt.difference(arrayList,arrayList2));





    }
}
