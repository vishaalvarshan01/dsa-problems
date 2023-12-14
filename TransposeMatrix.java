package Basics;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        int[][] ans = new int[matrix[0].length][matrix.length];

        // for(int[] i : ans){
        //     for(int x : i){
        //         System.out.print(x + " ");
        //     }
        //     System.out.println("");
        // }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }

    public static void main(String args[]){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] ans = transpose(matrix);

        for(int[] i : ans){
            for(int x : i){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
