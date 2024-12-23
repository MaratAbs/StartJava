public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char operation;
    
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        int result = 0;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Результат вычисления: " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Результат вычисления: " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Результат вычисления: " + result);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено!");
                } else {
                    result = firstNumber / secondNumber;
                    System.out.println("Результат вычисления: " + result);
                }
                break;
            case '^':
                result = 1;
                for (int i = result; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println("Результат вычисления: " + result);
                break;
            case '%':
                result = firstNumber % secondNumber;
                System.out.println("Результат вычисления: " + result);
                break;
            default:
                System.out.println("Ошибка! Операция " + operation + " не поддерживается.");
                return;
        }
    }
}