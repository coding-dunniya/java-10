import java.util.Arrays;

/**
 * Programming exercises homework
 * This class implements following methods
 * 1. Find number of occurrences of an element in array
 * 2. Search an element in 3D array
 * 3. Reverse an array
 * 4. Find average value of 2D array
 * 5. Write a program to delete specific element in array
 */
public class Homework {

    // main method - jvm calls this method
    public static void main(String[] args) {
        int[] id = new int[]{1, 2, 45, 67, 89, 89, 89, 99, 5676};
        int[][] iid = new int[][]{{1, 2, 3, 5}, {4, 5, 66, 7}, {6, 7, 8, 99, 34}};
        int[][][] iiid = new int[][][]{{{4, 5, 6}, {3, 33, 44, 55}, {55, 89, 78}},
                {{41, 56, 63}, {3222, 3333, 4445, 55355}},
                {{41, 522, 633}, {132323, 1333, 43424, 542345}, {53435, 8349, 73248}}};

        int no = noOfOccurrences(id, 89);
        System.out.println("No of occurrences of element 89 is ==> " + no);
        int elem = searchIn3DArray(iiid, 1);
        System.out.println("Searched in 3D array ==> " + elem);
        int[] reversed = reverseArray(id);
        System.out.println("Reversed Array ==> " + Arrays.toString(reversed));
        double avg = average2DArray(iid);
        System.out.println("Average of 2D array ==> " + avg);
        int[] deleted = deleteSpecificElement(id, 89);
        System.out.println("Array after deleting 89 ==> " + Arrays.toString(deleted));
    }

    // find number of occurrences of an element in array
    public static int noOfOccurrences(int[] arr, int elem) {
        // in the start no of occurrences is 0
        int o = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                o = o + 1;
            }
        }
        return o;
    }

    // search for an element in 3d array
    public static int searchIn3DArray(int[][][] arr, int elem) {
        // we have 3d array so we need to have 3 loops
        // if element is not found return -1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    if (arr[i][j][k] == elem) {
                        return arr[i][j][k];
                    }
                }
            }
        }
        return -1;
    }

    // reverse an array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        // we need to have reversed array loop counter
        int counter = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[counter] = arr[i];
            // increment counter
            counter++;
        }
        return reversed;
    }

    // find average of a 2d array
    public static double average2DArray(int[][] arr) {
        // first find sum
        int sum = 0,
                total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                total++;
            }
        }
        // we need to take care of divide by 0
        // use automatic type promotion
        double avg = total == 0 ? 0 : (sum * 1.0) / total;
        return avg;
    }

    // delete specific element from an array
    public static int[] deleteSpecificElement(int[] arr, int elem) {
        // first find the number of occurrences of element
        int o = noOfOccurrences(arr, elem);
        // create new array of specified length
        int[] deleted = new int[arr.length - o];
        // keep deleted counter variable
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elem) {
                deleted[counter] = arr[i];
                counter++;
            }
        }
        return deleted;
    }
}
