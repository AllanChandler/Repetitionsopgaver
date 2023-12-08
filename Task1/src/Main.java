import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Square square = new Square(5, 5);
        System.out.println("Area is : " + square.calculateArea());

        Circle circle = new Circle(5);
        System.out.println("Area is : " + circle.calculateArea());

        Shapes shapes = new Shapes();
        shapes.addShape(new Square(5, 5));
        shapes.addShape(new Circle(5));
        System.out.println("Area is : " + shapes.totalArea());

    }
}