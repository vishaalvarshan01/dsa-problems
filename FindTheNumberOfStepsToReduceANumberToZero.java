package Basics;

public class FindTheNumberOfStepsToReduceANumberToZero {
    
    public static int numberOfSteps(int num,int count){
        if(num <= 0) return count;
        if(num % 2 == 0) return numberOfSteps(num/2,++count);
        return numberOfSteps(--num, ++count);
    }

    public static void main(String[] args) {
        int n = 123;
        int ans = numberOfSteps(n,0);
        System.out.println(ans);
    }
}
