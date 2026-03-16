package Practices;

public class Armstrong {
    public static boolean countArmStrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int digit = n% 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        int n = 153;
        if(countArmStrong(n)){
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}


// Input: n = 153
// Output: true
// Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153

// Input: n = 9474
// Output: true
// Explanation: 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474

// Input: n = 123
// Output: false
// Explanation: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36