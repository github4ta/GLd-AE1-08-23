package by.itacademy.andreiunuchak.geometry;

import java.util.Objects;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width of the rectangle must be greater than 0");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length of the rectangle must be greater than 0");
        }
        this.length = length;
    }

    public boolean equals(Rectangle rectangle) {
        if (this == rectangle) return true;
        if (rectangle == null) return false;
        return this.width == rectangle.width && this.length == rectangle.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
