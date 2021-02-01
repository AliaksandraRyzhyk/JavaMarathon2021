package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Игнатова Наталья");
        members1.add("Иванов Игорь");
        members1.add("Петров Иван");
        members1.add("Васин Вася");
        members1.add("Егорова Светлана");

        MusicBand band1 = new MusicBand("J:Морс", 1999, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Сергеев Федор");
        members2.add("Гордеев Алексей");
        members2.add("Юдина Юлия");
        members2.add("Вжик Виктор");
        members2.add("Федоров Федор");

        MusicBand band2 = new MusicBand("Порнофильмы", 2008, members2);

       band1.printMembers();
       band2.printMembers();
       MusicBand.transferMembers(band1,band2);
       band1.printMembers();
       band2.printMembers();
    }
}
