package by.itacademy.geometry;

import java.util.Objects;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean equals(Circle o) {
        if(o == null || getClass() != o.getClass()) return false;
        return this.radius == o.radius;
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
