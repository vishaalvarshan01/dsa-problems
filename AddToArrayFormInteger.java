package Basics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormInteger {
    
    public static List<Integer> addToArrayForm(int[] num, int k) {
        String numStr = "";
        for(int i : num){
            numStr += i;
        }

        BigInteger intNum = new BigInteger(numStr);
        BigInteger valueAdded = BigInteger.valueOf(k);

        
        intNum = intNum.add(valueAdded);
        
        numStr = String.valueOf(intNum);
        
        System.out.println("str num : " + intNum);

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < numStr.length(); i++){
            ans.add(numStr.charAt(i) - '0');
        }

        return ans;
    }

    public static void main(String args[]){
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> ans = addToArrayForm(num, k);
        System.out.println("ans : " + ans);
    }

}
