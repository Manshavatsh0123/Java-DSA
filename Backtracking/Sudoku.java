public class Sudoku {

    public static boolean sudokuSolver(int[][] board, int row, int col) {

        // base case
        if (row == 9) {
            return true;
        }

        int nextRow = row, nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != 0) {
            return sudokuSolver(board, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;

                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int num) {

        // column
        for (int i = 0; i <= 8; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // row
        for (int j = 0; j <= 8; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        if (sudokuSolver(board, 0, 0)) {
            System.out.println("Sudoku solved successfully!");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

// 5 3 4 6 7 8 9 1 2
// 6 7 2 1 9 5 3 4 8
// 1 9 8 3 4 2 5 6 7
// 8 5 9 7 6 1 4 2 3
// 4 2 6 8 5 3 7 9 1
// 7 1 3 9 2 4 8 5 6
// 9 6 1 5 3 7 2 8 4
// 2 8 7 4 1 9 6 3 5
// 3 4 5 2 8 6 1 7 9
