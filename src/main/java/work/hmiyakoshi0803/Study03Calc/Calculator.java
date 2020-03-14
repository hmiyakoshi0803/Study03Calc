package work.hmiyakoshi0803.Study03Calc;

public class Calculator {

    double resultVal;

    public Calculator() {
        resultVal = 0;
    }

    public double execCalc(String mode, double num) throws CalculatorException{
        
        switch (mode) {
            case "ADD":
                resultVal += num;
                break;
            
            case "SUB":
                resultVal -= num;
                break;                        
            
            case "MUL":
                resultVal *= num;
                break;
            
            case "DIV":
                if (num == 0) throw new IllegalArgumentException("Divide by zero.");
                resultVal /= num;
                break;
            
            case "CLR":
                resultVal = 0;
                break;

            case "EXIT":
                break;

            default:
                throw new CalculatorException("Something is wrong...");
        }

        return resultVal;
    }

    // Check whether mode is EXIT or not.
    public boolean isExit(String mode) {
        return (mode.equals("EXIT"));
    }
}