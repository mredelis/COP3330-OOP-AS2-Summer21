package oop.assignment2.ex36.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StatisticsCalculator {

    public double averageTime(ArrayList<Double> array){
        int sum = 0;
        for(int i = 0; i < array.size(); i++)
            sum += array.get(i);

        return (double) sum / array.size();
    }

    public double maxTime(ArrayList<Double> array){
        Collections.sort(array);
        return array.get(array.size() - 1);
    }

    public double minTime(ArrayList<Double> array){
        Collections.sort(array);
        return array.get(0);
    }

    public double standardDeviation(ArrayList<Double> array){
        double mean = this.averageTime(array);
        double tempSum = 0;

        for(int i = 0; i < array.size(); i++)
            tempSum += Math.pow(Math.abs(array.get(i) - mean), 2);

        return Math.sqrt(tempSum / array.size());
    }

}
