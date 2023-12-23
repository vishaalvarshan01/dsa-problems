package Basics;

import java.util.ArrayList;

public class SubSequenceWithAsciiValue {

    public static ArrayList<String> solution(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = solution(p+ch, up.substring(1));
        ArrayList<String> center = solution(p+(ch + 0) , up.substring(1));
        ArrayList<String> right = solution(p, up.substring(1));

        left.addAll(center);
        left.addAll(right);
        return left;
        
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = solution("", str);
        System.out.println(ans);
    }
}
