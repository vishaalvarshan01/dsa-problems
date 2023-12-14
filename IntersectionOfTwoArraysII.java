package Basics;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i : nums1)
            list1.add(i);
        for (int i : nums2)
            list2.add(i);

        if (list1.size() < list2.size()) {
            for (int i : list1) {
                if (list2.contains(i))
                    ans.add(i);
            }
        } else {
             for (int i : list2) {
                if (list1.contains(i))
                    ans.add(i);
            }
        }

        int[] result = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2 };
        int[] ans = intersect(nums1, nums2);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
