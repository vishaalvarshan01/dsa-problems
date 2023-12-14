package Basics;

public class MinimumCostToMoveChipsToSamePosition {
    
    public static int minCostToMoveChips(int[] position) {
        int oddCount = 0;
        int evenCount = 0;
        for(int i = 0; i < position.length; i++){
            if(position[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        // System.out.println("odd count : " + oddCount + " even count : " + evenCount);
        return Math.min(oddCount, evenCount);
    }
    
    public static void main(String args[]){
        int[] arr = { 1,2,3};
        int ans = minCostToMoveChips(arr);
        System.out.println("ans : " + ans);
    }

}
