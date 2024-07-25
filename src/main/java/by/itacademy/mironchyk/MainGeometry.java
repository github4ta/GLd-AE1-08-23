package by.itacademy.mironchyk;

import geometry.Circle;
import geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {
        // Работа с классом Circle
        Circle circle = new Circle(5.0);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle circumference: " + circle.calculateCircumference());

        circle.setRadius(10.0);
        System.out.println("Updated circle radius: " + circle.getRadius());
        System.out.println("Updated circle area: " + circle.calculateArea());
        System.out.println("Updated circle circumference: " + circle.calculateCircumference());

        // Работа с классом Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        rectangle.setLength(8.0);
        rectangle.setWidth(12.0);
        System.out.println("Updated rectangle length: " + rectangle.getLength());
        System.out.println("Updated rectangle width: " + rectangle.getWidth());
        System.out.println("Updated rectangle area: " + rectangle.calculateArea());
        System.out.println("Updated rectangle perimeter: " + rectangle.calculatePerimeter());
    }
}
