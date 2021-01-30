package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (50 + 1));
                System.out.print(array[i][j] + " ");
                if (j == 0) array1[i] = array[i][j];
                else array1[i] += array[i][j];
            }
            System.out.println();
        }
        int indexMax = 0;
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= max) {
                max = array1[i];
                indexMax = i;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + indexMax);
    }
}
