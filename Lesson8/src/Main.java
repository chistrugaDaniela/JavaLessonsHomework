import shape.*;
import staff.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------Task 1------------------------");
        Person person = new Person("Andrei", "Pelican street");
        Student student = new Student(person.getName(), person.getAddress(), "Master", 1997, 55.6);
        Staff staff = new Staff("Andreea", "Bush 103", "School nr.1", 1555.0);
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
        System.out.println();

        System.out.println("-------------------Task 2------------------------");
        Parallelogram parallelogram = new Parallelogram();
        System.out.println(parallelogram.calculateArea(5));
        System.out.println(parallelogram.calculateArea(5, 6));
        System.out.println(parallelogram.calculatePerimeter(2));
        System.out.println(parallelogram.calculatePerimeter(10, 2));

        System.out.println("-------------------Task 3------------------------");
        Circle circle = new Circle(2.5);
        Sphere sphere = new Sphere(5.5);
        Square square = new Square(5);
        Cube cube = new Cube(8.5);
        System.out.println(circle.calculateArea());
        System.out.println(sphere.calculateArea());
        System.out.println(sphere.calculateFigureVolume());
        System.out.println(square.calculateArea());
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculateFigureVolume());
    }
}