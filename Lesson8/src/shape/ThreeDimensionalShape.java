package shape;

public abstract class ThreeDimensionalShape extends Shape {
    abstract double calculateFigureVolume();
    @Override
    public double calculateArea() {
        return 0;
    }
}
