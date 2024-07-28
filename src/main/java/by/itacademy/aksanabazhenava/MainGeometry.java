package by.itacademy.aksanabazhenava;

import by.itacademy.aksanabazhenava.geometry.Circle;
import by.itacademy.aksanabazhenava.geometry.Rectangle;

public class MainGeometry {
    public static void main(String[] args) {
        //ОКРУЖНОСТЬ
        Circle circle1 = new Circle();
        double radius = 59.8;
        System.out.println("Длинна первой окружности составляет " + Circle.circleLength(radius));

        Circle circle2 = new Circle(8.6);
        Circle circle3 = new Circle(9.2);
        System.out.println("Радиус второй окружности = " + circle2.getRadius());
        System.out.println("Радиус третьей окружности = " + circle3.getRadius());
        System.out.println("Если сравнить вторую и третью окружности, то их радиусы равны (или нет): " + circle2.equals(circle3) + "\n");

        //ПРЯМОУГОЛЬНИК
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Площадь первого прямоугольника равна " + Rectangle.rectangleSquare(58, 17));
        Rectangle rectangle2 = new Rectangle();
        System.out.println("Площадь второго прямоугольника равна " + Rectangle.rectangleSquare(11, 25));
        System.out.println("Если сравнить первый и второй прямоугольники, то они равны (или нет): " + rectangle1.equals(rectangle2));

        Rectangle rectangle3 = new Rectangle(8, 7);
        System.out.println("Длинна и высота третьего прямоугольника = " + rectangle3.getLength() + " и " + rectangle3.getWidth());
    }
}
