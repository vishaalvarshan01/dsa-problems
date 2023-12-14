package Basics;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public static int[] solution(int[] digits) {
        List<Integer> ans = new ArrayList<>();

        int carry = 1;

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9 && i == n - 1 || digits[i] == 9 && carry == 1) {
                digits[i] = 0;
                carry = 1;
                ans.add(0, digits[i]);
            } else {
                digits[i] += carry;
                carry = 0;
                ans.add(0, digits[i]);
            }
        }

        if (carry == 1)
            ans.add(0, carry);

        int[] result = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 8, 9, 9 };
        int[] ans = solution(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
