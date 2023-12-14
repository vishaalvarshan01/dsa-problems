package Basics;
public class Recursion {
    public static void main(String args[]){
        walk(4);
    }

    public static void walk(int steps){
        if(steps < 1) return;
        System.out.println("you took a step");
        walk(steps - 1);
    }
}
