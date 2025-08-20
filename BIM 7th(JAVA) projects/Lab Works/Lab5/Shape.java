
package Lab5;


public abstract class Shape {
    // Abstract method that must be implemented by subclasses
    public abstract double calculateArea();
    
    // Concrete method
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
    
    // Concrete subclass Circle
    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Concrete subclass Rectangle
    public static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Shape.Circle circle = new Shape.Circle(5.0);
        Shape.Rectangle rectangle = new Shape.Rectangle(4.0, 6.0);

        // Calling the displayArea method on objects of concrete subclasses
        circle.displayArea();
        rectangle.displayArea();
    }
}

