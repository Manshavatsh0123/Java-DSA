//Print Factorial a number n.

package Recursion;
public class FactorialNumber {
    public static int fact(int n) {
        if (n == 0) { //base case
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
