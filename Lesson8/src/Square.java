public class Square extends TwoDimensionalShape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        super.calculateArea();
        return side * side;
    }
}
