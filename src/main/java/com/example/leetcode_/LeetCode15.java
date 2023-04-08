package com.example.leetcode_;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Classname LeetCode15 三数之和
 * @Description TODO
 * @Author Imai
 * @Date 2023/4/8 21:58
 * @Created by 61635
 */
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 3){
            return res;
        }
        // 排序
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0;i<len;i++){
            // i不断变大 当nums[i]大于0 就代表下面的全部大于0 直接退出for循环 返回res
            if(nums[i] > 0 || nums[len-1] < 0){
               break;
            }
            // 去重 为什么这个能成立 对于一个固定数组的数值来说 能加起来为0的数值 是确定了的
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1;
            int r = len-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    List<Integer> ans = Arrays.asList(nums[i],nums[l],nums[r]);
                    res.add(ans);
                    while(l<r && nums[l] == nums[l+1]){
                        l++;
                    }
                    while(l<r && nums[r] == nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }
}
