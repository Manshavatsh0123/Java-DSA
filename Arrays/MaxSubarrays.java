//Max Subarrays Sum - Kadane’s Algorithm

package Arrays;

public class MaxSubarrays {

    // public static void printSubarraySum(int numbers[]) {
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];

    //     // Calculate prefix array
    //     prefix[0] = numbers[0];
    //     for (int i = 1; i < prefix.length; i++) {
    //         prefix[i] = prefix[i - 1] + numbers[i];
    //     }

    //     // Find max subarray sum
    //     for (int i = 0; i < numbers.length; i++) {
    //         for (int j = i; j < numbers.length; j++) {

    //             int currSum;
    //             if (i == 0) {
    //                 currSum = prefix[j];
    //             } else {
    //                 currSum = prefix[j] - prefix[i - 1];
    //             }

    //             if (currSum > maxSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }

    //     System.out.println("Max Sum = " + maxSum);
    // }

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Subarrays Sum is :" + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // printSubarraySum(numbers);
        kadanes(numbers);
    }
}


