package Practices;

import java.util.*;

public class MajorityElement {

    static int majorityElement(int[] arr) {

        int count = 0, candidate = 0;

        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = majorityElement(arr);
        System.out.println("Majority Element :" + result);

        sc.close();
    }
}

// Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
// Output: 1
// Explanation: Element 1 appears 4 times. Since ⌊7/2⌋ = 3, and 4 > 3, it is the
// majority element.

// Input: arr[] = [7]
// Output: 7
// Explanation: Element 7 appears once. Since ⌊1/2⌋ = 0, and 1 > 0, it is the
// majority element.

// Input: arr[] = [2, 13]
// Output: -1
// Explanation: No element appears more than ⌊2/2⌋ = 1 time, so there is no
// majority element.

// 7
// 1 1 2 1 3 5 1
// Majority Element :1