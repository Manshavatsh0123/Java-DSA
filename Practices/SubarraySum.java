package Practices;

import java.util.*;

public class SubarraySum {

    static int subarraySum(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0, count = 0;

        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = subarraySum(arr, k);
        System.out.println(result);

        sc.close();
    }
}

// n = 5
// arr = [1 1 1 2 1]
// k = 2

// [1,1]
// [1,1]
// [2]

// 3