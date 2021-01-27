package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            this.stamina = stamina - 1;
            if (stamina == MIN_STAMINA)
                countPlayers--;
        }
    }

    public static void info() {
        int i = 6 - countPlayers;
        if (countPlayers < 6) {
            switch (i) {
                case 0:
                case 5:
                    System.out.println("Команды неполные. На поле еще есть " + i + " свободных мест");
                    break;
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + i + " свободное место");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Команды неполные. На поле еще есть " + i + " свободных места");
                    break;
            }
        } else System.out.println("На поле нет свободных мест");
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
