package Practices;

import java.util.*;

public class MovesZero {

    static void movesZero(int[] arr) {
        int i = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        movesZero(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: [1, 2, 4, 3, 5, 0, 0, 0]
// Explanation: There are three 0s that are moved to the end.

// Input: arr[] = [10, 20, 30]
// Output: [10, 20, 30]
// Explanation: No change in array as there are no 0s.

// Input: arr[] = [0, 0]
// Output: [0, 0]
// Explanation: No change in array as there are all 0s.

// 8
// 1 2 0 4 3 0 5 0
// 1 2 4 3 5 0 0 0 