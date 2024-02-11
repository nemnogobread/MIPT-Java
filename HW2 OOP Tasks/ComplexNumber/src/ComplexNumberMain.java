package ru.skillbench.tasks.basics.math;

import java.util.Arrays;

public class ComplexNumberMain {
    public static void main(String[] args) {
        ComplexNumberImpl z = new ComplexNumberImpl();
        z.set("");
        System.out.println("re: " + z.getRe() + "\nim: " + z.getIm());
    }
}
