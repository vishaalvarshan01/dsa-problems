package Basics;

public class Patterns {

    public static void pattern1(int row, int col) {
        if (row == 0)
            return;

        if (col < row) {
            pattern1(row, col + 1);
            System.out.print("* ");
        } else {
            pattern1(row - 1, 0);
            System.err.println("");
        }
    }

    public static void main(String[] args) {
        int n = 4;
        pattern1(n, 0);
    }
}
