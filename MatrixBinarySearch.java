package Basics;

public class MatrixBinarySearch {

    public static int[] binarySearch(int[][] grid,int target){

        int i = 0, j = grid[0].length - 1;

        while(i < grid.length && j >= 0){
            if(grid[i][j] == target) return new int[] {i,j};
            else if(grid[i][j] < target) i++;
            else j--;
        }

        return new int[] {-1,-1};
    }
    public static void main(String args[]){
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 6;
        int[] ans = binarySearch(grid,target);
        for(int i : ans)
            System.out.println("ans : " + i);
    }
}
