package Basics;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueOperations {
    
    public static void main(String args[]){

        // Queues are FIFO data structure
        
        // queue is an interface , hence we cannot a object of it
        // we can linkedlist or priority queue 
        Queue<String> queue = new LinkedList<String>();

        // use operations - offer , poll , peek

        queue.offer("John Wick");
        queue.offer("Winston");
        
        // display the head 
        // String peakElement = queue.peek();

        queue.poll();
        queue.poll();
        queue.poll();

        // check if queue is empty
        System.out.println(queue.isEmpty());

        // get length of queue
        System.out.println(queue.size());

        // check if queue contains an object
        System.out.println(queue.contains("John Wick"));

        System.out.println(queue);

        // Keyboard buffer (letters should be pressed in order they are pressed)
        // Printer queue (printer the pages in order they are given)
        // used in breadth first search algorithms 
        

        Queue<Double> marks = new PriorityQueue<Double>(Collections.reverseOrder());

        marks.offer(3.0);
        marks.offer(2.0);
        marks.offer(2.9);

        System.out.println("GPA : ");
        while(!marks.isEmpty()){
            System.out.println(marks.poll());
        }
    }
}
