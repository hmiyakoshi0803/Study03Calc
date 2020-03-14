package work.hmiyakoshi0803.Study03Calc;

public class Calculator {


    public ResultCalc execCalc(String mode, double num1, double num2) {
        
        ResultCalc result = new ResultCalc();

        result.rc = 0;
        result.val = 0;

        switch (mode) {
            case "ADD":
                result.val = num1 + num2;
                break;
            
            case "SUB":
                result.val = num1 - num2;
                break;                        
            
            case "MUL":
                result.val = num1 * num2;
                break;
            
            case "DIV":
                result.val = num1 / num2;
                break;
            
            case "CLR":
                result.val = 0;
                break;

            case "EXIT":
                result.rc = 1;
                break;

            default:
                result.val = num1;
                result.rc = -1;
                break;
        }

        return result;
    }
}