package lesson15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Tovar implements Comparable<Tovar> {
    private String name;
    private int price;
    private ArrayList<Otzivi> otzivis = new ArrayList<>();
    private ArrayList<Obzor> obzors = new ArrayList<>();

    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Otzivi> getOtzivis() {
        return otzivis;
    }

    public void setOtzivis(ArrayList<Otzivi> otzivis) {
        this.otzivis = otzivis;
    }

    public ArrayList<Obzor> getObzors() {
        return obzors;
    }

    public void setObzors(ArrayList<Obzor> obzors) {
        this.obzors = obzors;
    }

    public void addOtziv(Otzivi o) {
        otzivis.add(o);

    }

    public void addObzor(Obzor ob) {
        obzors.add(ob);
    }

    public double srRate() {
        double ress = 0;
        int coun = 0;
        for (Otzivi o : this.otzivis) {
            ress = ress + o.getRate();
            coun++;

        }
        if (coun != 0) {
            return ress / coun;
        } else return 0.0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (name != null ? !name.equals(tovar.name) : tovar.name != null) return false;
        if (otzivis != null ? !otzivis.equals(tovar.otzivis) : tovar.otzivis != null) return false;
        return obzors != null ? obzors.equals(tovar.obzors) : tovar.obzors == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (otzivis != null ? otzivis.hashCode() : 0);
        result = 31 * result + (obzors != null ? obzors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", otzivis=" + otzivis +
                ", obzors=" + obzors +
                "}\n";
    }


    @Override
    public int compareTo(Tovar o) {
        if (o.price != this.price) {
            //return this.price - o.price;
            //}
//        if(this.price > o.price){
//            return 1;
//        }else return -1;
            return Integer.compare(o.price, this.price);
        } else if (!this.name.equals(o.name)) {
            this.name.compareTo(o.name);
        } else if (this.srRate() != o.srRate()) {
            return Double.compare(this.srRate(), o.srRate());
        } else if (this.getObzors().size() != o.getObzors().size()) {
            return Integer.compare(this.getObzors().size(), o.getObzors().size());
        } else if (this.getOtzivis().size() != o.getOtzivis().size()) {
            return Integer.compare(this.getOtzivis().size(), o.getOtzivis().size());

        }
        return 0;

    }

    public static TreeSet<Tovar> setTo(TreeSet<Tovar> td) {
        TreeSet<Tovar> res = new TreeSet<>(new SsetTo());
        for (Tovar tt : td) {
            res.add(tt);

        }
        return res;
    }

    public static TreeSet<Tovar> dssds(TreeSet<Tovar> dd) {
        TreeSet<Tovar> res = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if (o1.srRate() != o2.srRate()) {
                    return Double.compare(o1.srRate(), o2.srRate());
                } else if (!o2.getName().equals(o1.getName())) {
                    return o2.getName().compareTo(o1.getName());
                } else if (o1.getPrice() != o2.getPrice()) {
                    return Integer.compare(o1.getPrice(), o2.getPrice());
                } else if (o1.getObzors().size() != o2.getObzors().size()) {
                    return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
                } else if (o1.getOtzivis().size() != o2.getOtzivis().size()) {
                    return Integer.compare(o1.getOtzivis().size(), o2.getOtzivis().size());

                }
                return 0;
            }
        });
        for (Tovar g : dd) {
            res.add(g);

        }
        return res;
    }

}

