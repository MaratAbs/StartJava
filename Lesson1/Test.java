public class Test {
    public static void main(String[] args) {
         System.out.println("Hi, there!\n");

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
    }
}