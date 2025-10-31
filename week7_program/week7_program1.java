// week7_program1.java
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    double area() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    double area() { return length * width; }
}

public class week7_program1 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}
