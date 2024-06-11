/**
 * Video Programming exercises
 * This class implements following methods
 * 1. Search an implement in array
 * 2. Find minimum value in array
 * 3. Find maximum value in array
 * 4. Find average of an array
 */
public class Main {

    // main method - jvm calls this method
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 8, 77, 45, 7777};
        int elem = findValueInArray(arr, 77);
        int min = findMinimumValueInArray(arr);
        int max = findMaximumValueInArray(arr);
        double avg = findAverageArray(arr);

        System.out.println("Search element in array ==> " + elem);
        System.out.println("Minimum element in array ==> " + min);
        System.out.println("Maximum element in array ==> " + max);
        System.out.println("Average of array ==> " + avg);
    }

    // search for a value in array
    // if value is found return value and if not return -1
    private static int findValueInArray(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return arr[i];
            }
        }
        // if not found return -1
        return -1;
    }

    // find minimum value in array
    private static int findMinimumValueInArray(int[] arr) {
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (currentMin > arr[i]) {
                currentMin = arr[i];
            }
        }
        return currentMin;
    }

    // find maximum value in array
    private static int findMaximumValueInArray(int[] arr) {
        int currentMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (currentMax < arr[i]) {
                currentMax = arr[i];
            }
        }
        return currentMax;
    }

    // find average of an array
    private static double findAverageArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum * 1.0 / arr.length;  // automatic type promotion
        return avg;
    }
}