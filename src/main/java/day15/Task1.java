package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        parseFileToObjList();
    }

    public static List<Shoes> parseFileToObjList() {
        File file = new File("shoes.csv");
        List<Shoes> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(";");

                Shoes sh = new Shoes(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]));
                list.add(sh);
                if(Integer.parseInt(array[2]) !=0)
                    list.remove(sh);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        File file1 = new File("missing_shoes.txt");
        try {
            PrintWriter pw = new PrintWriter(file1);
            pw.println(list);
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл для записи не найден");
        }
        return list;
    }
}



