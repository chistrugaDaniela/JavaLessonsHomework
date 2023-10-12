public class Circle extends TwoDimensionalShape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        super.calculateArea();
        return super.piConstant * radius * radius;
    }
}
