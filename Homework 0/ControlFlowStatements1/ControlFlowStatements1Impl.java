package ru.skillbench.tasks.basics.control;

public class ControlFlowStatements1Impl implements ControlFlowStatements1{
    public ControlFlowStatements1Impl(){}

    @Override
    public float getFunctionValue(float x) {
        if (x > 0)
            return (float) (2 * Math.sin(x));
        else
            return  6 - x;
    }

    @Override
    public String decodeWeekday(int weekday) {
        String day;
        switch (weekday) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "NULL";
        };
        return day;
    }

    @Override
    public int[][] initArray() {
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = i * j;
            }
        }
        return array;
    }

    @Override
    public int getMinValue(int[][] array){
        int min = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    @Override
    public BankDeposit calculateBankDeposit(double P) {
        BankDeposit deposit = new BankDeposit();
        deposit.amount = 1000;
        while (deposit.amount <= 5000){
            deposit.amount += deposit.amount * P * 0.01;
            deposit.years ++;
        }
        return deposit;
    }
}

