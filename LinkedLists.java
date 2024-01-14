package Basics;

class LinkedList<T> {

    T value;
    LinkedList<T> head;
    LinkedList<T> tail;

    int size;
    private LinkedList<T> next;

    LinkedList(){
        head.next = null;
    }

    LinkedList(T value){
        this.value = value;
    }

    void addFirst(T value){
        LinkedList<T> node = new LinkedList<T>();
        node.next = head;
        head = node;
    }
}

public class LinkedLists {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        System.out.println(list);
    }
}
