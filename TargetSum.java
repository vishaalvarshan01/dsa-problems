package Basics;


public class TargetSum {

    public static int solution(int[] nums, int index,int target,int sum) {
        if(index == nums.length){
            if(sum == target) return 1;
            else return 0;
        }

        int left = solution(nums, index+1, target, sum + nums[index]);
        int right = solution(nums, index+1, target, sum - nums[index]);

        return left + right;
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int ans = solution(nums, 0, target, 0);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1 };
        int target = 1;
        int ans = findTargetSumWays(arr, target);
        System.out.println("ans : " + ans);
    }
}
