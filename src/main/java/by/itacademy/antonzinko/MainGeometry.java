package by.itacademy.antonzinko;

import by.itacademy.antonzinko.geometry.Circle;
import by.itacademy.antonzinko.geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle();
        c2.setRadius(1);
        boolean isEquals = c1.equals(c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(isEquals);
        Rectangle r1 = new Rectangle(1, 2.2);
        Rectangle r2 = new Rectangle();
        r2.setLength(1);
        r2.setWidth(2.2);
        boolean isEquals2 = r1.equals(r2);
        System.out.println(isEquals2);
    }
}
