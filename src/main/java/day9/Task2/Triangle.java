package day9.Task2;

public class Triangle extends Figure {
    int length1;
    int length2;
    int length3;

    public Triangle(int length1, int length2, int length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double poluPerimeter = perimeter() / 2;
        return (Math.sqrt(poluPerimeter * ((poluPerimeter - length1) * (poluPerimeter - length2) * (poluPerimeter - length3))));
    }

    @Override
    public double perimeter() {
        return (length1 + length2 + length3);
    }
}
