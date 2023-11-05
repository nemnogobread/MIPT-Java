package ru.skillbench.tasks.basics.control;

import java.util.Arrays;

public class ControlFlowStatements2Main {
    public static void main(String[] args) {
        ControlFlowStatements2Impl A = new ControlFlowStatements2Impl();
        double[][] test = {
                {10, 2, 3},
                {4, 5, 6},
                {7, 1}
        };
        System.out.println(A.getFunctionValue(1));
        System.out.println(A.decodeMark(3));
        System.out.println(Arrays.deepToString(A.initArray()));
        System.out.println(A.getMaxValue(test));
        System.out.println(A.calculateSportsman((float)12.5));
    }
}
