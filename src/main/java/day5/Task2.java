package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2018, "green","Honda");
        System.out.println("Year: "+motorbike.getYear());
        System.out.println("Color: "+motorbike.getColor());
        System.out.println("Model: "+motorbike.getModel());

    }
    static class Motorbike{
        private final int year;
        private final String color;
        private final String model;

        public Motorbike(int year, String color, String model){
            this.year = year;
            this.color = color;
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }
    }
}
