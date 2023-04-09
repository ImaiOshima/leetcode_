package com.example.leetcode_;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LeetCode1 两数之和
 * @Description TODO
 * @Author Imai
 * @Date 2023/4/9 21:48
 * @Created by 61635
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i<nums.length;i++){
            int d = target - nums[i];
            if(map.containsKey(d)){
                return new int[]{i,map.get(d)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
