package Basics;

import java.util.Arrays;

public class AverageSalaryExcludingMinimumAndMaximumSalary {

    public static double average(int[] salary) {
        double ans = 0.0;
        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        System.out.println("sum : " + sum);
        ans = sum / (salary.length - 2);
        return ans;

        
    }

    public static void main(String[] args) {
        int[] salary = { 1000, 2000, 3000 };
        double ans = average(salary);
        System.out.println("ans : " + ans);
    }
}
