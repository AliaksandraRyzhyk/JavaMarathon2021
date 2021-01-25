package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing",2020,70,442);
        airplane.info();
        Airplane airplane1 = new Airplane("Boing", 2009, 60, 320);
        changeYearAndLength(airplane1);
        airplane1.fillUp(20);
        airplane1.fillUp(50);
        airplane1.info();
    }
    static void changeYearAndLength(Airplane airplane1){
        airplane1.setYear(2006);
        airplane1.setLength(50);
    }
}
