package com.ydj.api.leetcode;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
public class Leetcode25 {

    @Test
    public void test() {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        print(listNode1);
//        print(reverseSingle(listNode1));
        print(reverseKGroup(listNode1,2));
        //    System.out.println("getKListNode(listNode1,3)l = " + getKListNode(listNode1, 3).val);
    }

    public ListNode reverseSingle(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = head;
        ListNode end = getKListNode(head, k);
        if (end == null) {
            return start;
        }
        head = end; // 返回新head
        reversePart(start, end);
        ListNode lastend = start;
        while (lastend.next != null) {
            start = lastend.next;
            end = getKListNode(start, k);
            if (end == null) {
                return head;
            }
            reversePart(start, end);
            lastend.next = end;
            lastend = start;
        }
        return head;
    }

    public void reversePart(ListNode start, ListNode end) {
        end = end.next;
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = start;
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next = end;
    }

    public ListNode getKListNode(ListNode start, int k) {
        //  只要k-1个数
        while (--k!=0 && start != null) {
            start = start.next;
        }
        System.out.println("end ==> " + (Objects.isNull(start)?"null":start.val));
        return start;
    }

    public void print(ListNode head) {
        while (true) {
            System.out.print(head.val + "->");
            if (head.next == null) {
                System.out.print("null");
                break;
            }
            head = head.next;
        }
        System.out.println();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
