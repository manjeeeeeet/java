package oops.abstract_class;

public class Main {
    public static void main(String[] args) {

        // Shape shape = new Shape();

        Square square = new Square(5);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(6, 8);

        System.out.println(square.area());
        System.out.println(circle.area());
        System.out.println(triangle.area());
    }
}
