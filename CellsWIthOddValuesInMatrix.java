package Basics;

public class CellsWIthOddValuesInMatrix {
    
    public static int numberOfOdd(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 1)
                    count++;
            }
        }
        return count;
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        
        for (int i = 0; i < indices.length; i++) {

            // row increment
            for (int j = 0; j < arr[0].length; j++) {
                arr[indices[i][0]][j] += 1;
            }
            // column increment
            for(int k = 0; k < arr.length; k++){
                arr[k][indices[i][1]] += 1;
            }
        }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println(" ");
        // }

        return numberOfOdd(arr);
    }

    public static void main(String args[]){
        int m = 2;
        int n = 2;
        int indices[][] = {{1,1},{0,0}};
        int ans = oddCells(m, n, indices);
        System.out.println("ans : " + ans);
    }
}
