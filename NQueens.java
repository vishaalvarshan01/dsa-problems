package Basics;

import java.util.ArrayList;


public class NQueens {

    public static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean i : arr) {
                if (i)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {

        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // check diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    public static int solution(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        // placing the queen and checking for every row and column

        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += solution(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static ArrayList<Boolean> listOfQueens(boolean[][] board, int row) {
        if (row == board.length) {
            ArrayList<Boolean> ans = new ArrayList<>();
            return ans;
        }
       
        // placing the queen and checking for every row and column

        ArrayList<Boolean> list = new ArrayList<>();
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                list.addAll(listOfQueens(board, row + 1));
                board[row][col] = false;
            }
        }
        return list;
    }

    // public static List<List<String>> solveNQueens(int n) {
        
    // }

    public static void main(String[] args) {
        boolean[][] maze = new boolean[4][4];
        int ans = solution(maze, 0);
        System.out.println("number of solutions : " + ans);


    }
}
