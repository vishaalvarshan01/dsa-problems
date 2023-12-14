package Basics;

public class SquareRoot {

    public static int mySqrt(int x){

        int low = 1, high = x ,ans = 0;
        while(low < high){
            int mid = (low + high) / 2;
            if(mid*mid == x) return mid;
            else if(mid*mid > x) high = mid;
            else {
                low = mid + 1;
                ans = mid;
            };
        }
        return ans;
    }
    public static void main(String args[]){
        int x = 8;
        int ans = mySqrt(x);
        System.out.println("ans : " + ans);
    }
}
