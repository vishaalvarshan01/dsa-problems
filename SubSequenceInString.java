package Basics;

import java.util.ArrayList;

public class SubSequenceInString {
    public static ArrayList<String> subseq(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseq(p + ch, up.substring(1));
        ArrayList<String> right = subseq(p, up.substring(1));

        for(String i : right){
            if(!left.contains(i)) left.add(i);
        }
        return left;
    }

    public static void main(String[] args) {
        String str = "122";
        ArrayList<String> ans = subseq("", str);
        System.out.println(ans);
    }
}
