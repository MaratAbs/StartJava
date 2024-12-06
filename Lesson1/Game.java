import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int randomNumber = 1 + (int) (Math.random() * 99) + 1;
        System.out.println("Введите число в диапазоне от 1 до 100: ");
        while (true) {
            int playerNumber = new Scanner(System.in).nextInt();
            if (playerNumber == randomNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (playerNumber > randomNumber) {
                System.out.print(playerNumber + " больше загаданного. Введите другое число: ");
            } else {
                System.out.print(playerNumber + " меньше загаданного. Введите другое число: ");
            }
        }
    }
}