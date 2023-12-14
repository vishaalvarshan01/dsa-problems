package Basics;
import java.util.Stack;

public class MatchingBrackets {
    public static void main(String args[]){
        char[] arr = {'{','[',')','}'};

        boolean valid = matchingBrackets(arr);

        System.out.println(valid);
    }

    public static boolean matchingBrackets(char[] arr){
        // boolean valid = false;
        Stack<Character> stack = new Stack<Character>();
        for(char x : arr){
            if(x == '{' || x == '[' || x == '('){
                stack.push(x);
            }
            if(x == '}' && stack.peek() == '{'){
                stack.pop();
            }
            if(x == ']' && stack.peek() == '['){
                stack.pop();
            }
            if(x == ')' && stack.peek() == '('){
                stack.pop();
            }
        }
        System.out.println(stack);
        return stack.isEmpty() ? true : false;
    }
}
