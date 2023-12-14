package Basics;

public class MatrixDiagnolSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j == (mat.length - 1)) {
                    sum++;
                }
                if (i == j) {
                    sum++;
                }
            }
        }

        return sum;
    }

    public static void main(String args[]){
        int[][] mat = {{1,2,3},
              {4,5,6},
              {7,8,9}};
        
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }
}
