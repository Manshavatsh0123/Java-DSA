public class GridWays {
    
    public static int countWays(int n, int m, int i, int j) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }

        int w1 = countWays(n, m, i + 1, j);
        int w2 = countWays(n, m, i, j + 1);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(
                "Number of ways to reach from (0,0) to (" + (n - 1) + "," + (m - 1) + ") is: " + countWays(n, m, 0, 0));
    }
}

//Number of ways to reach from (0,0) to (2,2) is: 6
