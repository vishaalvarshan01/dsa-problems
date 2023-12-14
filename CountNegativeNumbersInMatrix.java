package Basics;

public class CountNegativeNumbersInMatrix {

    public static int countNegatives(int[][] grid) {
        int count = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (grid[row][col] < 0) {
                count += rows - row;
                col--;
            }else{
                row++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        int ans = countNegatives(grid);
        System.out.println("ans : " + ans);
    }
}
