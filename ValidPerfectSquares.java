package Basics;

public class ValidPerfectSquares {

    public static boolean solution(int num){
        
        int left = 1, right = num;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(num / mid == num) return true;
            else if(num / mid > num) right = mid;
            else left = mid + 1;
        }
        return false;
    }
    public static void main(String args[]){
        int num = 808201;
        boolean ans = solution(num);
        System.out.println("ans : " + ans);
    }
}
