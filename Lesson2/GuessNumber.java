import java.util.Scanner;

public class GuessNumber {

    private Player p1;
    private Player p2;
    private int randomNumber;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        randomNumber = (int) (1 + Math.random() * 5);
        System.out.println("Угадай число от 1 до 100.");
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print(p1.getName() + ", введи предполагаемое число: ");
            int number = console.nextInt();
            p1.setPlayerNumber(number);
            boolean isEqualNumber = compareNumber(p1.getPlayerNumber());
            if (isEqualNumber) break;

            System.out.println(p1.getName() + ", введи предполагаемое число: ");
            number = console.nextInt();
            p2.setPlayerNumber(number);
            isEqualNumber = compareNumber(p2.getPlayerNumber());
            if (isEqualNumber) break;
        }
    }

    private boolean compareNumber(int playerNumber) {
        if (playerNumber == randomNumber) {
            System.out.println(" Ты победил(а)!");
            return true;
        }
        if (playerNumber > randomNumber) {
            System.out.println(" Число " + playerNumber + " больше, чем загаданное.");
            return false;
        } else {
            System.out.println(" Число " + playerNumber + " меньше, чем загаданное.");
            return false;
        }
    }
}