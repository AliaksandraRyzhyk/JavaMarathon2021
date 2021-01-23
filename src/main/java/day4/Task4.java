package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*(10000+1));
        }
        System.out.println(Arrays.toString(array));
        int trioMaxSum = 0, index = 0, currentSum = 0;
        for(int i=0; i< array.length-2; i++){
            currentSum = array[i]+array[i+1]+array[i+2];
            if(currentSum>trioMaxSum) {
                trioMaxSum = currentSum;
                index = i;
            }
        }
        System.out.println("Индекс первого элемента из тройки, сумма которых максимальная: "+index);
        System.out.println("Максимальная сумма трех соседних элементов: "+trioMaxSum);



    }
}
