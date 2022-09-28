package lesson15;

import java.util.Comparator;

public class SsetTo implements Comparator<Tovar> {


    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (!o2.getName().equals(o1.getName())) {
           return o2.getName().compareTo(o1.getName());
        } else if (o1.getPrice() != o2.getPrice()) {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        } else if (o1.srRate() != o2.srRate()) {
            return Double.compare(o1.srRate(), o2.srRate());
        } else if (o1.getObzors().size() != o2.getObzors().size()) {
            return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
        } else if (o1.getOtzivis().size() != o2.getOtzivis().size()) {
            return Integer.compare(o1.getOtzivis().size(), o2.getOtzivis().size());

        }

        return 0;
    }
}
