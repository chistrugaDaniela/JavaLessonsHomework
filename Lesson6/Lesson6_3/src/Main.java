public class Main {
    public static void main(String[] args) {
        ArrayToBeCopied arrayToBeCopied = new ArrayToBeCopied();
        String array[] = new String[]{"A", "B", "C", "D", "1", "2", "3", "4"};

        for (int k = 0; k < arrayToBeCopied.copyAnArrayToAnotherArray(array).length; k++) {
            System.out.print(arrayToBeCopied.copyAnArrayToAnotherArray(array)[k] + " ");
        }
    }
}