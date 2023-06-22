package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        //2,7,11,15], target = 9
        TwoSums twoSums = new TwoSums();
        int[] result = twoSums.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result);


    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 9 -2 = 7   iteration 1
            // iteration 2 -> 9-7 = 2
            int complement =  target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
