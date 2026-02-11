package org.example;

public class Calculator {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = 1 + i; j <=  nums.length-1; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;

    }

}
