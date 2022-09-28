package lesson13;

public class Stringut implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {


        if (number1 == null || number1 == "") {
            throw new NullPointerException("Поле 1 пусто");
        }
        if (number2 == null || number2 == "") {
            throw new NullPointerException("Поле 2 пусто");
        }
        String alpha = "qwertyuiopasdfghjklzxcvbnm";
        char[] alpha1 = alpha.toCharArray();

        char[] num1 = number1.toCharArray();
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < alpha1.length; j++) {
                if (num1[i] == alpha1[j]) {
                    throw new NumberFormatException("В number1 символ: - " + alpha1[j]);

                }

            }
            if (number1 == null) {
                throw new NullPointerException("Поле 1 пусто");
            }

        }
        char[] num2 = number2.toCharArray();
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < alpha1.length; j++) {
                if (num2[i] == alpha1[j]) {
                    throw new NumberFormatException("В number2 символ:  - " + alpha1[j]);

                }

            }

        }
        if (!number2.equals("0")) {

        } else throw new ArithmeticException("на ноль нельзя");

        if (!number1.equals("0")) {

        } else throw new ArithmeticException("на ноль нельзя");


        return 0;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        int index = text.indexOf(word);

        System.out.println(index);


     return new int[0];
}
    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
