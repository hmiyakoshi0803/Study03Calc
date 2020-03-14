package work.hmiyakoshi0803.Study03Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main (String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            Calculator calc = new Calculator();
            double resultVal = 0;

            while (true) {

                // Read line
                System.out.print(">");
                String line = br.readLine();

                // Parse input value
                String[] str = line.split("\\s+");
                String mode = str[0];
                double num = (str.length == 2) ? Double.parseDouble(str[1]) : 0;

                // Check Exit
                if (calc.isExit(mode)) {
                    System.out.println("bye bye ヾ(；ω；) bye bye");
                    return;
                }

                // Execute calculation
                try {
                    resultVal = calc.execCalc(mode, num);
                    System.out.println(resultVal);

                } catch (CalculatorException e) {
                    System.out.println(e.getMessage());

                }
            }
        } finally {
            //System.err.println("Something wrong...");
        }
    }

}
