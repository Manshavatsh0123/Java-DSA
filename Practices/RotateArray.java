package Practices;

import java.util.*;

public class RotateArray {

    static void rotateArray(int arr[], int k) {
        k %= arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length - 1);
    }

    static void reverse(int[] arr, int l, int r) {

        while (l < r) {
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;

            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        rotateArray(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();

    }
}


// 8
// 8
// 1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7 8 

// 8
// 2
// 1 2 3 4 5 6 7 8 
// 7 8 1 2 3 4 5 6 
