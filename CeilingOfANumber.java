package Basics;

public class CeilingOfANumber {

    public static int solution(int[] arr, int target) {

        int left = 0, right = arr.length;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == target)
                return arr[mid];
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return arr[right];
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 5, 8, 14, 16, 18 };
        int ans = solution(arr, 9);
        System.out.println("ans : " + ans);
    }
}
