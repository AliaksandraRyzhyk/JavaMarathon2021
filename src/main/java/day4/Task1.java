package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] array = new int[n];
        int kol = 0, kol1 = 0, kol2 = 0, kol3 = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10+1));
            if(array[i] > 8) kol++;
            if (array[i] == 1) kol1++;
            if (array[i] % 2 == 0) kol2++;
            else kol3++;
            sum += array[i];
        }
        System.out.println("Сгенерирован следующий массив: "+Arrays.toString(array));
        System.out.println("Длина массива: " + n);
        System.out.println("Количестве чисел больше 8: " + kol );
        System.out.println("Количестве чисел равных 1: " + kol1);
        System.out.println("Количестве четных чисел: " + kol2);
        System.out.println("Количестве нечетных чисел: " + kol3);
        System.out.println("Сумме всех элементов массива: " + sum);
        sc.close();
    }
}

