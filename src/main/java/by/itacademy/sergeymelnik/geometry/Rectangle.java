package by.itacademy.sergeymelnik.geometry;

import java.util.Objects;

public class Rectangle {
    int width;
    int length;

    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        if (width <= 0 || length <= 0){
            throw new IllegalArgumentException("width and length can not be lower or equal zero ");
        }
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0){
            throw new IllegalArgumentException("width can not be lower or equal zero ");
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0){
            throw new IllegalArgumentException("length can not be lower or equal zero ");
        }
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && length == rectangle.length;
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
