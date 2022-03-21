package devoteam.training.javaoneforall.javacore.Gassociation.test;

import devoteam.training.javaoneforall.javacore.Gassociation.domain.Player;
import devoteam.training.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Team team1 = new Team("Brazils National Team");
        player1.setTeam(team1);
        player1.print();
    }
}
