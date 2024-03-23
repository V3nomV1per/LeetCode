import java.util.HashSet;

public class q36 {

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<String>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!seen.add(board[i][j] + " found in row " + i) ||
                            !seen.add(board[i][j] + " found in column  " + j) ||
                            !seen.add(board[i][j] + " found in sub-box " + i / 3 + ", " + j / 3))
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test case 1: Valid Sudoku
        char[][] board = {
                { '3', '1', '6', '5', '7', '8', '4', '9', '2' },
                { '5', '2', '9', '1', '3', '4', '7', '8', '6' },
                { '4', '8', '7', '6', '2', '9', '5', '3', '1' },
                { '8', '5', '2', '9', '4', '6', '1', '7', '3' },
                { '6', '9', '1', '3', '8', '7', '2', '5', '4' },
                { '7', '4', '3', '2', '5', '1', '6', '8', '9' },
                { '2', '7', '4', '8', '1', '3', '9', '6', '5' },
                { '1', '3', '8', '7', '6', '5', '2', '4', '9' },
                { '9', '6', '5', '4', '2', '1', '8', '3', '7' }
        };
        System.out.println("Test case 1: " + isValidSudoku(board));

        // Test case 2: Invalid Sudoku (duplicate in row)
        board = new char[][] {
                { '3', '1', '6', '5', '7', '8', '4', '9', '2' },
                { '5', '2', '9', '1', '3', '4', '7', '8', '6' },
                { '4', '8', '7', '6', '2', '9', '5', '3', '1' },
                { '8', '5', '2', '9', '4', '6', '1', '7', '3' }, // Duplicate 4 in row 3
                { '6', '9', '1', '3', '8', '7', '2', '5', '4' },
                { '7', '4', '3', '2', '5', '1', '6', '8', '9' },
                { '2', '7', '4', '8', '1', '3', '9', '6', '5' },
                { '1', '3', '8', '7', '6', '5', '2', '4', '9' },
                { '9', '6', '5', '4', '2', '1', '8', '3', '7' }
        };
        System.out.println("Test case 2: " + isValidSudoku(board));

    }
}
