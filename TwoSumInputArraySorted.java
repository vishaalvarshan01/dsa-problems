package Basics;

public class TwoSumInputArraySorted {
    public static int sumOfArray(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(mid < right && nums[mid] + nums[mid + 1] == target) return new int[] {mid,mid +1};

            else if(mid > left && nums[mid] + nums[mid - 1] == target) return new int[] {mid - 1,mid};
            
        }

        return new int[] {-1, -1};
    }

    public static int[] solution(int[] arr,int target){

        int left = 0, right = arr.length - 1;

        while(left <= right){

            int sum = arr[left] + arr[right];
            if(sum == target) return new int[] {left+1,right+1};
            if(sum > target) right--;
            else left++;
        }

        return new int[] {-1,-1};
    }

    public static void main(String args[]){
        int[] arr = { -1, 0};
        int target = -1;
        int[] solution  = solution(arr, target);
        for(int i : solution)
            System.out.print(i + " ");

    }
}
