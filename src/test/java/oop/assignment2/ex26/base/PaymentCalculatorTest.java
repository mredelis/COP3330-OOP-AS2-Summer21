package oop.assignment2.ex26.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    @DisplayName("Balance $5000, APR 12% , Monthly Payment $100")
    void calculateMonthsUntilPaidOff_Test1() {
        PaymentCalculator cal = new PaymentCalculator();

        int expected = 70;
        int actual = cal.calculateMonthsUntilPaidOff(5000, 12, 100);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Balance $5000, APR 12% , Monthly Payment $300")
    void calculateMonthsUntilPaidOff_Test2() {
        PaymentCalculator cal = new PaymentCalculator();

        int expected = 19;
        int actual = cal.calculateMonthsUntilPaidOff(5000, 12, 300);
        assertEquals(expected, actual);
    }
}