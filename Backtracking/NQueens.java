//package Backtracking;

public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // check upper left diagonal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // check upper right diagonal
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return true; // found one solution
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                if (nQueens(board, row + 1)) {
                    return true; // stop at first solution
                }

                board[row][j] = '.';
            }
        }

        return false; // no place found in this row
    }

    public static void main(String[] args) {
        int n = 4; // 2 and 3 have no solution
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
    }
}
// Sample Output for n = 4:


// . Q . . 
// . . . Q 
// Q . . . 
// . . Q . 