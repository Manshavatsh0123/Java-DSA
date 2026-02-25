package TCSNQT;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 2, 6, 8, 9, 1 };
        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        // max
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum of number:" + max);

        // Count
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Counting element array:" + count);

        // Buddle sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        // update element
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        System.out.println("Updated array");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}

// int max = arr[0];

// for (int number :arr) {
// if (number > max) {
// max = number;
// }
// }
// System.out.println("Maximum of number:" + max);

// int arr[] = {2,5,6,8,9,1};