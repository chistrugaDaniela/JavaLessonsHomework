public class ArrayToBeCopied {
    public String[] copyAnArrayToAnotherArray(String array[]){
        String copiedArray[] = new  String[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }
}
