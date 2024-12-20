public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char operation;
    private int result; 

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
                    result *= firstNumber;
                }
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Ошибка! Операция " + operation + " не поддерживается.");
                return;
        }
        System.out.println("Результат вычисления: " + result);
    }
}