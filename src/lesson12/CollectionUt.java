package lesson12;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUt implements CollectionUtils{
    private ArrayList<Integer> arrayList = new ArrayList<>();
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(a);
        res.addAll(b);
        return res;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();
        aa.addAll(a);
        bb.addAll(b);

        aa.removeAll(b);
        a.removeAll(aa);

        bb.removeAll(a);
        b.removeAll(bb);

        res.addAll(a);
        res.addAll(b);




        return res;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> res = new HashSet<>();
        res.addAll(a);
        res.addAll(b);
        return res;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet <Integer> res = new HashSet<>();
        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();
        aa.addAll(a);
        bb.addAll(b);

        aa.removeAll(b);
        a.removeAll(aa);

        bb.removeAll(a);
        b.removeAll(bb);

        res.addAll(a);
        res.addAll(b);

        return res;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> aa = new ArrayList<>();

        aa.addAll(a);


        a.removeAll(b);
        b.removeAll(aa);

        res.addAll(a);
        res.addAll(b);



        return res;
    }
}
