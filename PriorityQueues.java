package Basics;
/*
 * Priority Queue : 
 * used in certain implementations of Dijkstra's shortest path algorithm
 * anytime you need to dynamically fetch the next best or worst element 
 * used in huffman encoding (which is often used in lossless compression)
 * Breadth First Search (BFS) algorithms such as A* use it to get the next best node
 * used in minimum spanning tree (MST)
 */

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String args[]){
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(3);
        pQueue.add(4);
        pQueue.add(5);

        System.out.println(pQueue);
    }
}
