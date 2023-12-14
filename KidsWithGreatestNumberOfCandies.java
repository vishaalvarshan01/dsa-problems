package Basics;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> solution(int[] candies, int extraCandies){
        List<Boolean> ans = new ArrayList<>();

        int maxValue = candies[0];

        for(int i : candies)
            maxValue = Integer.max(i, maxValue);
        
        System.out.println(maxValue);
        
        return ans;
    }

    public static void main(String args[]){
        int[] arr = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> ans = solution(arr, extra);
        System.out.println(ans);
    }
}