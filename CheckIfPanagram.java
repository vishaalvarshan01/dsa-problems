package Basics;

import java.util.HashSet;
import java.util.Set;
public class CheckIfPanagram {
    public static boolean solution(String sentence){

        Set<Character> charSet = new HashSet<>();

        for(Character i : sentence.toCharArray()){
            charSet.add(i);
        }

        return charSet.size() == 26;
    }

    public static void main(String args[]){
        String sentence = "thequickbrownfoxjelazydog";
        boolean ans = solution(sentence);
        System.out.println(ans);
    }
}
