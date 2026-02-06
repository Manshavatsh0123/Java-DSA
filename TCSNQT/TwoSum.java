// Q1.Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

package TCSNQT;
import java.util.HashMap;

public class TwoSum {

    public static int[] Solution(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            // If complement exists
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }

            // Store value and index
            map.put(nums[i], i);
        }

        return new int[] { -1, -1 }; 
    }

    public static void main(String args[]) {
        int nums[] = { 3, 2, 4 };
        int target = 6;

        int[] result = Solution(nums, target);

        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
}


// public static int[] sum(int[] nums, int target) {
//     // Iteration
//     for (int i = 0; i < nums.length; i++) {
//         for (int j = i + 1; j < nums.length; j++) {
//             if(nums[i] + nums[j] == target){
//                 return new int[] { i, j };
//             }
//         }
//     }
//     return new int[] { -1, -1 };
// }


//Indexes: 1, 2