package Practices;

public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
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