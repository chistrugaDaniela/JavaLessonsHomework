public class Main {
    public static void main(String[] args) {
        Arrays unidimesionalArrays = new Arrays();
        Arrays bidimesionalArrays = new Arrays();
        int unidimensionlArray[] = new int[] {1,2,3,4,5,6,7,8};
        int bidimensionalArray[][] = new int[][] {{1,2,3,4},{1,2,3,4}};
        System.out.println("Unidimensional Array:");
        unidimesionalArrays.calculateSumAndAverageOfUnidimensionalArray(unidimensionlArray);
        System.out.println("\nBidimensional Array:");
        bidimesionalArrays.calculateSumAndAverageOfBidimensionalArray(bidimensionalArray);
    }
}