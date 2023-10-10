import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int countNegativeIntroducedNumbers = 0;
        int countPositiveIntroducedNumbers = 0;
        int sumOfIntroducedNumbers = 0;

        while (number != 0) {
            number = scanner.nextInt();
            if (number < 0) {
                countNegativeIntroducedNumbers++;
            } else {
                countPositiveIntroducedNumbers++;
            }
            sumOfIntroducedNumbers += number;
        }
        System.out.println("Negative numbers --> " + countNegativeIntroducedNumbers);
        System.out.println("Positive numbers --> " + countPositiveIntroducedNumbers);
        System.out.println("Sum of all introduced numbers --> " + sumOfIntroducedNumbers);
    }
}