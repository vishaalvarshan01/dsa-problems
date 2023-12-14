package Basics;
public class LinearSearch {
    public static void main(String args[]){
        int[] arr = {1,2,5,3,6,7,9,0};

        int index = linearSearch(arr,10);

        System.out.println(index);
    }

    public static int linearSearch(int[] arr,int search){
        int index = -1;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == search){
                index = i;
            }
        }
        return index;
    }
}
