package Basics;

public class NumberCallingUsingRecursion{

    public static void print(int n, int target){
        if(n == target) return;
        System.out.println(n);
        print(n+1, target);
    }

    public static void returnNumber(int n){
        print(1,n);

    }
    public static void main(String args[]){
        int n = 6;
        returnNumber(n);
    }
}
