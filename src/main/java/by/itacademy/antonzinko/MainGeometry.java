package by.itacademy.antonzinko;

import by.itacademy.antonzinko.geometry.Circle;
import by.itacademy.antonzinko.geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {
        double diameter = 2;
        double a = 2;
        System.out.println("Радиус диаметра равен " + (Circle.radius(diameter, a)));
        double l1 = 1.1;
        double l2 = 2.2;
        System.out.println("Длина прямоугольника равна " + (Rectangle.length(l1, l2)));
        double s = 3;
        double b = 2;
        System.out.println("Ширина прямоугольника равна " + (Rectangle.width(s, b)));
    }
}
