package work.hmiyakoshi0803.Study03Calc;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
    @Test
    public void Sum_PositiveIntNumber_Calculated() {
        Calculator calc = new Calculator();

        String mode = "ADD";
        double num1 = 12;
        double num2 = 24;
        double expected = 36;

        ResultCalc result = calc.execCalc(mode, num1, num2);

        double actual = result.val;

        assertEquals(expected, actual, 0);


    }
} 
