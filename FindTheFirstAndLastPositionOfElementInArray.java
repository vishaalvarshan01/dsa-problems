package Basics;

public class FindTheFirstAndLastPositionOfElementInArray {

    public static int searchRange2(int[] nums,int target, boolean searchState){
        int ans = -1;
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
            else {
                ans = mid;
                if(searchState){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return ans;

    }
    
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ;

        int left = nums.length - 1, right = 0;

        int i = 0, j = nums.length - 1;
        while (i < nums.length && j >= 0) {

            // last position
            if (nums[j] == target) {
                right = Math.max(j, right);
                ans[1] = right;
            }

            // first position
            if (nums[i] == target) {
                left = Math.min(i, left);
                ans[0] = left;
            }

            i++;
            j--;
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] arr = { 1};
        int target = 1;
        int ans1 = searchRange2(arr, target, true);
        int ans2 = searchRange2(arr, target, false);
        System.out.println("ans : " + ans1 + " , " + ans2);

    }
}
