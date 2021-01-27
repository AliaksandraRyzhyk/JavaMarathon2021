package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int rd = random.nextInt(10+1)+90;
        Player player1 = new Player(rd);
        Player player2 = new Player(rd);
        Player player3 = new Player(rd);
        Player player4 = new Player(rd);
        Player player5 = new Player(rd);
        Player player6 = new Player(rd);
        Player.info();
        Player player7 = new Player(rd);
        Player.info();
        System.out.println(Player.getCountPlayers());
        for(int i = rd; i > 0; i--)
            player1.run();
        System.out.println(player1.getStamina());
        System.out.println(Player.getCountPlayers());
        Player.info();
    }
}
