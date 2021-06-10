package oop.assignment2.ex28.base;

public class Calculator {

    public double addNumbers(double[] array){
        double total = 0;
        for(int count = 0; count < array.length; count++){
            total += array[count];
        }
        return total;
    }
}
