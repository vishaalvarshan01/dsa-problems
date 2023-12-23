package Basics;

import java.util.ArrayList;

public class PermutationsOfString {

    public static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    public static ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            arrayList.addAll(permutationList(first + ch + second, up.substring(1)));
        }

        return arrayList;
    }

    public static int permutationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            count += permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abc";
        // ArrayList<String> ans = permutationList("", str);
        int ans = permutationCount("", str);
        System.out.println("ans : " + ans);
    }
}
