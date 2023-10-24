package shape;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateFigureVolume() {
        return side * side * side;
    }

    @Override
    public double calculateArea() {
        super.calculateArea();
        return side * side;
    }
}
