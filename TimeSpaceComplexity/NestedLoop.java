package TimeSpaceComplexity;

public class NestedLoop {
    public static void main(String[] args) {
        int n = 10;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //Inner loop
            for (int j = i + 1; j <= n; j++) {
                // some constant work
                // is done in this Loop
            }
        }

        // Time Complexity: O(n)
    }
}

//Time Complexity : Total Work done analysis
// Outer loop runs 'n' times
// Inner loop runs 'n-i' times for each iteration of outer loop