package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*(10000+1));
            System.out.print(array[i]+" ");
        }

        int max = array[0];
        int min = array[0];
        int kol = 0, sum = 0;
        for(int num:array){
            if (num > max) max = num;
            if (num < min) min = num;
            if (num % 10 == 0){
                kol++;
                sum +=num;
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: "+max);
        System.out.println("Минимальный элемент массива: "+min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: "+kol);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: "+sum);
    }
}
