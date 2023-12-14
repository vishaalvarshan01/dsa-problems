package Basics;

class ShuffleTheAray {

    public static int[] solution(int nums[], int n){
        int[] ans = new int[nums.length];
        
        for(int i = 0, j = 0; i < n; i++,j+=2){
            ans[j] = nums[i];
            ans[j+1] = nums[i + n];
            
        }

        return ans;
    }

    public static void main(String args[]){
        int arr[] = {2,5,1,3,4,7};
        int n = 3;
        int ans[] = solution(arr, n);
        System.out.println("ans -----");
        for(int i : ans) System.out.print(i + " ");
    }
}