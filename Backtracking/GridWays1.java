public class GridWays1 {

    public static int countWays(int i, int j, int n, int m) {
        // base case: reached destination
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // boundary condition
        if (i == n || j == m) {
            return 0;
        }

        // recursive calls (right + down)
        return countWays(i + 1, j, n, m) + countWays(i, j + 1, n, m);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countWays(0, 0, n, m));
    }
}

//6
