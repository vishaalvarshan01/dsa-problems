package Basics;

public class IsPowerOfThree {
    
    public static boolean isPowerOfThree(int n){
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        if (n % 3 >= 1)
            return false;
        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        boolean ans = isPowerOfThree(45);
        System.out.println(ans);
    }
}
