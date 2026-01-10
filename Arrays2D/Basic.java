//2D Array - Multi-dimensional Array
//Representation : n X m .

package Arrays2D;

public class Basic {
    public static void main(String[] args) {

        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Matrix is:
// 1 2 3 
// 4 5 6
// 7 8 9
