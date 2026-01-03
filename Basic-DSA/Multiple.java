//Keep entering number till users enter a multiple of 10 - do while loop.
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break; // to exist the loop.
            }
            System.out.println(n);
        } while (true);
        sc.close();
    }
}
