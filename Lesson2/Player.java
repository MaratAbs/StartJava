public class Player {
    
    private String name;
    private int playerNumber;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}