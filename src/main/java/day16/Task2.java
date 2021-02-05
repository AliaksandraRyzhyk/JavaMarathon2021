package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

        public class Task2 {
            public static void main(String[] args) throws FileNotFoundException {
                File file1 = new File("file1.txt");
                PrintWriter pw1 = new PrintWriter(file1);
                int[] array = new int[1000];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * (100 + 1));
                }
                pw1.println(Arrays.toString(array));
                pw1.close();

                File file2 = new File("file2.txt");
                PrintWriter pw2 = new PrintWriter(file2);
                List<Double> total = new ArrayList<>();
                int[][] array2 = new int[50][20];
                double average = 0;
                for (int k = 0; k < array2.length; k++) {
                    for (int j = 0; j < array2[k].length; j++) {
                        array2[k][j] = array[20 * k + j];
                        average += array2[k][j];
                    }
                    average /= 20;
                    total.add(average);
                    average = 0;
                }

                pw2.println(total.toString().replaceAll("^\\[|\\]$", ""));
                pw2.close();
                printResult(new File("file2.txt"));
            }

            public static void printResult(File file) throws FileNotFoundException {
                Scanner scanner = new Scanner(new File("file2.txt"));
                String[] number = scanner.nextLine().split(",");
                double[] massive = new double[number.length];
                for(int i = 0; i < number.length; i++) {
                    massive[i] = Double.parseDouble(number[i]);
                }
                double sum = 0;
                for (double elements : massive) {
                    sum += elements;
                }
                int sumFinish = (int) sum;
                System.out.println(sumFinish);
            }
        }




