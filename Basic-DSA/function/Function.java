package function;
import java.util.Scanner;

public class Function {
    // Function
    public static int Calculate(int a, int b) { //parameter or formal parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        int sum = Calculate(a, b); //arguments or actual parameters
        System.out.println("Sum is :" + sum);
        sc.close();
    }
}
