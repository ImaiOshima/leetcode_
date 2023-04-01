package com.example.leetcode_;

import java.util.List;

/**
 * @Classname LeetCode25  K 个一组翻转链表
 * @Description TODO
 * @Author Imai
 * @Date 2023/3/27 16:45
 * @Created by 61635
 */
public class LeetCode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dump = new ListNode(0);
        dump.next = head;

        ListNode pre = dump;
        ListNode end = dump;

        while(end != null){
            for(int i = 0;i<k && end != null;i++){
                end = end.next;
            }
            if(end == null){
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            ListNode curr = reverse(start);
            pre.next = curr;
            start.next = next;
            pre = start;
            end = start;
        }
        return dump.next;
    }

    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }
}
