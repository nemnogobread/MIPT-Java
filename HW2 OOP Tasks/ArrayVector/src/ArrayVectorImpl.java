package ru.skillbench.tasks.basics.control;

public class ArrayVectorImpl implements ArrayVector{
    @Override
    public void set(double... elements) {

    }

    @Override
    public double[] get() {
        return new double[0];
    }

    @Override
    public ArrayVector clone() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void set(int index, double value) {

    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return 0;
    }

    @Override
    public double getMax() {
        return 0;
    }

    @Override
    public double getMin() {
        return 0;
    }

    @Override
    public void sortAscending() {

    }

    @Override
    public void mult(double factor) {

    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        return null;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        return 0;
    }

    @Override
    public double getNorm() {
        return 0;
    }
}
