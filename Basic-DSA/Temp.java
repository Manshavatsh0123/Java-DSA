// Check if temperature indicates fever
import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        if (temp > 100) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
        sc.close();
    }
}
