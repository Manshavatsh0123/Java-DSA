//Find Product of a & b 
package function;
import java.util.Scanner;

public class Product {
    public static void product(int a, int b) {
        int multi = a * b;
        System.out.println("Products of a and b :" + multi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter a :");
        int b = sc.nextInt();
        product(a, b);
        sc.close();
    }
}
