package TCSNQT;

public class GCD {
    public static int commonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int gcd = commonDivisor(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}