package Basics;

/*
 * Given a sodoku solve the solve it .
 * Conditions need to be followed : 
 * Each row must have a only numbers 1 - 9 without repeation.
 * Each column must have a only numbers 1 - 9 without repeation.
 * Each 3x3 grid must have a only numbers 1 - 9 without repeation. 
 */
public class SodukoSolver {

    public static boolean canWePlace(char[][] arr, int x, int y, int val) {

        for (int i = 0; i < arr[0].length; i++) {
            if (arr[x][i] == (char) (val + '0')) {
                return false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][y] == (char) (val + '0')) {
                return false;
            }
        }

        x = x - (x % 3);
        y = y - (y % 3);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(arr[i + x][j + y] == (char)(val + '0')){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solution(char[][] arr, int x, int y) {

        // base condition
        if(x == arr.length) return true;

        int nx = y == 8 ? x + 1 : x;
        int ny = y == 8 ? 0 : y + 1;

        if (arr[x][y] == '.') {
            for (int val = 1; val <= 9; val++) {
                if (canWePlace(arr, x, y, val) == true) {
                    arr[x][y] = (char) (val + '0');
                    if(solution(arr, nx, ny)) return true;
                    arr[x][y] = '.';
                }
            }
        } else {
            if (solution(arr, nx, ny)) {
                return true;
            }
        }

        return false;
    }

    public static void solveSodoku(char arr[][]) {
        if (solution(arr, 0, 0)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        char arr[][] = {
                { '3', '.', '6', '5', '.', '8', '4', '.', '.' },
                { '5', '2', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '8', '7', '.', '.', '.', '.', '3', '1' },
                { '.', '.', '3', '.', '1', '.', '.', '8', '.' },
                { '9', '.', '.', '8', '6', '3', '.', '.', '5' },
                { '.', '5', '.', '.', '9', '.', '6', '.', '.' },
                { '1', '3', '.', '.', '.', '.', '2', '5', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '7', '4' },
                { '.', '.', '5', '2', '.', '6', '3', '.', '.' }
        };
        solveSodoku(arr);
    }
}
