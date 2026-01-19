// Print numbers from n to 1 using Recursion.

//Recursion - is a method of solving a computational problem where the solution depends on solution to smaller instances of the same problem.

package Recursion;

public class Number {
    public static void printDec(int n) {
        if (n == 1) {  //base case
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n - 1); 
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}

//Output -
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
