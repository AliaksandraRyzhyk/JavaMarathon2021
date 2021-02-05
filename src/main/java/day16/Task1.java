package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("task1.txt"));
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] number = line.split(" ");

            int[] array = new int[Integer.parseInt(String.valueOf(number.length))];
            int index = 0;
            for (String numbers : number) {
                array[index++] = Integer.parseInt(numbers);
            }
            double average = 0;
            for (int elements : array) {
                average += elements;
            }
            average /= array.length;
            System.out.print(average + " --> ");
            System.out.printf("%.3f", average);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
