package by.itacademy.aksanabazhenava.geometry;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public static double circleLength(double radius) {
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

