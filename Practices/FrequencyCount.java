package Practices;
import java.util.*;

public class FrequencyCount {

    static void frequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        frequency(arr);
        sc.close();
    }
}

// 5
// 1 2 2 3 3
// {1=1, 2=2, 3=2}
