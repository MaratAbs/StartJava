import java.util.Scanner;

public class GuessNumber {

    private Player p1;
    private Player p2;
    Scanner console = new Scanner(System.in);
    int playerNumber;
    int randomNumber;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        System.out.println("Угадай число от 1 до 100.");
        randomNumber = (int) (1 + Math.random() * 10);
        while (true) {
            compareFirstNumber();
            if (playerNumber == randomNumber) return;
            compareSeconsNumber();
            if (playerNumber == randomNumber) return;
        }
    }

    public void compareFirstNumber() {
        System.out.print(p1.getName() + ", введи предполагаемое число: ");
        playerNumber = console.nextInt();
        if (playerNumber == randomNumber) {
            System.out.println(" Победил(а) " + p1.getName() + "!");
            return;
        }
        if (playerNumber > randomNumber) {
            System.out.println(" Число " + playerNumber + " больше, чем загаданное.");
        } else {
            System.out.println(" Число " + playerNumber + " меньше, чем загаданное.");
        }
    }

    public void compareSeconsNumber() {
        System.out.print(p2.getName() + ", введи предполагаемое число: ");
        playerNumber = console.nextInt();
        if (playerNumber == randomNumber) {
            System.out.println(" Победил(а) " + p2.getName() + "!");
            return;
        }
        if (playerNumber > randomNumber) {
            System.out.println(" Число " + playerNumber + " больше, чем загаданное.");
        } else {
            System.out.println(" Число " + playerNumber + " меньше, чем загаданное.");
        }
    }
}