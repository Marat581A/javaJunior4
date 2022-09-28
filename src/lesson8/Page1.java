package lesson8;

import Domash3.WallEnty;

public class Page1 {
    private String name;
    private int age;
    private String gorod;
    private WallEnty1[] stena = new WallEnty1[100];

    public Page1() {
    }

    public Page1(String name, int age, String gorod, WallEnty1[] stena) {
        this.name = name;
        this.age = age;
        this.gorod = gorod;
        this.stena = stena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public WallEnty1[] getStena() {
        return stena;
    }

    public void setStena(WallEnty1[] stena) {
        this.stena = stena;
    }

    public void zapic() {
        int max = 0;
        for (int i = 0; i < this.stena.length; i++) {
            for (int j = 0; j < this.stena[i].getKom1().length; j++) {
                if (max < this.stena[i].getKom1()[j].getLike()) {
                    max = this.stena[i].getKom1()[j].getLike();

                }
            }
        }
        System.out.println(max);
    }


}

