package oop.assignment2.ex26.base;

public class PaymentCalculator {

    public int calculateMonthsUntilPaidOff(double b, double apr, double p){

        double i = (apr/100)/365;  // daily rate as a percentage. Convert to decimal and (APR divided by 365)

        double n; // numbers of months to payoff card
        n = -(1.0 / 30.0) * Math.log(1 + b/p * (1 - Math.pow((1 + i), 30))) / Math.log(1 + i);

        return (int)Math.ceil(n);
    }
}
