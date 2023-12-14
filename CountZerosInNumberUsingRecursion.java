package Basics;

public class CountZerosInNumberUsingRecursion {

    public static int countZeroes(int n, int count) {
        if (n <= 0)
            return count;
        if (n % 10 == 0)
            count += 1;
        return countZeroes(n / 10, count);
    }

    public static void main(String[] args) {
        int n = 10101;
        int ans = countZeroes(n, 0);
        System.out.println(ans);
    }
}
