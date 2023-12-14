package Basics;

public class ArrayListOperations {
    
    public static void main(String args[]){

        // ArrayList<String> arrayList = new ArrayList<String>();
        DynamicArray dynamicArray = new DynamicArray(4);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0, "X");

        dynamicArray.toString();

        System.out.println(dynamicArray.isEmpty());

        System.out.println(dynamicArray.size); 
        System.out.println(dynamicArray.capacity);
    }
}
