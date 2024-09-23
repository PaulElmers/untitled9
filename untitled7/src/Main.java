abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 4.0);
        Shape rectangle = new Rectangle("Blue", 3.0, 6.0);
        Shape triangle = new Triangle("Green", 2.0, 4.0);

        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
        System.out.println("Площа трикутника: " + triangle.calculateArea());
    }
}
