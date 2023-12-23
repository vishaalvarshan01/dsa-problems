package Basics;

public class NumberOfDiceRollsWithTargetSum {
    
    public static void solution(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            solution(p + i, target - i);
        }
    }
    public static void main(String[] args) {
        int target = 5;
        solution("", target);
    }
}
