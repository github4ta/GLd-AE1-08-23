package by.itacademy.andreiunuchak.geometry;

import java.util.Objects;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            throw new IllegalArgumentException("Radius can't be less than 0");
        }
        this.radius = radius;
    }

    public boolean equals(Circle circle) {
        if (this == circle) return true;
        if (circle == null) return false;
        return this.radius == circle.radius;
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
