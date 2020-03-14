package work.hmiyakoshi0803.Study03Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main (String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            Calculator calc = new Calculator();
            ResultCalc result = new ResultCalc();

            while (true) {

                // Read line
                System.out.print(">");
                String line = br.readLine();

                // Check input value
                String[] str = line.split("\\s+");
                String mode = str[0];
                double num = 0;
                if (str.length == 2) num = Double.parseDouble(str[1]);

                // Execute calculation
                result = calc.execCalc(mode, result.val, num);

                // Evaluate result
                if (result.rc == 0) {
                    System.out.println(result.val);

                } else if (result.rc == -1) {
                    System.out.println(result.val);
                    System.err.println("Please enter correct input");

                } else if (result.rc == 1) {
                    System.out.println("bye bye ヾ(；ω；) bye bye");
                    return;
                } else {
                    System.err.println("Something wrong...");
                    return;
                }
            }
        } finally {
            //System.err.println("Something wrong...");
        }
    }

}
