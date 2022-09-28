package lesson3;

public class Main6 {
    public static void main(String[] args) {
        char[] abc = {'a','b','c'};
        char[] qwe = {'q','w','e'};
        char[] bnm = new char[abc.length + qwe.length];
        for (int i = 0; i < bnm.length; i++) {
            if (i < abc.length){
                bnm[i] = abc[i];
            }
            else { bnm[i] = qwe[i - abc.length];

            }
            System.out.println(bnm[i]);
        }


    }
}
