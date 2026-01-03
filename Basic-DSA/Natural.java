//Sum of first n Natural no.
import java.util.*;

public class Natural {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        System.out.print("Enter Number :");
        int n = sc.nextInt();
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum :" + sum);
        sc.close();
    }
}
