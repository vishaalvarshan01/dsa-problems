package Basics;

public class ArrangeCoins {

    public static int arrangeCoins(int n) {
        int countRows = 0;
        int total = n;
        for (int i = 1; i < n; i++) {
            total -= i;
            if (total <= 0) {
               return countRows;
            }
            countRows++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 2;
        int ans = arrangeCoins(n);
        System.out.println("ans : " + ans);
    }
}
