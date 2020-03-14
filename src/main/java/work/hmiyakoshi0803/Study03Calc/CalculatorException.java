package work.hmiyakoshi0803.Study03Calc;

public class CalculatorException extends Exception{

    //To avoid warning message
	private static final long serialVersionUID = 1L; 

	// Constructor
	CalculatorException(String msg){
		super(msg);
	}
}