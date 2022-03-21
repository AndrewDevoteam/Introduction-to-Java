package devoteam.training.javaoneforall.javacore.Gassociation.test;

import devoteam.training.javaoneforall.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {

        Player player1 = new Player("Pele");
        Player player2 = new Player("Messi");
        Player player3 = new Player("Ronaldo");
        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.print();
        }

    }
}
