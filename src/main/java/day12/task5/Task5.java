package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Игнатова Наталья",36));
        members1.add(new MusicArtist("Иванов Игорь",68));
        members1.add(new MusicArtist("Петров Иван",30));
        members1.add(new MusicArtist("Васин Вася",26));
        members1.add(new MusicArtist("Егорова Светлана",23));

        MusicBand band1 = new MusicBand("J:Морс",1999, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Сергеев Федор",54));
        members2.add(new MusicArtist("Гордеев Алексей",35));
        members2.add(new MusicArtist("Юдина Юлия",29));
        members2.add(new MusicArtist("Вжик Виктор",41));
        members2.add(new MusicArtist("Федоров Федор",34));

        MusicBand band2 = new MusicBand("Порнофильмы",2008, members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();

    }
}
