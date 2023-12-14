package Basics;

public class FindSmallestLetterGreaterThanTarget {

    public static char solution(char[] letters, char target) {

        int n = letters.length;
        int left = 0, right = n - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(letters[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        // the % purpose here is incase, the the left = length of array, it returns the the first element
        // i.e that is the target element is greater than the last element in the array.
        return letters[left % n];
    }

    public static void main(String args[]) {
        char[] letters = { 'x','x','y','y' };
        char ans = solution(letters, 'z');
        System.out.println("ans : " + ans);

    }
}
