package by.itacademy.antonzinko.geometry;

import java.util.Objects;

public class Circle {
    double radius;

    public Circle() {
    }

    public static double radius(double diameter, double a) {
        return (diameter / a);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
