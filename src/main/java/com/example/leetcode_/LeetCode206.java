package com.example.leetcode_;

/**
 * @Classname LeetCode206
 * @Description TODO
 * @Author Imai
 * @Date 2023/3/27 15:44
 * @Created by 61635
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        // 递归每次都要到导数第二停止 进行反转
         if(head == null || head.next == null){
             return head;
         }
         // 最后一次递归 返回最后一个节点
         ListNode curr = reverseList(head.next);
         // 节点反转
         head.next.next = head;
         head.next = null;
         // 每次都是返回最后一个节点
         return curr;
    }
    // 迭代
    public ListNode reverseList2(ListNode head) {
        // 从左到头 直接反转 设置两个指针
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
