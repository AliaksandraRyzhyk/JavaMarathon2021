package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Вера");
        User user2 = new User("Вова");
        User user3 = new User("Витя");
        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Ты тут?");
        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Тут");
        user2.sendMessage(user1, "Что-то случилось?");
        user3.sendMessage(user1, "Привет");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Есть новости?");
        user1.sendMessage(user3, "Привет");
        user1.sendMessage(user3, "Норм");
        user1.sendMessage(user3, "Пока все тихо");
        user3.sendMessage(user1, "Тогда ждем");

        MessageDatabase.showDialog(user1, user3);


    }
}
