package shape;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        super.calculateArea();
        return side * side;
    }
}
