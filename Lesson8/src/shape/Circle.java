package shape;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        super.calculateArea();
        return super.piConstant * radius * radius;
    }
}
