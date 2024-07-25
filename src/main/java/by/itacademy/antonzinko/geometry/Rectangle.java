package by.itacademy.antonzinko.geometry;

public class Rectangle {
    double length;
    double width;

    public Rectangle() {
    }

    public static double length(double l1, double l2) {
        return (l1 + l2);
    }

    public static double width(double s, double b) {
        return (s / b);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
