import java.util.Scanner;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char operation;
    private int result; 

    public void start() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = console.nextInt();
        System.out.print("Введите знак арифметической операции (+, -, *, /, ^, %): ");
        operation = console.next().charAt(0);
        System.out.print("Введите второе число: ");
        secondNumber = console.nextInt();
        
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено!");
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            case '^':
                result = 1;
                for (int i = result; i <= secondNumber; i++) {
                    result = result * firstNumber;
                }
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Ошибка! Операция " + operation + " не поддерживается.");                
        }
        System.out.println("Результат вычисления: " + result);
    }
}