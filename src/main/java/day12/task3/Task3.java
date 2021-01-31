package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Apocalyptica", 1993);
        MusicBand band2 = new MusicBand("Порнофильмы", 2008);
        MusicBand band3 = new MusicBand("Anacondaz", 2009);
        MusicBand band4 = new MusicBand("Linkin Park", 1996);
        MusicBand band5 = new MusicBand("Louna", 2008);
        MusicBand band6 = new MusicBand("Green Day", 1986);
        MusicBand band7 = new MusicBand("Elis", 2003);
        MusicBand band8 = new MusicBand("Depeche Mode", 1980);
        MusicBand band9 = new MusicBand("Weathers", 2015);
        MusicBand band10 = new MusicBand("J:Морс", 1999);

        List<MusicBand> musicBands = new ArrayList<>();
//        musicBands.add(new MusicBand("Apocalyptica", 1993));
//        musicBands.add(new MusicBand("Порнофильмы", 2008));
//        musicBands.add(new MusicBand("Anacondaz", 2009));
//        musicBands.add(new MusicBand("Linkin Park", 1996));
//        musicBands.add(new MusicBand("Louna", 2008));
//        musicBands.add(new MusicBand("Green Day", 1986));
//        musicBands.add(new MusicBand("Elis", 2003));
//        musicBands.add(new MusicBand("Depeche Mode", 1980));
//        musicBands.add(new MusicBand("Weathers", 2015));
//        musicBands.add(new MusicBand("J:Морс", 1999));
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);
        Collections.shuffle(musicBands);
        System.out.println(musicBands.toString());
        groupsAfter2000(musicBands);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
//        for (MusicBand musicBand : musicBands) {
//            if (musicBand.getYear() >= 2000)
//                System.out.println(musicBand);
//        }
//        return musicBands;
        for (int i = musicBands.size() - 1; i >= 0; i--)
            if (musicBands.get(i).getYear() >= 2000)
                System.out.println(musicBands.get(i));
            else
                musicBands.remove(i);
        return musicBands;
    }
}

