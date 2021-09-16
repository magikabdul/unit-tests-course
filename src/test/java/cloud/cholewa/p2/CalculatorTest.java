package cloud.cholewa.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        //given
        int a = 1;
        int b = 2;

        //when
        int sum = Calculator.sum(a, b);

        //then
        assertEquals(3, sum);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        //given
        int a = 3;
        int b = 2;

        //when
        int subtract = Calculator.subtract(a, b);

        //then
        assertEquals(1, subtract);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        //given
        int a = 4;
        int b = 2;

        //when
        int multiply = Calculator.multiply(a, b);

        //then
        assertEquals(8, multiply);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        //given
        int a = 9;
        int b = 2;

        //when
        float divide = Calculator.divide(a, b);

        //then
        assertEquals(4.5, divide);
    }
}
