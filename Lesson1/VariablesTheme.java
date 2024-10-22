public class VariablesTheme {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1
        System.out.println("1. Вывод характеристик компьютера в консоль.\n");
        byte numberOfCore = 4;
        short ram = 16;
        int ramClockFrequency = 8400;
        long cost = 100_000;
        float frequencyProcessor = 3.5F;
        double weightMonitor = 3.7;
        boolean isIlluminate = true;
        System.out.println("Количество ядер в процессоре: " + numberOfCore);
        System.out.println("Объём оперативной памяти: " + ram + " ГБ");
        System.out.println("Тактовая частота оперативной памяти:" + ramClockFrequency + " МГц");
        System.out.println("Стоимость ПК в руб.: " + cost);
        System.out.println("Частота процессора: " + frequencyProcessor + " ГГц");
        System.out.println("Вес монитора в кг.: " + weightMonitor);
        System.out.println("Подсветка клавиатуры: " + isIlluminate + "\n");

        // ЗАДАНИЕ 2
        System.out.println("2. Расчёт стоимости товара со скидкой.\n");
        double penPrice = 105.5;
        double bookPrice = 235.83;
        double percent = 0.11;

        // Стоимость без скидки
        double totalCost = (penPrice + bookPrice);

        // Сумма скидки
        double discount = (totalCost * percent);

        // Стоимость со скидкой
        double discountedCost = (totalCost - discount);
        System.out.printf("Стоимость товара без скидки: %.2f руб.%n", totalCost);
        System.out.printf("Сумма скидки: %.2f руб.%n", discount);
        System.out.printf("Стоимость товара со скидкой: %.2f руб.%n%n", discountedCost);

        // ЗАДАНИЕ 3
        System.out.println("3. Вывод слова JAVA.\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ a       a V a       a\n");

        // ЗАДАНИЕ 4
        System.out.println("4. Вывод min и max значений целых числовых типов\n");
        byte byteType = 127;
        short shortType = 32_767;
        int intType = 2_147_483_647;
        long longType = 9_223_372_036_854_775_807L;
        System.out.println("Максимальное значение типа byte: " + byteType + "\n" +
                "Инкрементирование значения типа byte: " + (++byteType) + "\n" +
                "Декрементирование значения типа byte: " + (--byteType));
        System.out.println("Максимальное значение типа short: " + shortType + "\n" +
                "Инкрементирование значения типа short: " + (++shortType) + "\n" +
                "Декрементирование значения типа short: " + (--shortType));
        System.out.println("Максимальное значение типа int: " + intType + "\n" +
                "Инкрементирование значения типа int: " + (++intType) + "\n" +
                "Декрементирование значения типа int: " + (--intType));
        System.out.println("Максимальное значение типа long: " + longType + "\n" +
                "Инкрементирование значения типа long: " + (++longType) + "\n" +
                "Декрементирование значения типа long: " + (--longType + "\n"));

        // ЗАДАНИЕ 5
        System.out.println("5. Перестановка значений переменных.\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения:\nnum1 = " + num1 + "\nnum2 = " + num2 + "\n");

        // способ 1
        System.out.println("Перестановка с помощью третьей переменной.");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\n");

        // способ 2
        System.out.println("Перестановка с помощью арифметических операций.");
        num2 += num1;
        num1 = num2 - num1;
        num2 -= num1;
        System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\n");

        // способ 3
        System.out.println("Перестановка с помощью побитовой операции.");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\n");

        // ЗАДАНИЕ 6
        char dollarSymbol = '$';
        byte code36 = (byte) (dollarSymbol);

        // Символ "звёздочка"
        char asterix = '*';
        byte code42 = (byte) (asterix);

        // Символ "собака"
        char commercialAt = '@';
        byte code64 = (byte) (commercialAt);

        // Вертикальная линия
        char verticalLine = '|';
        byte code124 = (byte) (verticalLine);

        // Символ "тильда"
        char tilde = '~';
        byte code126 = (byte) (tilde);
        System.out.println((code36) + "    " + dollarSymbol);
        System.out.println((code42) + "    " + asterix);
        System.out.println((code64) + "    " + commercialAt);
        System.out.println((code124) + "   " + verticalLine);
        System.out.println((code126) + "   " + tilde + "\n");

        // 7. Вывод в консоль ASCII-арт Дюка
        char symbol1 = '/';
        char symbol2 = '\\';
        char symbol3 = '_';
        char symbol4 = '(';
        char symbol5 = ')';
        System.out.println("    " + symbol1 + symbol2);
        System.out.println("   " + symbol1 + "  " + symbol2);
        System.out.println("  " + symbol1 + symbol3 + symbol4 + " " + symbol5 + symbol2);
        System.out.println(" " + symbol1 + "      " + symbol2);
        System.out.println("" + symbol1 + symbol3 + symbol3 + symbol3 + symbol3 + symbol1 +
                symbol2 + symbol3 + symbol3 + symbol2 + "\n");

        // 8. Манипуляции с сотнями, десятками и единицами числа
        int num = 123;
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int units = num % 10;
        System.out.printf("Число 123 содержит: %n  сотен -%2d%n  десятков -%2d%n  единиц -%2d%n",
                 hundreds, tens, units);
        System.out.println("Сумма разрядов = " + (hundreds + tens + units));
        System.out.println("Произведение разрядов = " + (hundreds * tens * units + "\n"));

        // 9. Перевод секунд в часы, минуты и секунды
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}