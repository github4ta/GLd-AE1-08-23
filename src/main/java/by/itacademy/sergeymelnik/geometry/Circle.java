package by.itacademy.sergeymelnik.geometry;

import java.util.Objects;

public class Circle {
   private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius<=0){
            throw new IllegalArgumentException("Radius can't be lower or equal zero");
        }
        this.radius = radius;
    }

    //@Override
    public boolean equals(Circle o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return (int) Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
