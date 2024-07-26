package by.itacademy.andreiunuchak.geometry;

import java.util.Objects;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height of the rectangle must be greater than 0");
        }
        this.height = height;
    }

    public boolean equals(Rectangle rectangle) {
        if (this == rectangle) return true;
        if (rectangle == null) return false;
        return this.width == rectangle.width && this.height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
