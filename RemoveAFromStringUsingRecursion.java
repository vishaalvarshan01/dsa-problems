package Basics;

public class RemoveAFromStringUsingRecursion {

    public static String removeA(String str,int index,String ans){
        if(index == str.length()) return ans;
        if(str.charAt(index) != 'a') ans += str.charAt(index);
        return removeA(str, ++index, ans);
    }
    
    public static String solution(String str){
        String ans = removeA(str, 0,"");
        return ans;
    }

    public static void main(String[] args) {
        String str = "aaabaajsndaakmaaccadaaa";
        String ans = solution(str);
        System.out.println("ans : " + ans);
    }
}
