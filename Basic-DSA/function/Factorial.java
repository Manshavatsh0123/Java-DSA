//Factorial of a number

package function;
import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.print("Factorial :" + fact);
        sc.close();
    }
}
