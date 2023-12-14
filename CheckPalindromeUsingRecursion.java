package Basics;

public class CheckPalindromeUsingRecursion {

    public static int reverseANumber(int n) {
        if (n <= 1)
            return 1;
        return ((int) Math.pow(10, Integer.toString(n).length() - 1) * (n % 10)) + reverseANumber(n / 10);
    }
    
    public static boolean checkPalindrome(int n){
        if(n == reverseANumber(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 1121;
        boolean ans = checkPalindrome(n);
        System.out.println(ans);
    }
}
