package Basics;
public class DynamicArray {
    
    int size;
    int capacity = 10;
    Object[] array;

    DynamicArray(){
        this.array = new Object[capacity];
    }

    DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index,Object data){
        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data){
        // Object[] newArray = new Object[size-1];
        // for(int i = 0; i < size; i++){
        //     if(!array[i].equals(data)){
        //         newArray[i] = 
        //     }
        // }
    }

    public int search(Object data){
        return -1;
    }

    public void grow(){ 
        size++;
    }

    public void shrink(){

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        for(Object i : array){
            System.out.println(i);
        }
        return null;
    }
}
