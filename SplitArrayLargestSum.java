package Basics;

public class SplitArrayLargestSum {

    public static int findSumOfArray(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static int maximumInArray(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }
    
    public static int solution(int[] arr,int k){

        int left = maximumInArray(arr);

        int right = findSumOfArray(arr);

        int maximumSum = 0;

        while(left < right){
            maximumSum = (left + right) / 2;

            int sum = 0;
            int pieces = 1;
            for(int i = 0; i < arr.length; i++){
                if(sum + arr[i] > maximumSum){
                    sum = arr[i];
                    pieces++;
                }else{
                    sum += arr[i];
                }
            }

            if(pieces <= k) right = maximumSum;
            else left = maximumSum + 1;
            System.out.println(pieces); 
            
        }
        
        return right;
    }
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5};
        int k = 2;
        int ans = solution(arr,k);
        System.out.println("ans : " + ans);

    }
}
