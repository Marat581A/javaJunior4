package Domash3;

public class Page {
    private String name;
    private String famaly;
    private int age;
    private String gorod;
    private WallEnty[] zapic = new WallEnty[100];

    public Page() {
    }

    public Page(String name, String famaly, int age, String gorod) {
        this.name = name;
        this.famaly = famaly;
        this.age = age;
        this.gorod = gorod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamaly() {
        return famaly;
    }

    public void setFamaly(String famaly) {
        this.famaly = famaly;
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

    public WallEnty[] getWallEnty() {
        return zapic;
    }

    public void setWallEnt(WallEnty zapic) {
        int w = 0;
        for (int i = 0; i < this.zapic.length; i++) {
            if (this.zapic[i] == null) {
                this.zapic[i] = zapic;
                w = i;
                break;

            }
            if (w == this.zapic.length - 1) {
                System.out.println("net");
            }


        }
        if (w == this.zapic.length - 1) {
            System.out.println("net");
        }
    }
}