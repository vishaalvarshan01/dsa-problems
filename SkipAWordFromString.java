package Basics;

public class SkipAWordFromString {

    public static String skipAWord(String str, String skip, String ans) {
        if (str.isEmpty())
            return ans;
        if (str.startsWith(skip))
            return skipAWord(str.substring(skip.length()),  skip, ans);
        return skipAWord(str.substring(1),  skip, ans += str.charAt(0));

    }

    public static String solution(String str, String skip) {
        String ans = skipAWord(str, skip, "");
        return ans;
    }

    public static void main(String[] args) {
        String str = "basapplelm";
        String ans = solution(str, "apple");
        System.out.println("ans : " + ans);
    }
}
