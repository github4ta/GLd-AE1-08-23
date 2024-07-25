package by.itacademy.andreiunuchak;

import by.itacademy.andreiunuchak.geometry.Circle;
import by.itacademy.andreiunuchak.geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {

        Circle circle1 = new Circle(12.5);
        Circle circle2 = new Circle();
        System.out.println("Circle2 radius = " + circle2.getRadius());
        circle2.setRadius(7);
        System.out.println("Circle1 and Circle2 are equal: " + circle1.equals(circle2));
        circle2.setRadius(12.5);
        System.out.printf("Circle2 radius became %s, Circle1 and Circle2 are equal: %s\n", circle2.getRadius(), circle1.equals(circle2));
        circle2 = circle1;
        System.out.println("Circle1=Circle2. Circle2 now is " + circle2);
        circle1.setRadius(5);
        System.out.printf("Circle1 radius became %s, but Circle2 radius also became %s\n", circle1.getRadius(), circle2.getRadius());

        System.out.println();

        Rectangle rectangle1 = new Rectangle(4, 4);
        Rectangle rectangle2 = new Rectangle(7,3);
        System.out.println("Rectangle1 is: " + rectangle1);
        System.out.println("Rectangle2 is: " + rectangle2);
        System.out.printf("Rectangle2 width is %s and height is %s\n", rectangle2.getWidth(), rectangle2.getHeight());
        System.out.println("Rectangle1 and Rectangle2 are equal: " + rectangle1.equals(rectangle2));
        rectangle2.setWidth(4);
        rectangle2.setHeight(4);
        System.out.println("Rectangle1 and Rectangle2 are equal: " + rectangle1.equals(rectangle2));
        System.out.println("Rectangle2 hashCode is: " + rectangle2.hashCode());
        Rectangle rectangle3 = new Rectangle(5,0); // throws IllegalArgumentException
    }
}
