package lesson8;

import Domash3.Page;

public class Main {
    public static void main(String[] args) {


        Komment1 kome = new Komment1("kdfjskdf",1);
        Komment1 kome1 = new Komment1("sdjfhjs",7);
        Komment1 kome2 = new Komment1("rtcbbvv",16);
        Komment1 kome3 = new Komment1("hghgfhvg",18);
        Komment1 kome4 = new Komment1("kdfjskdf",11);

        Komment1[] komm = new Komment1[]{kome,kome1,kome2};
        Komment1[] komm1 = new Komment1[]{kome3,kome2,kome4};
        Komment1[] komm2 = new Komment1[]{kome1,kome4,kome};


        WallEnty1 zapi = new WallEnty1("sdfksdlf","kartina1",komm2);
        WallEnty1 zapi1 = new WallEnty1("shjghjg","kartina2",komm);
        WallEnty1 zapi2 = new WallEnty1("khjhj","kartina3",komm1);

        WallEnty1[] z = new WallEnty1[]{zapi,zapi2,zapi1};
        Page1 ctr = new Page1("poma",8,"kazan",z);



        ctr.zapic();



    }

}
