package Practices;

import java.util.*;

public class TwoSum {

    static int[] targetNumber(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };

            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();// array size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = targetNumber(arr, target);
        System.out.println(result[0] + " " + result[1]);

        sc.close();

    }
}
