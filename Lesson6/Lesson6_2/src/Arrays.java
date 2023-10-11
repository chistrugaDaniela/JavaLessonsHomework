public class Arrays {
    private int sumOfOddNumbers = 0;
    private double averageOfOddNumbers;
    private int sumOfEvenNumbers = 0;
    private double averageOfEvenNumbers;
    private int countOddNumbers = 0;
    private int countEvenNumbers = 0;

    public void calculateSumAndAverageOfUnidimensionalArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumOfEvenNumbers += array[i];
                countEvenNumbers++;

            } else {
                sumOfOddNumbers += array[i];
                countOddNumbers++;
            }
        }
        System.out.println("Sum of Even Elements --> " + sumOfEvenNumbers);
        System.out.println("Sum of Odd Elements --> " + sumOfOddNumbers);
        averageOfOddNumbers = sumOfOddNumbers / countOddNumbers;
        averageOfEvenNumbers = sumOfEvenNumbers / countEvenNumbers;
        System.out.println("Average of Even Elements --> " + averageOfEvenNumbers);
        System.out.println("Average of Odd Elements --> " + averageOfOddNumbers);
    }

    public void calculateSumAndAverageOfBidimensionalArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sumOfEvenNumbers += array[i][j];
                    countEvenNumbers++;

                } else {
                    sumOfOddNumbers += array[i][j];
                    countOddNumbers++;
                }
            }
        }
        System.out.println("Sum of Even Elements --> " + sumOfEvenNumbers);
        System.out.println("Sum of Odd Elements --> " + sumOfOddNumbers);
        averageOfOddNumbers = sumOfOddNumbers / countOddNumbers;
        averageOfEvenNumbers = sumOfEvenNumbers / countEvenNumbers;
        System.out.println("Average of Even Elements --> " + averageOfEvenNumbers);
        System.out.println("Average of Odd Elements --> " + averageOfOddNumbers);
    }
}
