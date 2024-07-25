package by.itacademy.andreiunuchak;

import by.itacademy.andreiunuchak.geometry.Circle;
import by.itacademy.andreiunuchak.geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 4);
        Rectangle rectangle2 = new Rectangle();
        System.out.println("Rectangle1 is: " + rectangle1);
        System.out.println("Rectangle2 is: " + rectangle2);
        rectangle2.setWidth(7);
        rectangle2.setHeight(3);
        System.out.printf("Rectangle2 width is %s and height is %s\n", rectangle2.getWidth(), rectangle2.getHeight());
        System.out.println("Rectangle1 and Rectangle2 are equal: " + rectangle1.equals(rectangle2));
        System.out.println("Rectangle2 hashCode is: " + rectangle2.hashCode());

        System.out.println();

        Circle circle1 = new Circle(12.5);
        System.out.println("Circle1 radius = " + circle1.getRadius());
        Circle circle2 = new Circle(12.5);
        System.out.println("Circle1 and Circle2 are equal: " + circle1.equals(circle2));
        circle2.setRadius(7.6);
        System.out.printf("Circle1 radius became %s, Circle1 and Circle2 are equal: %s\n", circle2.getRadius(), circle1.equals(circle2));
        circle2 = circle1;
        System.out.println("Circle1=Circle2. Circle2 now is " + circle2);
        circle1.setRadius(5);
        System.out.printf("Circle1 radius became %s, but circle2 radius also became %s\n", circle1.getRadius(), circle2.getRadius());
        Circle circle3 = new Circle(0); // throws IllegalArgumentException
    }
}
