package shape;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateFigureVolume() {
        return (4 * super.piConstant * radius * radius * radius)/3;
    }

    @Override
    public double calculateArea() {
        super.calculateArea();
        return super.piConstant * radius * radius;
    }
}
