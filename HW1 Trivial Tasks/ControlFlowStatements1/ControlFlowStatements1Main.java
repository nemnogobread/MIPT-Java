package ru.skillbench.tasks.basics.control;

import java.util.Arrays;

public class ControlFlowStatements1Main {
    public static void main(String[] args) {
        int[][] test = {
                {10, 2, 3},
                {4, 5, 6},
                {7, 1}
        };
        ControlFlowStatements1Impl A = new ControlFlowStatements1Impl();
        System.out.println(A.getFunctionValue(1));
        System.out.println(A.decodeWeekday(3));
        System.out.println(A.getMinValue(test));
        System.out.println(Arrays.deepToString(A.initArray()));
        System.out.println(A.calculateBankDeposit(13));
    }
}
