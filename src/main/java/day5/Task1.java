package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car = new Car();
    car.setYear(1958);
    car.setColor("red");
    car.setModel("Ferrari");
    System.out.println("Year: " + car.getYear());
    System.out.println("Color: " + car.getColor());
    System.out.println("Model: " + car.getModel());
    }
}
