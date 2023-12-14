package Basics;

public class SearchInSortedMatrix {
    public static boolean solution(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target < arr[i][arr[i].length - 1]) {
                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[i][j] == target)
                        return true;
                }
            }
            if (target == arr[i][arr[i].length - 1])
                return true;
        }
        return false;
    }

    public static boolean solution2(int arr[][], int target) {
        int i = 0, j = arr[0].length - 1;

        while (i < arr.length || j >= 0) {
            System.out.println("element : " + arr[i][j]);
            if (arr[i][j] == target)
                return true;
            else if (arr[i][j] < target)
                i++;
            else
                j--;
            if(i < arr.length || j >= 0) return false;
        }

        return false;
    }

    public static void main(String args[]) {
        // int arr[][] = {
        //         { 2, 3, 4, 6 },
        //         { 16, 19, 33, 36 },
        //         { 37, 38, 38, 41 },
        //         { 47, 47, 50, 51 },
        //         { 55, 57, 58, 62 },
        //         { 63, 65, 66, 66 },
        //         { 68, 70, 75, 77 },
        //         { 78, 84, 84, 86 },
        //         { 86, 87, 88, 92 },
        //         { 94, 95, 96, 97 },
        // };

        int arr2[][] = { { 2, 9, 12, 13, 16, 18, 18, 19, 20, 22 }, { 29, 59, 62, 66, 71, 75, 77, 79, 97, 99 } };
        boolean ans = solution2(arr2, 81);
        System.out.println(ans);
    }
}
