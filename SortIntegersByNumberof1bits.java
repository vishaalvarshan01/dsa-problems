package Basics;

public class SortIntegersByNumberof1bits {

    public static int checkNumberOf1s(int i) {
        int numberOf1s = 0;
        String binaryFormat = "";
        while (i > 0) {
            binaryFormat = i % 2 + binaryFormat;
            if (i % 2 == 1)
                numberOf1s++;
            i = i / 2;
        }
        // System.out.println(numberOf1s);
        return numberOf1s;
    }

    public static int[] sortByBits(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = checkNumberOf1s(arr[i]);
        }

        for (int i = 0; i < ans.length - 1; i++) {
            for (int j = i + 1; j < ans.length; j++) {
                if (ans[j] < ans[i] || ans[j] == ans[i] && arr[i] > arr[j]) {
                    
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } 
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1111,7644,1107,6978,8742,1,7403,7694,9193,4401,377,8641,5311,624,3554,6631 };
        int[] ans = sortByBits(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
