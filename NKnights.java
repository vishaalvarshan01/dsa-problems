package Basics;

public class NKnights {

    public static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean i : arr) {
                if (i)
                    System.out.print("♘ ");
                else
                    System.out.print("X ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    public static void solution(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length - 1) {
            return;
        }

        if (col == board.length) {
            solution(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            solution(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        solution(board, row, col + 1, knights);
    }

    public static void main(String[] args) {
        boolean[][] maze = new boolean[4][4];
        solution(maze, 0, 0, 4);
        // System.out.println("number of solutions : " + ans);
    }
}
