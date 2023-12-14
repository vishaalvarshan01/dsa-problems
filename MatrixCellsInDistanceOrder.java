package Basics;

public class MatrixCellsInDistanceOrder {

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows * cols][2];

        int k = 0;
        int l = 0;
        int[] distanceArray = new int[rows * cols];

        for (int i = 0; i < rows; i++) {
            int distance = 0;
            for (int j = 0; j < cols; j++) {
                distance = Math.abs(rCenter - i) + Math.abs(cCenter - j);
                // System.out.println(i + " " + j + " : " + distance);
                // System.out.println(distance + " ");
                ans[k] = new int[] { i, j };
                distanceArray[l] = distance;
                k++;
                l++;
            }
        }

        for (int i : distanceArray)
            System.out.print(i + " ");

        System.out.println("sorted");

        for (int i = 0; i < distanceArray.length - 1; i++) {
            for (int j = i + 1; j < distanceArray.length; j++) {
                if (distanceArray[i] > distanceArray[j]) {
                    int temp = distanceArray[i];
                    distanceArray[i] = distanceArray[j];
                    distanceArray[j] = temp;

                    int[] temp2 = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp2;
                }

            }
        }

        System.out.println();

        for (int i : distanceArray)
            System.out.print(i + " ");

        return ans;
    }

    public static void main(String args[]) {
        int[][] ans = allCellsDistOrder(2, 3, 1, 2);
        System.out.println(" ---- ans ----");
        for (int i = 0; i < ans.length; i++) {
            System.out.print("[");
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
