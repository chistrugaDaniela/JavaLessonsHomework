public class Main {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1; i <= 97; i++) {
            if (i % 2 != 0) {
                sum += i / (i + 2);
            }

        }
        System.out.println("Series sum is: " + sum);
    }
}