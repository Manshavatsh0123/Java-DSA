//Print Nth Fibonacci Number - 0 1 1 2 3 5
// fib(0) = 0
// fib(1) = 1
// fib(n) = fib(n-1) + fib(n-2)

package Recursion;
public class FibonacciNumber {

    public static int fib(int n) {
        if (n == 0 || n == 1) { //base case
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n)); 
    }
}

//Time Complexity: O(2^n) - Exponential time complexity due to the binary tree of calls.
//Space Complexity: O(n) - The maximum depth of the recursion stack.

