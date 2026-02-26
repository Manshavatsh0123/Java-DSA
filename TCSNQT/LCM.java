package TCSNQT;

public class LCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int Smallest = lcm(a, b);
        System.out.println("Smallest number:" + Smallest);
    }
}