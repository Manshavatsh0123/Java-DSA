//Write a program of swapping the rows and column.For a 2 X 3 matrix

package Arrays2D;
public class Swapping {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 7},
                {5, 6, 7}
        };

        int row = matrix.length;
        int column = matrix[0].length;

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTranspose Matrix:");
        printMatrix(transpose);
    }
}

// Original Matrix:
// 1 3 7 
// 5 6 7

// Transpose Matrix:
// 1 5
// 3 6
// 7 7

