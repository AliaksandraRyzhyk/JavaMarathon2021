package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
//            System.out.println("Введите 2 числа, используя после каждого Enter");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
//            System.out.println(x + " / " + y + " = " + (x / y));
            System.out.println(x / y);
        }
        sc.close();
    }
}


