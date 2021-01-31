package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            list.add(i);
        }
        for (int i = 300; i < 351; i++){
            list.add(i);
        }
        for (Integer integer : list) {
            if (integer % 2 == 0)
                System.out.print(integer + " ");
        }
    }
}
