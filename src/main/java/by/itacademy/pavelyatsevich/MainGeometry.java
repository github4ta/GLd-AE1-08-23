package by.itacademy.pavelyatsevich;

import by.itacademy.pavelyatsevich.geometry.Circle;
import by.itacademy.pavelyatsevich.geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {
        Circle circle1 = new Circle(13);
        Circle circle2 = new Circle(12);

        System.out.println(circle1.hashCode());
        System.out.println(circle2.hashCode());
        System.out.println(circle1.hashCode() == circle2.hashCode());
        circle1.setRadius(12);
        System.out.println(circle1.hashCode());

//        System.out.println(circle1.equals(circle2));
//        circle1.setRadius(12);
//        System.out.println(circle1.equals(circle2));
//        circle2.setRadius(15);
//        System.out.println(circle1 + ", " + circle2);
//
//        Rectangle rectangle1 = new Rectangle(3,7);
//        Rectangle rectangle2 = new Rectangle(2,6);
//
//        System.out.println(rectangle1.equals(rectangle2));
//        rectangle1.setLength(2);
//        rectangle1.setWidth(6);
//        System.out.println(rectangle1.equals(rectangle2));
//        rectangle2.setLength(5);
//        rectangle2.setWidth(7);
//        System.out.println(rectangle1 + ", " + rectangle2);
    }
}
