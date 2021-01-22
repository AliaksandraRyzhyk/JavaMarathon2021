package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество этажей в доме");
        int x = sc.nextInt();

        if (x <= 0){
            System.out.println("Ошибка ввода");
        } else  if(x < 5){
            System.out.println("Малоэтажный дом");
        } else  if (x > 8){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Среднеэтажный дом");
        }
        sc.close();
    }
}
