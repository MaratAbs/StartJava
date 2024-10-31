public class IfElseStatementTheme {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1
        System.out.println("1. Перевод псевдокода на язык Java\n");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Мужской пол");
        } else {
            System.out.println("Женский пол");
        }

        int age = 22;
        if (age >= 18) {
            System.out.println("Гражданин считается совершеннолетним.");
        } else {
            System.out.println("Гражданин считается несовершеннолетним.");
        }

        double growthOfTheRecruit = 1.75;
        if (growthOfTheRecruit < 1.80) {
            System.out.println("Призывник может служить в танковых войсках.");
        } else {
            System.out.println("Призывник может служить в иных войсках.");
        }

        String name1 = "Max";
        String name2 = "Ilona";
        String name3 = "Alex";
        char firstLetterName = "Max".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Третья группа практикантов.");
        } else if (firstLetterName == 'I') {
            System.out.println("Вторая группа практикантов.");
        } else {
            System.out.println("Первая группа практикантов.");
        }

        // ЗАДАНИЕ 2
        System.out.println("\n2. Поиск большего числа\n");
        int num1 = 200;
        int num2 = 100;
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }

        // ЗАДАНИЕ 3
        System.out.println("\n3. Проверка числа\n");
        int number = -4;
        if (number == 0) {
            System.out.println("Переменная инициализирована нулём.");
        } else if (number % 2 == 0) {
            if (number < 0) {
                System.out.println(number + " является отрицательным и чётным");
            } else {
                System.out.println(number + " является положительным и чётным");
            }
        } else if (number > 0) {
            System.out.println(number + " является положительным и нечётным");
        } else {
            System.out.println(number + " является отрицательным и нечётным");
        }

        // ЗАДАНИЕ 4
        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int firstNum = 123;
        int secondNum = 223;
        int firstDigitOfFirstNum = firstNum / 100;
        int secondDigitOfFirstNum = firstNum % 100 / 10;
        int thirdDigitOfFirstNum = firstNum % 10;
        int firstDigitOfSecondNum = secondNum / 100;
        int secondDigitOfSecondNum = secondNum % 100 / 10;
        int thirdDigitOfSecondNum = secondNum % 10;
        boolean isEqualNumbers = ((firstDigitOfFirstNum == firstDigitOfSecondNum) ||
                (secondDigitOfFirstNum == secondDigitOfSecondNum) ||
                (thirdDigitOfFirstNum == thirdDigitOfSecondNum));
        if (isEqualNumbers) {
            System.out.println("Есть совпадения цифр в разрядах чисел.");
            if (firstNum == secondNum) {
                System.out.println(firstNum + " == " + secondNum);
            } else if (firstNum < secondNum) {
                System.out.println(firstNum + " < " + secondNum);
            } else {
                System.out.println(firstNum + " > " + secondNum);
            }
            System.out.println("Одинаковые цифры в разрядах чисел: ");
            if (thirdDigitOfFirstNum == thirdDigitOfSecondNum) {
                System.out.println(thirdDigitOfFirstNum + " - разряд единиц");
            }
            if (secondDigitOfFirstNum == secondDigitOfSecondNum) {
                System.out.println(secondDigitOfFirstNum + " - разряд десятков");
            }
            if (firstDigitOfFirstNum == firstDigitOfSecondNum) {
                System.out.println(firstDigitOfFirstNum + " - разряд сотен");
            }
        } else {
            System.out.println("Ни одна цифра в разрядах чисел " + firstNum + " и " + secondNum +
                    " не совпадает");
        }

        // ЗАДАНИЕ 5
        System.out.println("\n5. Определение символа по его коду\n");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - строчная буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - прописная буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - цифра");
        } else {
            System.out.println(symbol + " - ни буква и ни цифра");
        }

        // ЗАДАНИЕ 6
        System.out.println("\n6. Подсчет начисленных банком %\n");
        double amountOfDeposite = 321123.59;
        double amountOfInterest = 0;
        double interestRate = 0;
        int interestPeriod = 365;
        int numberOfCalenderDays = 365;
        if (amountOfDeposite < 100000) {
            interestRate = 5;
            amountOfInterest = (amountOfDeposite * interestRate * interestPeriod / 
                numberOfCalenderDays) / 100;
        } else if (amountOfDeposite >= 100000 && amountOfDeposite <= 300000) {
            interestRate = 7;
            amountOfInterest = (amountOfDeposite * interestRate * interestPeriod / 
                numberOfCalenderDays) / 100;
        } else {
            interestRate = 10;
            amountOfInterest = (amountOfDeposite * interestRate * interestPeriod / 
                numberOfCalenderDays) / 100;
        }
        System.out.printf("Сумма вклада: %.2f руб.\n" + 
                "Сумма начисленных процентов за год: %.2f руб.\n" +
                "Сумма вклада в конце срока: %.2f руб.\n", 
                amountOfDeposite, amountOfInterest, amountOfDeposite + amountOfInterest);

        // ЗАДАНИЕ 7
        System.out.println("\n7. Определение оценки по предметам\n");
        double historyPercentScore = 59;
        double csPercentScore = 92;
        int historyGrade = 0;
        int csGrade = 0;
        if (historyPercentScore <= 60) {
            historyGrade = 2;
        } else if (historyPercentScore > 60 && historyPercentScore <= 73) {
            historyGrade = 3;
        } else if (historyPercentScore > 73 && historyPercentScore <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        if (csPercentScore <= 60) {
            csGrade = 2;
        } else if (csPercentScore > 60 && csPercentScore <= 73) {
            csGrade = 3;
        } else if (csPercentScore > 73 && csPercentScore <= 91) {
            csGrade = 4;
        } else {
            csGrade = 5;
        }
        System.out.println("История - " + historyGrade);
        System.out.println("Программирование - " + csGrade);
        System.out.println("Средний балл оценок по предмету: " + (historyGrade + csGrade) / 2F);
        System.out.println("Средний процент баллов: " + 
                      (historyPercentScore + csPercentScore) / 2F);

        // ЗАДАНИЕ 8
        System.out.println("\n8. Расчет годовой прибыли\n");
        double monthlySales = 13025.233;
        double monthlyRent = 5123.018;
        double monthlyProductionCosts = 9001.729;
        int numberOfMonths = 12;
        double annualProfit = (monthlySales - monthlyRent - monthlyProductionCosts) * 
                numberOfMonths;
        if (annualProfit < 0) {
            System.out.printf("Прибыль за год: %.2f%n", annualProfit);
        } else if (annualProfit > 0) {
            System.out.printf("Прибыль за год: %+.2f%n", annualProfit);
        } else {
            System.out.printf("Прибыль за год: %.2f%n", annualProfit);
        }
    }
}