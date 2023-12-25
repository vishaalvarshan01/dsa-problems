package Basics;

import java.util.Arrays;

public class SudokuSolver {

    public static void display(char[][] board) {
        for (char[] arr : board) {
            for (char i : arr) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static boolean isSafe(char[][] board, int row, int col, int num) {
        char target = (char) (num + '0');
        // check row
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == target) {
                return false;
            }
        }

        // check col
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == target) {
                return false;
            }
        }

        // check 3X3 grid
        int startRow = 3 * (row / 3);
        int startCol = 3 * (col / 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == target) {
                    return false;
                }
            }
        }

        return true;
    }

    public static char[][] solution(char[][] board, int row, int col) {
        if (row == board.length - 1 && col == board.length) {
            display(board);
            return board;
        }

        if (col == board.length) {
            // Assign the result of the recursive call back to the board variable
            return solution(board, row + 1, 0);
            
        }

        if (board[row][col] != '.') {
            // Move to the next column if the current cell is pre-filled
            return solution(board, row, col + 1);
        }

        for (int i = 1; i <= 9; i++) {
            char target = (char) (i + '0');
            if (isSafe(board, row, col, i)) {
                board[row][col] = target;
                // Assign the result of the recursive call back to the board variable
                char[][] result = solution(board, row, col + 1);

                // If a solution is found, return the result
                if (result != null) {
                    return result;
                }
                board[row][col] = '.';
            }
        }
        return null;
    }

    public static void main(String[] args) {
        char[][] sudoku = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        char[][] ans = solution(sudoku, 0, 0);
        
        for (char[] i : ans) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
