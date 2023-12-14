package Basics;

public class BinarySum {
    public static String solution(String a,String b){
        int num1 = 0 , num2 = 0;

        int x = 0;
        for(int i = a.length() - 1; i>= 0; i--){
            // System.out.print(a.charAt(i) + " ");
            if(a.charAt(i)-'0' == 1){
                num1 += Math.pow(2, x);
            }
            x++;
        }
        x = 0;
        // System.out.println("");
        for(int i = b.length() - 1; i>= 0; i--){
            // System.out.print(b.charAt(i) + " ");
            if(b.charAt(i) - '0' == 1){
                num2 += Math.pow(2,x);
            }
            x++;
        }

        StringBuilder result = new StringBuilder(1000);
        int total = num1 + num2;
        if(total == 0) return "0";
        while(total >= 1){
            if((total) % 2 == 1) result.append("1");
            else result.append("0");
            total /= 2;
        }
        return result.toString();
    }

    public static void main(String args[]){
        String ans = solution("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        System.out.println(ans);
    }
}
