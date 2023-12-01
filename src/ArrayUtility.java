public class ArrayUtility {

    public static void print(int[] array) {
        String FinalAnswer = "";
        for (int i = 0; i<array.length; i++){
            FinalAnswer += array[i];
            if (i<array.length-1){
                FinalAnswer += ", ";
            }
        }
        System.out.println(FinalAnswer);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        int averageTimes100 = (int)(sum * 100.0 / array.length);
        return averageTimes100 / 100.0;
    }

    public static int minimum(int[] array) {
        int temporaryMin = array[0];
        for (int i = 1; i<array.length; i++) {
            if (temporaryMin > array[i]){
                temporaryMin = array[i];
            }
        }
        return temporaryMin;
    }

    public static int maximum(int[] array) {
        int temporaryMax = array[0];
        for (int i = 1; i<array.length; i++) {
            if (temporaryMax < array[i]){
                temporaryMax = array[i];
            }
        }
        return temporaryMax;
    }

    public static int evenCount(int[] array) {
        int totalCounts = 0;
        for (int number: array){
            if (number%2 == 0){
                totalCounts+=1;
            }
        }
        return totalCounts;
    }

    public static int[] reverseOne(int[] array) {
        for (int i =0; i<array.length/2; i++){
            int value = array[i];
            array[i] = array [array.length-1-i];
            array [array.length-1-i] = value;
        }
        return array;
    }

    public static void reverseTwo(int[] array) {
        for (int i =0; i<array.length/2; i++){
            int value = array[i];
            array[i] = array [array.length-1-i];
            array [array.length-1-i] = value;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int number: array){
            if (number == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String string: array){
            if (string.equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i<array.length; i++){
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i<array.length; i++){
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String Final = "";
        for (int j : array) {
            Final += String.valueOf(j);
            if (j != array[array.length-1]){
            Final += ", ";
            }
        }
        return Final;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j<array.length-1; j++){
                if (array[i]+array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i< array.length; i++){
            arrayCopy[i] = array[i];
        }
        for (int i = 1; i<array.length; i++){
            array[i] = arrayCopy[i-1];
        }
        for (int i = 0; i<1; i++){
            array[i] = arrayCopy[array.length-1+i];
        }
    }

    public static void shiftLeft(int[] array) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i< array.length; i++){
            arrayCopy[i] = array[i];
        }
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = arrayCopy[i + 1];
        }
        for (int i = array.length - 1; i < array.length; i++) {
            array[i] = arrayCopy[i-array.length+1];
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i< array.length; i++){
            arrayCopy[i] = array[i];
        }
        for (int i = n; i<array.length; i++){
            array[i] = arrayCopy[i-n];
        }
        for (int i = 0; i<n; i++){
            array[i] = arrayCopy[array.length-n+i];
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i< array.length; i++){
            arrayCopy[i] = array[i];
        }
        for (int i = 0; i < array.length - n; i++) {
            array[i] = arrayCopy[i + n];
        }
        for (int i = array.length - n; i < array.length; i++) {
            array[i] = arrayCopy[i-array.length+n];
        }

    }

}
