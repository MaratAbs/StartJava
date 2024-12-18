import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "";
        do {
            calculator.start();
            while (!answer.contentEquals("yes") || !answer.equals("no")) {
                System.out.print("Хотите продолжить вычисления? yes / no:  ");
                answer = console.nextLine();
                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    break;
                }
            }
        } while (!"no".equals(answer));
    }
}