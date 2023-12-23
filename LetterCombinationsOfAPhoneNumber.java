package Basics;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public static void solution(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // convert '2' -> 2
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            solution(p + ch, up.substring(1));
        }
    }

    public static List<String> solution2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0) - '0';

        if (digit != 7 && digit != 9) {
            ArrayList<String> arrayList = new ArrayList<>();
            --digit;
            System.out.println("not 7 or 9 condition");

            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                arrayList.addAll(solution2(p + ch, up.substring(1)));
            }
            return arrayList;
        }if(digit == 7){
            ArrayList<String> arrayList = new ArrayList<>();

            System.out.println("7 condition");

            for (int i = 15; i < 19; i++) {
                // if(i >= 26) break;
                char ch = (char) ('a' + i);
                arrayList.addAll(solution2(p + ch, up.substring(1)));
            }
            return arrayList;
        }else{
            ArrayList<String> arrayList = new ArrayList<>();

            System.out.println("9 condition");

            for (int i = 22; i < 26; i++) {
                if(i >= 26) break;
                char ch = (char) ('a' + i);
                arrayList.addAll(solution2(p + ch, up.substring(1)));
            }
            return arrayList;
        }

    }

    public static List<String> letterCombinations(String digits) {

        if (digits.equals("")) {
            ArrayList<String> ans2 = new ArrayList<>();
            return ans2;
        }
        List<String> ans = solution2("", digits);
        return ans;
    }

    public static void main(String[] args) {
        String str = "8";
        // solution("", str);
        List<String> ans = letterCombinations(str);
        System.out.println(ans);
    }
}
