package Basics;

import java.util.ArrayList;

public class SubSets {

    public static ArrayList<ArrayList<Integer>> solution(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

        outer.add(new ArrayList<>());
        
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> ans = solution(arr);
        System.out.println(ans);
    }
}
