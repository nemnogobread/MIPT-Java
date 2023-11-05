package ru.skillbench.tasks.basics.control;

public class ControlFlowStatements2Impl implements ControlFlowStatements2{
    public ControlFlowStatements2Impl(){}

    @Override
    public int getFunctionValue(int x) {
        if (x < -2  || x > 2)
            return 2 * x;
        else
            return -3 * x;
    }

    @Override
    public String decodeMark(int mark) {
        switch (mark) {
            case 1:
                return "Fail";
            case 2:
                return "Poor";
            case 3:
                return "Satisfactory";
            case 4:
                return "Good";
            case 5:
                return "Excellent";
            default:
                return "Error";
        }
    }

    @Override
    public double[][] initArray() {
        double[][] array = new double[5][8];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = Math.pow(i, 4) - Math.pow(j, 0.5);
            }
        }
        return array;
    }


    @Override
    public double getMaxValue(double[][] array) {
        double max = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    @Override
    public Sportsman calculateSportsman(float P) {
        Sportsman object = new Sportsman();
        float temp = 10;
        object.addDay((float) (temp));
        while (object.getTotalDistance() < 200){
            temp += (float) (temp * P * 0.01);
            object.addDay((float) (temp));
        }
        return object;
    }
}

