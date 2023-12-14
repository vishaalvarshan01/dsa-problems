package Basics;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {
    public static boolean checkRow(int[][] mat, int num, int row, int col){

        int minValue = mat[row][0];

        for(int i = 0; i < mat[0].length; i++){
            minValue = Math.min(minValue, mat[row][i]);
        }

        System.out.println("min value : " + minValue);

        return minValue == num;
    }

    public static boolean checkCol(int[][] mat,int num, int row, int col){

        int maxValue = mat[0][col];

        for(int i = 0; i < mat.length; i++){
            maxValue = Math.max(maxValue, mat[i][col]);
        }
        return maxValue == num;
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(checkRow(matrix,matrix[i][j],i,j) && checkCol(matrix,matrix[i][j],i,j)){
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }

    public static void main(String args[]){
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println("ans : ");
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
