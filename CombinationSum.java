package Basics;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void solution(int[] candidates, int target, int start,
            List<Integer> currentCombination, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                currentCombination.add(candidates[i]);
                solution(candidates, target - candidates[i], i, currentCombination, result);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
        return;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        solution(candidates, target, 0, currentCombination, result);
        return result;
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> ans = combinationSum(candidates, target);
        System.out.println(ans);
    }
}
