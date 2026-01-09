//Inbuilt sort : O(nlogn)
//Inbuilt sort: method is used to sort arrays in Java. 
// It is a static method in the java.util.Arrays class and uses a highly optimized Timsort algorithm for efficiency. 

package Sorting;
import java.util.Arrays;

public class Inbuilt {
    // Print
    public static void printArr(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr);
        printArr(arr);
    }
}
