package Basics;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();

        for (int element : nums) {
            hMap.put(element, hMap.getOrDefault(element, 0) + 1);
        }

        int maxKey = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                maxKey = key;
                maxFrequency = frequency;
            }
        }

        return maxKey;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
}
