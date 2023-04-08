package com.example.leetcode_;

/**
 * @Classname LeetCode53 最大子数组和
 * @Description TODO
 * @Author Imai
 * @Date 2023/4/8 23:39
 * @Created by 61635
 */
public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        if(nums == null){
            return 0;
        }
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        if(len == 1){
            return nums[0];
        }
        int sum = 0;
        // 贪心算法 只是要是正数 都可以继续往下加
        for(int i = 0;i<len;i++){
           if(sum > 0){
               sum += nums[i];
           }else{
               sum = nums[i];
           }
           max = Math.max(max,sum);
        }
        return max;
    }
}
