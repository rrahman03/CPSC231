public class Driver {
    public static void main(String[] args) {
        // new game with 3 players
        Game game = new Game(3);

        System.out.println("Starting the game...");

        // play game + get winner
        int winner = game.play();

        System.out.println("Game over! Player " + winner + " is the winner.");

        for (Player player : game.getPlayers()) {
            // print player number and their current hand
            System.out.println("Player " + player.getPlayerNum() + " Hand: " + player.getHand());
        }
    }
}
