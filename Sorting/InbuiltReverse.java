//Collections.sort() : method is used to sort elements in objects from the Java Collections Framework (like ArrayList, LinkedList, etc.)

package Sorting;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltReverse {

    // Print
    public static void printArr(Integer arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}
