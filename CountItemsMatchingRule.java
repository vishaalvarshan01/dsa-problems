package Basics;

import java.util.List;

public class CountItemsMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        for(List<String> item : items){
            if(ruleKey.equals("type")){
                if(item.get(0).equals(ruleValue)) count++;
            }
            if(ruleKey.equals("color")){
                if(item.get(1).equals(ruleValue)) count++;
            }
            if(ruleKey.equals("name")){
                if(item.get(2).equals(ruleValue)) count++;
            }
           
        }

        return count;
    }

    public static void main(String[] args) {
        // Create an ArrayList containing ArrayLists of String using List.of
        List<List<String>> nestedArrayList = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));

        // Display the nested ArrayList
        // nestedArrayList.forEach(System.out::println);

        int ans = countMatches(nestedArrayList, "type", "phone");

        System.out.println("ans : " + ans);

    }
}
