package Basics;

public class Fibonacci {

    public static int factorial(int n){
        if(n < 2) return n;
        return factorial(n-1) + factorial(n-2);
    }
    
    public static void main(String args[]){
        int ans = factorial(4);
        System.out.println(ans);
    }
}
