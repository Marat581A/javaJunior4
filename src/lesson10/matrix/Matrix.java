package lesson10.matrix;

import java.util.Arrays;

public class Matrix implements IMatrix {
    private double[][] arr;


    public Matrix() {
        arr = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int rowIndex, int colIndex) {
        arr = new double[rowIndex][colIndex];

    }


    @Override
    public int getRows() {
        return arr.length;
    }

    @Override
    public int getColumns() {
        return arr[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return arr[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        arr[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() == otherMatrix.getRows() && this.getColumns() == otherMatrix.getColumns()) {
            Matrix res = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    res.setValueAt(i, j, (this.getValueAt(i, j) + otherMatrix.getValueAt(i, j)));

                }

            }
            return res;
        } else return null;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() == otherMatrix.getRows() && this.getColumns() == otherMatrix.getColumns()) {
            Matrix res2 = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    res2.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));

                }

            }
            return res2;
        } else return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

            Matrix res3 = new Matrix(this.getRows(), otherMatrix.getColumns());
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    for (int k = 0; k < otherMatrix.getRows(); k++) {
                        res3.setValueAt(i, j, (res3.getValueAt(i,j) + this.getValueAt(i, j) * otherMatrix.getValueAt(k, j)));

                }

            }

        }
        return res3;
    }

    @Override
    public IMatrix mul(double value) {

        Matrix res4 = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                this.setValueAt(i, j, value * arr[i][j]);

            }


        }
        return res4;

    }

    @Override
    public IMatrix transpose() {
        Matrix res = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res.setValueAt(j, i, arr[j][i]);

            }

        }
        return res;
    }

    @Override
    public void fillMatrix(double value) {
        Matrix res7 = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                this.setValueAt(i, j, value);

            }

        }

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        boolean t = true;
        boolean f = false;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    return f;


                }

            }

        }
        return t;

    }

    @Override
    public boolean isIdentityMatrix() {
        boolean t = true;
        boolean f = false;
        int d = 0;
        int ost = 0;
        int minDig = this.getColumns()>this.getColumns()?this.getColumns():this.getRows();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (arr[i][j] == 1) {
                        d++;
                    }else {
                        if(arr[i][j] != 0){
                            ost ++;
                        }
                    }

                }

            }

        }
        return t;
    }

    @Override
    public boolean isSquareMatrix() {
        boolean t = true;
        boolean f = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (this.getRows() == this.getColumns()) {

                    return t;
                }

            }

        }

        return false;
    }

    @Override
    public void printToConsole() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }


    }


}
