//Factorial of a number using recursion

package TimeSpaceComplexity;
public class Factorial {
    public static int fact(int n) {
        if (n == 0) { // base case
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));

    }

}

//Total work done = n X k = O(n) [where k is constant time for multiplication operation]
//Time Complexity = O(n)
//Space Complexity = O(n) [due to recursive call stack]