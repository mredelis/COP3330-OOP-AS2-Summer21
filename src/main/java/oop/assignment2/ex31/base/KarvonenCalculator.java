package oop.assignment2.ex31.base;

public class KarvonenCalculator {
    public int calculateTargetHeartRate(int age, int restingHR, int intensity){
        // TargetHeartRate
        return (((220 - age) - restingHR) * intensity/100) + restingHR;

    }
}
