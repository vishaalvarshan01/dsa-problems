package Basics;

public class ReverseANumberUsingRecursion {

    public static int reverseANumber(int n){
        if(n <= 1) return 1;
        return ((int)Math.pow(10, Integer.toString(n).length()-1)*(n%10)) + reverseANumber(n/10);
    }
    
    public static void main(String[] args) {
        int n = 123456789;
        // System.out.println(1234%10);
        int ans = reverseANumber(n);
        System.out.println(ans);
    }
}
