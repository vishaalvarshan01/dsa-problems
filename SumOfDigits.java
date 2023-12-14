package Basics;

public class SumOfDigits {

    public static int recursiveSum(int n){
        if(n <= 1) return 1;
        return recursiveSum(n/10) + n%10;
    }
    
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(n/10);
        int ans = recursiveSum(n);
        System.out.println(ans);
    }
}
