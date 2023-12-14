package Basics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int rem = target - numbers[i];
            hMap.put(rem, i);
            if (hMap.containsKey(numbers[i])) {
                System.out.println("0 : " + hMap.get(numbers[i]));
                System.out.println("1 : " + i);
                result[0] = hMap.get(numbers[i]) + 1;
                result[1] = i + 1;
            }
            System.out.println(hMap);
        }
        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 0, 0 ,3 , 4 };
        int[] ans = twoSum(arr, 0);
        for (int i : ans)
            System.out.println(i);
    }
}
