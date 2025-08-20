
package Factory;
// Client class using the Factory Method pattern
public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Create a Circle using CircleFactory
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        // Create a Square using SquareFactory
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();
    }
}
