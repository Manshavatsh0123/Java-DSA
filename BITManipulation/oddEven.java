//Check if a number is Odd or Even.

package BITManipulation;
public class oddEven {
    public static void odd(int n) {
        if ((n & 1) == 0) {
            System.out.println("Even number: " + n);
        } else {
            System.out.println("Odd number: " + n);
        }
    }

    public static void main(String[] args) {
        odd(3);
        odd(2);
    }
}

// Odd number: 3
// Even number: 2
