//Imp

package TimeSpaceComplexity;
public class NestedLoop2 {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;

        // outer loop
        // k < n - constant

        for (int i = 0; i <= n; i = i + k) {
            for (int j = 0; j <= n; j++) {
                // some constant work
                // is done in this Loop
            }
        }
    }
}

//Time Complexity: O(n)

