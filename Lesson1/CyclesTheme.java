public class CyclesTheme {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int evenSum = 0;
        int oddSum = 0;
        int min = -10;
        int max = 10;
        do {
            if ((min % 2 == 0) && (min < 0)) {
                evenSum = evenSum + (-min);
            } else {
                evenSum += min;
            }
            if ((min % 2 != 0) && (min < 0)) {
                oddSum = oddSum + (-min);
            } else {
                oddSum += min;
            }
            min++;
        } while (min <= max);
        System.out.println("\nВ отрезке [-10; 21] сумма чётных чисел = " + evenSum + 
                ", а нечетных = " + oddSum);

        // ЗАДАНИЕ 2
        System.out.println("\n2. Вывод чисел между min и max в порядке убывания\n");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        max = 0;
        min = 0;
        if ((number1 > number2) && (number2 > number3)) {
            max = number1;
            min = number3;
        } else if ((number3 > number2) && (number2 > number1)) {
            max = number3;
            min = number1;
        } else if ((number2 > number3) && (number3 > number1)) {
            max = number2;
            min = number1;
        } else if ((number1 > number3) && (number3 > number2)) {
            max = number1;
            min = number2;
        } else if ((number3 > number1) && (number1 > number2)) {
            max = number3;
            min = number2;
        } else if ((number2 > number1) && (number1 > number3)) {
            max = number2;
            min = number3;
        }
        for (max -= 1; max > min; max--) {
            System.out.print(max + " ");
        }
        System.out.println();

        // ЗАДАНИЕ 3
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");
        int originalNumber = 1234;
        int number = originalNumber;
        int remainder = 0;
        int reversedInteger = 0;
        int sum = 0;
        while (number > 0) {
            remainder = number % 10;
            number /= 10;
            reversedInteger = reversedInteger * 10 + remainder;
            sum += remainder;
        }
        System.out.println("Число: " + reversedInteger);
        System.out.println("Сумма: " + sum);

        // ЗАДАНИЕ 4
        System.out.println("\n4. Вывод чисел в несколько строк\n");
        number = 24;
        int counterOfNumbers = 0;
        for (int i = 1; i < number; i += 2) {
            counterOfNumbers++;
            System.out.printf("%3d", i);
            if (counterOfNumbers == 5) {
                System.out.println();
                counterOfNumbers = 0;
            }
        }
        if (counterOfNumbers < 5) {
            if (counterOfNumbers == 1) {
                System.out.printf("%3d%3d%3d%3d\n", 0, 0, 0, 0);
            } else if (counterOfNumbers == 2) {
                System.out.printf("%3d%3d%3d\n", 0, 0, 0);
            } else if (counterOfNumbers == 3) {
                System.out.printf("%3d%3d\n", 0, 0);
            } else if (counterOfNumbers == 4) {
                System.out.printf("%3d", 0);
            }
        }
        System.out.println();

        // ЗАДАНИЕ 5
        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");
        originalNumber = 3_242_592;
        reversedInteger = originalNumber;
        int counterOfDigits = 0;
        remainder = 0;
        while (reversedInteger != 0) {
            remainder = reversedInteger % 10;
            if (remainder == 2) {
                counterOfDigits++;
            }
            reversedInteger /= 10;
        }
        if (counterOfDigits % 2 == 0) {
            System.out.println("В " + originalNumber + 
                    " чётное (" + counterOfDigits + ") количество двоек");
        } else {
            System.out.println("В " + originalNumber + 
                    " нечётное (" + counterOfDigits + ") количество двоек");
        }

        // ЗАДАНИЕ 6
        System.out.println("\n6. Вывод геометрических фигур\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int row = 1;
        while (row <= 5) {
            int elementCounter = row;
            while (elementCounter <= 5) {
                System.out.print("#");
                elementCounter++;
            }
            System.out.println();
            row++;
        }
        System.out.println();

        int maxStringLength = 5;
        int totalNumberOfLines = 2 * maxStringLength - 1;
        int elementReduction = 1;
        int currentStringLength = 1;
        row = 1;
        do {
            int elementCounter = 0;
            do {
                System.out.print("$");
                elementCounter++;
            } while (elementCounter < currentStringLength);
            System.out.println();
            if (elementCounter == maxStringLength) {
                elementReduction = -1;
            }
            currentStringLength += elementReduction;
            row++;
        } while (row <= totalNumberOfLines);

        // ЗАДАНИЕ 7
        System.out.println("\n7. Вывод ASCII-символов\n");
        System.out.printf("%-10s%-13s%-3s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i <= 122; i++) {
            if ((i % 2 != 0) && (i <= 47)) {
                System.out.printf("  %-12d%-14c%-20s%n", i, i, Character.getName(i));
            } else if ((i % 2 == 0) && (i >= 97) && (i <= 122)) {
                System.out.printf("  %-12d%-14c%-20s%n", i, i, Character.getName(i));
            }
        }

        // ЗАДАНИЕ 8
        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        originalNumber = 1234321;
        number = originalNumber;
        remainder = 0;
        reversedInteger = 0;
        while (number != 0) {
            remainder = number % 10;
            number /= 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }
        if (originalNumber == reversedInteger) {
            System.out.println("Число " + originalNumber + " - палиндром");
        } else {
            System.out.println("Число " + originalNumber + " не является палиндромом");
        }

        // ЗАДАНИЕ 9
        System.out.println("\n9. Проверка, является ли число счастливым\n");
        originalNumber = 123321;
        number1 = originalNumber % 1000;
        number2 = originalNumber / 1000;
        int firstHalfOfNumber = number1;
        int secondHalfOfNumber = number2;
        int remainder1 = 0;
        int remainder2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (firstHalfOfNumber != 0 && secondHalfOfNumber != 0) {
            remainder1 = firstHalfOfNumber % 10;
            sum1 += remainder1;
            firstHalfOfNumber /= 10;
            remainder2 = secondHalfOfNumber % 10;
            sum2 += remainder2;
            secondHalfOfNumber /= 10;
        }
        if (sum1 == sum2) {
            System.out.println("Число " + originalNumber + " - счастливое");
        } else {
            System.out.println("Число " + originalNumber + " - несчастливое");
        }
        System.out.println("Сумма цифр " + number1 + " равна " + sum1);
        System.out.println("Сумма цифр " + number2 + " равна " + sum2);

        // ЗАДАНИЕ 10
        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print("_|");
        for (int i = 1; i < 9; i++) {
            System.out.printf("__%1d", i + 1);
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%1d|", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}