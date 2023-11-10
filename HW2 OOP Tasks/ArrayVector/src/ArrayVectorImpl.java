package ru.skillbench.tasks.basics.math;

import java.util.Arrays;

public class ArrayVectorImpl implements ArrayVector{
    private double[] cords;

    public ArrayVectorImpl() {
    }

    public ArrayVectorImpl(double[] array) {
        this.cords = array;
    }

    @Override
    public void set(double... elements) {
        cords = new double[elements.length];
        System.arraycopy(elements, 0, cords, 0, elements.length);
    }

    @Override
    public double[] get() {
        return cords;
    }

    @Override
    public ArrayVector clone() {
        ArrayVectorImpl temp = new ArrayVectorImpl();
        temp.set(this.cords);
        return temp;
    }

    @Override
    public int getSize() {
        return this.cords.length;
    }

    @Override
    public void set(int index, double value) {
        if (index < 0){
            return;
        }
        else if (index < this.getSize()) {
            this.cords[index] = value;
        }
        else {
            double[] temp;
            temp = Arrays.copyOf(this.cords, index + 1);
            temp[index] = value;
            this.cords = temp;
        }
    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return this.cords[index];
    }

    @Override
    public double getMax() {
        double max = this.cords[0];
        for (int i = 0; i < this.getSize(); i++){
            if (this.cords[i] > max){
                max = this.cords[i];
            }
        }
        return max;
    }

    @Override
    public double getMin() {
        double min = this.cords[0];
        for (int i = 0; i < this.getSize(); i++){
            if (this.cords[i] < min){
                min = this.cords[i];
            }
        }
        return min;
    }

    @Override
    public void sortAscending() {
        Arrays.sort(this.cords);
    }

    @Override
    public void mult(double factor) {
        for (int i = 0; i < this.getSize(); i++){
            this.cords[i] *= factor;
        }
    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        for (int i = 0; i < this.getSize() && i < anotherVector.getSize(); i++){
            this.cords[i] += anotherVector.get(i);
        }
        return this;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        double res = 0;
        for (int i = 0; i < this.getSize() && i < anotherVector.getSize(); i++){
            res += this.cords[i] * anotherVector.get(i);
        }
        return res;
    }

    @Override
    public double getNorm() {
        return Math.sqrt(scalarMult(this));
    }

}
