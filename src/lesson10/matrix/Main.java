package lesson10.matrix;

public class Main {
    public static void main(String[] args) {


        Matrix m = new Matrix(2,2);
        Matrix b = new Matrix(2,2);

        m.setValueAt(0,0,1);
        m.setValueAt(0,1,1);
        m.setValueAt(1,0,1);
        m.setValueAt(1,1,1);

        b.setValueAt(0,0,2);
        b.setValueAt(0,1,3);
        b.setValueAt(1,0,4);
        b.setValueAt(1,1,5);


        Matrix g = new Matrix();

        g = (Matrix) m.mul(b);
        System.out.println();
        System.out.println(m.getRows());







    }
}
