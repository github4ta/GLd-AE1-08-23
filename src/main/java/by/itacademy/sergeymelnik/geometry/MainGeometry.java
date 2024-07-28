package by.itacademy.sergeymelnik.geometry;

public class MainGeometry {
    public static void main(String[] args) {

        int radius = 20;
        Circle circle = new Circle(radius);
        long circleSquare = (long) (Math.PI*Math.pow(circle.getRadius(), 2));
        Circle circle1 = new Circle(40);
        System.out.println("compare circle and circle121 " + circle.equals(circle1));
        System.out.println("circle circleSquare with radius = " + circle.getRadius() + " equals " + circleSquare );
        circle.setRadius(40);
        long circleSquare2 = (long) (Math.PI*Math.pow(circle.getRadius(), 2));
        System.out.println("circle circleSquare with radius = " + circle.getRadius() + " equals " + circleSquare2);
        System.out.println("compare circle and circle121 " + circle.equals(circle1));
        System.out.println(circle.toString());
        System.out.println(circle1.toString());
//        System.out.println("check neagtive radius ");
//        circle1.setRadius(-2);
        int width = 10;
        int length = 15;
        Rectangle rectangle = new Rectangle(width, length);
        double rectangleSquare = rectangle.getLength()*rectangle.getWidth();
        System.out.println("Check rectangle with negative sides");
//        System.out.println(new Rectangle(-2,5).toString());
//        System.out.println("rectangleSquare = " + rectangleSquare);
        System.out.println(rectangle.toString());
        System.out.println(" rectangle hashCode "  + rectangle.hashCode());


    }
}
