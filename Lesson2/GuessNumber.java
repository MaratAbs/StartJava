import java.util.Scanner;

public class GuessNumber {

    Player p1;
    Player p2;

    GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    Scanner console = new Scanner(System.in);

    public void startGame() {
        System.out.println("Угадай число от 1 до 100.");
        int randomNumber = (int) (1 + Math.random() * 100);
        int playerNumber = 0;
        while (true) {
            System.out.print(p1.getName() + ", введи предполагаемое число: ");
            playerNumber = console.nextInt();
            if (playerNumber < randomNumber) {
                System.out.println(" Число " + playerNumber + " меньше, чем загаданное.");
            } else if (playerNumber > randomNumber) {
                System.out.println(" Число " + playerNumber + " больше, чем загаданное.");
            } else {
                System.out.println(" Победил(а) " + p1.getName() + "!");
                break;
            }

            System.out.print(p2.getName() + ", введи предполагаемое число: ");
            playerNumber = console.nextInt();
            if (playerNumber < randomNumber) {
                System.out.println(" Число " + playerNumber + " меньше, чем загаданное.");
            } else if (playerNumber > randomNumber) {
                System.out.println(" Число " + playerNumber + " больше, чем загаданное.");
            } else {
                System.out.println(" Победил(а) " + p2.getName() + "!");
                break;
            }
        }
    }
 }