package Basics;

public class FairCandySwap {

    public static boolean checkEqual(int[] arr1, int[] arr2) {

        int sum1 = 0, sum2 = 0;

        for (int i : arr1)
            sum1 += i;
        for (int i : arr2)
            sum2 += i;

        return sum1 == sum2;
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans = { -1, -1 };

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                int temp = aliceSizes[i];
                aliceSizes[i] = bobSizes[j];
                bobSizes[j] = temp;

                if (checkEqual(aliceSizes, bobSizes))
                    return new int[] { bobSizes[j],aliceSizes[i]};
                else{
                     temp = aliceSizes[i];
                aliceSizes[i] = bobSizes[j];
                bobSizes[j] = temp;
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] aliceSizes = { 2 };
        int[] bobSizes = { 1, 3 };
        int[] ans = fairCandySwap(aliceSizes, bobSizes);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
