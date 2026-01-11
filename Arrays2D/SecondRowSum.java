//Print out the sum of the number in the second row of the "matrix" array

package Arrays2D;
public class SecondRowSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 7 },
                { 11, 6, 3 },
                { 2, 2, 3 }
        };
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        System.out.println("Sum :" + sum);
    }
}

//Sum :20
