//Print x^n using recursion.

package Recursion;

public class Power {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half = power(x, n / 2);
        int halfpower = half * half;
        if (n % 2 != 0) {
            halfpower = x * halfpower;
        }
        return halfpower;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
