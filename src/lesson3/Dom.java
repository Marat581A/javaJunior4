package lesson3;

public class Dom {
    public static void main(String[] args) {
        char [] abc = {'a','b','c'};
        char [] qwe = {'q','w','e'};
        char [] abcqwe = new char[abc.length + qwe.length];

        for (int i = 0; 0 < abcqwe.length; i ++){
            if(i < abc.length) {
                abcqwe[i] = abc[i];
            }
            else abcqwe[i] = qwe[i - abc.length];
            System.out.println(abcqwe[i]);
        }







        }


    }
