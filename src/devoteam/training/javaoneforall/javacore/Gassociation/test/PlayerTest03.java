package devoteam.training.javaoneforall.javacore.Gassociation.test;

import devoteam.training.javaoneforall.javacore.Gassociation.domain.Player;
import devoteam.training.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1= new Player("Messi");
        Player player2= new Player("Aguero");
        Team team = new Team("Argentina");
        Player[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("---- Player----");
        player1.print();
        player2.print();
        System.out.println("---- Team----");
        team.print();
    }
}
