package Basics;
import java.util.Stack;

public class StackOperations {
    
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();

        // add elements to stack
        stack.push("Minecraft");
        stack.push("GTA V");
        stack.push("Cyberpunk 2077");
        
        // delete an element from a stack
        stack.pop();

        // look at the last added element
        // String lastElement = stack.peek();

        // search an element from stack and returns index else returns -1
        // starts from the top
        int index = stack.search("GTA V");

        System.out.println(stack);
        System.out.println(index);

        // undo / redo features 
        // file directory
        // browser going front and back
    }
}
