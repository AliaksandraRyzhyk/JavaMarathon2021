package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите два числа, используя после каждого Enter");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int i = a + 1; i < b; i++) {
                while (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}


