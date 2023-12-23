package Basics;

public class LargestNumber {

    public static int[] findLargestNumber(int[] arr){
        int[] digitArray = new int[arr.length];

        // find each the first digit and compare them

        return digitArray;
    }

    @Override
    public String toString(){
        return "";
    }

    public static String largestNumber(int[] nums) {
        int[] arr = findLargestNumber(nums);
        // for(int i : arr) 
        return arr.toString();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 30, 34, 5, 9 };
        String ans = largestNumber(arr);
        System.out.println("ans : " + ans);
    }
}
