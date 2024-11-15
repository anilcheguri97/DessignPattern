public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Game game = new Game();
        game.initializeGame();
        System.out.println("game winner is "+game.startgame());
    }
}