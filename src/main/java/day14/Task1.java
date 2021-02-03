package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("task1.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] number = line.split(" ");
        if (number.length != 10)
            throw new IllegalArgumentException();
        int[] array = new int[10];
        int index = 0;
        for (String numbers : number) {
            array[index++] = Integer.parseInt(numbers);
        }
//        System.out.println(Arrays.toString(array));
       int sum = 0;
        for (int elements : array) {
            sum += elements;
        }
        System.out.println(sum);
        scanner.close();
        } catch (FileNotFoundException e){
        System.out.println("Файл не найден");
        }catch (IllegalArgumentException e) {
        System.out.println("Некорректный входной файл");
        }
    }
}



