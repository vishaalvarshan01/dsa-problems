package Basics;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchUsingRecursion {

    public static int linearSearchUsingRecursion(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        return linearSearchUsingRecursion(arr, target, ++index);
    }

    public static ArrayList<Integer> linearSearchUsingRecursionList(int[] arr, int target, int index,
            ArrayList<Integer> ans) {
        if (index == arr.length)
            return ans;
        if (arr[index] == target)
            ans.add(index);
        return linearSearchUsingRecursionList(arr, target, ++index, ans);
    }

    public static ArrayList<Integer> linearSearchUsingRecursionList2(int[] arr, int target, int index) {
        ArrayList<Integer> result = new ArrayList<>();
        if (index == arr.length)
            return result;
        if (arr[index] == target)
            result.add(index);

        ArrayList<Integer> ansFromBelowCalls = linearSearchUsingRecursionList2(arr, target, ++index);

        result.addAll(ansFromBelowCalls);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 4, 5 };
        // int ans = linearSearchUsingRecursion(arr, 5, 0);
        List<Integer> ans2 = linearSearchUsingRecursionList2(arr, 4, 0);
        System.out.println(ans2);
    }
}
