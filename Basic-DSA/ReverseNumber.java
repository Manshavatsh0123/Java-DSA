//Print Reverse of no. {n = 10899} = 99801 - while loop.

import java.util.*;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        while (n > 0) {
            int Digital = n % 10;
            System.out.print(Digital + " ");
            n = n / 10;
        }
        System.out.println();
        sc.close();
    }
}
