// Print numbers from 0 to n-1 -while loop
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int n = sc.nextInt();

        while (counter < n) {
            System.out.println("Number: " + counter);
            counter++;
        }
        sc.close();
    }
}
