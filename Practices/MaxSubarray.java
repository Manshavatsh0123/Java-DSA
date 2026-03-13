package Practices;

import java.util.*;

public class MaxSubarray {
    public static int maxSubarray(int arr[]) {
        int max = arr[0];
        int sum = 0;

        for (int num : arr) {
            sum += num;

            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSubarray(arr));
        sc.close();
    }
}