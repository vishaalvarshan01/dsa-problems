package Basics;

public class NQueens {

    public static void print(char[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------");
        return;
    }

    public static boolean isSafe(char[][] arr, int row, int col){
        return false;
    }

    public static void solution(char[][] arr,int row, boolean cols[], boolean d1[], boolean d2[]) {

        if(row == arr.length){
            print(arr);
            
        }

        for(int col = 0; col < arr[0].length; col++){
            if(cols[col] == false && d1[row + col] == false && d2[row - col + arr.length - 1] == false){
                cols[col] = true;
                d1[row + col] = true;
                d2[row - col + arr.length - 1] = true;
                arr[row][col] = 'Q';
                solution(arr, row + 1,cols,d1,d2);
                cols[col] = false;
                d1[row + col] = false;
                d2[row - col + arr.length - 1] = false;
                arr[row][col] = '*';
            }
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char[][] arr = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '*';
            }
        }
        solution(arr,0,new boolean[n], new boolean[2 * n - 1], new boolean[2 * n -1]);
    }
}
