package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing",2020,70,420);
        Airplane airplane1 = new Airplane("Airbus", 2006,50,350);
        Airplane.compareAirplanes(airplane,airplane1);
    }
}