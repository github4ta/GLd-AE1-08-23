package by.itacademy.pavelyatsevich;

import by.itacademy.pavelyatsevich.geometry.Circle;
import by.itacademy.pavelyatsevich.geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {
        Circle circle1 = new Circle(13);
        Circle circle2 = new Circle(12);

        System.out.println(circle1.equals(circle2));
        circle1.setRadius(12);
        System.out.println(circle1.equals(circle2));
        circle2.setRadius(15);

        System.out.println();

        System.out.println(circle1.hashCode());
        System.out.println(circle2.hashCode());
        System.out.println(circle1.hashCode() == circle2.hashCode());
        circle1.setRadius(15);
        System.out.println(circle1.hashCode());
        System.out.println(circle1.hashCode() == circle2.hashCode());
        circle2.setRadius(12);
        System.out.println(circle2.hashCode());
        System.out.println(circle1 + ", " + circle2);

        System.out.println();

        Rectangle rectangle1 = new Rectangle(3,7);
        Rectangle rectangle2 = new Rectangle(2,6);

        System.out.println(rectangle1.equals(rectangle2));
        rectangle1.setLength(2);
        rectangle1.setWidth(6);
        System.out.println(rectangle1.equals(rectangle2));
        rectangle2.setLength(5);
        rectangle2.setWidth(7);

        System.out.println();

        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());
        System.out.println(rectangle1.getLength() == rectangle2.hashCode());
        rectangle2.setLength(2);
        rectangle2.setWidth(6);
        System.out.println(rectangle2.hashCode());
        System.out.println(rectangle1.hashCode() == rectangle2.hashCode());
        rectangle1.setLength(77);
        rectangle1.setWidth(66);

        System.out.println(rectangle1 + ", " + rectangle2);
    }
}
