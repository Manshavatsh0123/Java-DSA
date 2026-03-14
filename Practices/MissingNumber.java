package Practices;
import java.util.*;

public class MissingNumber {
    static int missingNumber(int[] arr){
        int n = arr.length +1;
        int sum = n*(n+1)/2;

        int arrSum =0;

        for(int num:arr){
            arrSum += num;
        }

        return sum-arrSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
          arr[i] = sc.nextInt();
        }

        System.out.println(missingNumber(arr));

        sc.close();
    }
}

// Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
// Output: 6
// Explanation: All the numbers from 1 to 8 are present except 6.

// Input: arr[] = [1, 2, 3, 5]
// Output: 4
// Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4

// 7
// 8 2 4 5 3 7 1
// 6

