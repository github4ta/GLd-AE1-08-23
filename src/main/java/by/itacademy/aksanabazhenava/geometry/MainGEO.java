package by.itacademy.aksanabazhenava.geometry;

public class MainGEO {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        double radius = 59.8;
        System.out.println("Длинна первой окружности соствляет " + Circle.circleLength(radius));

        Circle circle2 = new Circle(8.6);
        Circle circle3 = new Circle(9.2);
        System.out.println("Радиус второй окружности составляет " + circle2.getRadius());
        System.out.println("Радиус третьей окружности составляет " + circle3.getRadius());
        System.out.println("Если сравнить вторую и третью окружности, то их радиусы равны (или нет): " + circle2.equals(circle3));
    }
}
