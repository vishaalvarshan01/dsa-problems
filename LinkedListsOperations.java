package Basics;
import java.util.LinkedList;

public class LinkedListsOperations {
    
    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // linked list act as stack

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");

        linkedList.pop();

        // linked list acts as queue

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");

        linkedList.poll();

        linkedList.add(0, "Z");
        linkedList.remove("E");

        // peek first and last element

        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekLast());

        // add first and last 
        linkedList.addFirst("X");
        linkedList.addLast("Y");

        // remove first and last
        // String firstELement = linkedList.removeFirst();
        // String lastElement = linkedList.removeLast();

        System.out.println(linkedList);
    
        // advantages 
        // dynamic data structures 
        // insertion and deletion is slow and easy
        // no/low memory waste

        // disadvantages
        // greater memory usage
        // no random access 
        // searching is more time consuming

        // uses 
        // implement stacks/queues
        // GPS nav
        // music playlist
    }
}
