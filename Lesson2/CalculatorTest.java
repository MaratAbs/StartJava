import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "";
        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(console.nextInt());
            System.out.print("Введите знак арифметической операции (+, -, *, /, ^, %): ");
            calculator.setOperation(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(console.nextInt());
            calculator.calculate();
            console.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? yes / no:  ");
                answer = console.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!"no".equals(answer));
    }
}