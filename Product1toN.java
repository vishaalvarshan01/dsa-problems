package Basics;

public class Product1toN {
    public static int printProduct(int n){
        if(n == 1) return 1;
        return printProduct(n-1) * n;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int ans = printProduct(n);
        System.out.println(ans);
    }
}
