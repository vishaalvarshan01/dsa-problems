package Basics;

public class DeterminIfMatrixCanBeObtained {

    public static int[][] rotateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = mat[j][ans.length - i - 1];
            }
        }

        return ans;
    }

    public static boolean checkIfMatricesAreSame(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        for(int i = 0; i < 4; i++){
            mat = rotateMatrix(mat);
            if(checkIfMatricesAreSame(mat, target) == true){
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        


        System.out.println("");
        boolean ans = findRotation(mat, target);

        System.out.println("target");

        for (int[] i : target) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("ans : " + ans);
    }
}
