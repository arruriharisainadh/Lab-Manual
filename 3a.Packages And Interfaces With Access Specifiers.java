interface Shape {
    void area();
}

class Circle implements Shape {
    double radius = 5.0;

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle implements Shape {
    double length = 4.0;
    double width = 6.0;

    public void area() {
        double area = length * width;
        System.out.println("\nRectangle:");
        System.out.println("Length = " + length + ", Width = " + width);
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle implements Shape {
    double base = 3.0;
    double height = 8.0;

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("\nTriangle:");
        System.out.println("Base = " + base + ", Height = " + height);
        System.out.println("Area of Triangle = " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Shape Area Calculator -----\n");

        Shape c = new Circle();
        Shape r = new Rectangle();
        Shape t = new Triangle();

        c.area();
        r.area();
        t.area();
    }
}
