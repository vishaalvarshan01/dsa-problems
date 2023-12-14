package Basics;

import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights){
        int[] temp = Arrays.copyOf(heights,heights.length);
        Arrays.sort(temp);
        int count = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != heights[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int ans = heightChecker(arr);
        System.out.println("ans : " + ans);
    }
}
