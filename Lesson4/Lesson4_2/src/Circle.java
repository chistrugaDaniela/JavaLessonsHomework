public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double circleArea = 3.14 * radius * radius;
        return circleArea;
    }
}
