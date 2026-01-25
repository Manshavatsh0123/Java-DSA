//package Backtracking;

class WordSearch {

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, String word, int i, int j, int idx) {
        // base case: full word matched
        if (idx == word.length())
            return true;

        // boundary & mismatch check
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
            board[i][j] != word.charAt(idx))
            return false;

        char temp = board[i][j];
        board[i][j] = '#'; // mark visited

        boolean found =
            dfs(board, word, i + 1, j, idx + 1) ||
            dfs(board, word, i - 1, j, idx + 1) ||
            dfs(board, word, i, j + 1, idx + 1) ||
            dfs(board, word, i, j - 1, idx + 1);

        board[i][j] = temp; // unmark

        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "ABCCED";
        System.out.println(exist(board, word)); // true
    }
}
