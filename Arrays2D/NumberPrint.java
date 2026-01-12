//Print the no. of 7's that are in the 2nd array.

package Arrays2D;
public class NumberPrint {
    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Count of 7's is: " + count);
    }
}

// Count of 7's is: 2