package by.itacademy.olgazaitseva;

import by.itacademy.olgazaitseva.geometry.Circle;
import by.itacademy.olgazaitseva.geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {
        //Circle
        Circle circleOne = new Circle(5.4);
        Circle circleTwo = new Circle(5.6);
        System.out.println("Радиус: " + circleOne.getRadius());
        System.out.println("Длина окружности " + circleOne.calculateCircumference());
        System.out.println("Радиус: " + circleTwo.getRadius());
        System.out.println("Длина окружности " + circleTwo.calculateCircumference());
        System.out.println("Объекты равны: " + circleOne.equals(circleTwo));
        System.out.println(circleOne);
        System.out.println(circleTwo);
        //Rectangle
        Rectangle rectangleOne = new Rectangle(3.4, 5.6);
        Rectangle rectangleTwo = new Rectangle(3.4, 5.6);
        System.out.println("Параметры прямоугольника: " + rectangleOne.getLength()+ " и " + rectangleOne.getWidth());
        System.out.println("Периметр прямоугольника: " + rectangleOne.calculatePerimeter());
        System.out.println("Параметры прямоугольника: " + rectangleTwo.getLength() + " и " + rectangleTwo.getWidth());
        System.out.println("Периметр прямоугольника: " + rectangleTwo.calculatePerimeter());
        System.out.println("Объекты равны: " + rectangleOne.equals(rectangleTwo));
        System.out.println(rectangleOne);
        System.out.println(rectangleTwo);
    }
}
