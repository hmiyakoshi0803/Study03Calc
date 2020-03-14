package work.hmiyakoshi0803.Study03Calc;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
    @Test
    public void ADD_PositiveIntNumber_Calculated() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "ADD";
        double num1 = 12;
        double num2 = 24;
        double expected = 36;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    @Test
    public void SUB_PositiveIntNumber_Calculated() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "SUB";
        double num1 = 12;
        double num2 = 24;
        double expected = -12;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    @Test
    public void MUL_PositiveIntNumber_Calculated() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "MUL";
        double num1 = 12;
        double num2 = 3;
        double expected = 36;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    public void DIV_PositiveIntNumber_Calculated() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "DIV";
        double num1 = 12;
        double num2 = 3;
        double expected = 4;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    @Test
    public void ADD_PositiveDoubleNumber_Calculated() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "ADD";
        double num1 = 12.3;
        double num2 = 3.5;
        double expected = 15.8;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    public void SUB_PositiveDoubleNumber_Calculated() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "SUB";
        double num1 = 12.3;
        double num2 = 3.7;
        double expected = 8.6;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    @Test
    public void MUL_PositiveDoubleNumber_Calculated() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "MUL";
        double num1 = 12.3;
        double num2 = 3.3;
        double expected = 40.59;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    @Test
    public void DIV_PositiveDoubleNumber_Calculated() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "DIV";
        double num1 = 12.3;
        double num2 = 4.1;
        double expected = 3.0;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    @Test
    public void CLEAR_RESULT() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "CLR"; 
        double num1 = 12.3;
        double num2 = 4.1;
        double expected = 0.0;

        calc.execCalc("ADD", num1);
        double actual = calc.execCalc(mode, num2);

        assertEquals(expected, actual, 0.001d);

    }

    @Test
    public void isExit() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "EXIT";  
        assertTrue(calc.isExit(mode));

    }

    @Test (expected = CalculatorException.class)
    public void IllegalModeValue() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "HOGE";
        double num = 0;

        calc.execCalc(mode, num);

    }

    @Test (expected = IllegalArgumentException.class)
    public void DIV_by_zero() throws CalculatorException{
        Calculator calc = new Calculator();

        String mode = "DIV";
        double num1 = 12.3;
        double num2 = 0;

        calc.execCalc("ADD", num1);
        calc.execCalc(mode, num2);

    }

} 
