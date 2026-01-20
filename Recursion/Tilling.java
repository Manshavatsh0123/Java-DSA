//Given a 2 X n floor and tiles of size 2X1 , count the no. of ways to tiles the given board using the 2X1 tiles.

package Recursion;

public class Tilling {
    public static int tillingWays(int n) { // 2 x n floor
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choice

        int fnm1 = tillingWays(n - 1);

        // horizontal choice

        int fnm2 = tillingWays(n - 2);
        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println("Total ways to tile a 2X3 floor : " + tillingWays(3));
    }
}

// Total ways to tile a 2X3 floor : 3
