package com.example.leetcode_;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LeetCode3
 * @Description TODO
 * @Author Imai
 * @Date 2023/3/27 11:35
 * @Created by 61635
 */
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        //存储当前不重复的位置
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            // 当遇到重复是 进行left的更新
            if(map.containsKey(c)){
                left = Math.max(left,map.get(c)+1);
            }
            max = Math.max(max,i-left+1);
            // 每次循环都要塞到map中 保持最新的index
            map.put(c,i);
        }
        return max;
    }
}
