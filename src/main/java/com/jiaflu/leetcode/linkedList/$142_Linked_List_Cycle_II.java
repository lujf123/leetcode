package com.jiaflu.leetcode.linkedList;

import com.jiaflu.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目：
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 说明：不允许修改给定的链表。
 *
 * 解答：
 * - Set
 */

public class $142_Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = null;
        while (head != null) {
            if (!set.contains(head)) {
                set.add(head);
                head = head.next;
            } else {
                node = head;
                break;
            }
        }
        return node;
    }
}
