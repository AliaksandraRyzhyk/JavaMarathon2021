package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String string = " ";
        for (int i = 0; i < 200001; i++)
            string += i + " ";
        System.out.println(string);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < 200001; i++)
            sb.append(i + " ");//sb.append(i).append(" ");
        System.out.println(sb.toString());
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println(timeConsumedMillis1);
    }
}
