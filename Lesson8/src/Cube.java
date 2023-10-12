public class Cube extends ThreeDimensionalShape {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateFigureVolume() {
        return side * side * side;
    }

    @Override
    double calculateArea() {
        super.calculateArea();
        return side * side;
    }
}
