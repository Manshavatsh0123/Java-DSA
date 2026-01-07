// Array – a list of elements of the same data type stored in a continuous memory location.

package Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create Array
        int marks[] = new int[3];

        // Input Array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        //Output Array
        System.out.println("Physics :" + marks[0]);
        System.out.println("Chemistry :" + marks[1]);
        System.out.println("Maths :" + marks[2]);

        //update Array
        marks[2] = marks[2] + 1;
        System.out.println("Maths Updated marks :" + marks[2]);

        sc.close();
    }
}