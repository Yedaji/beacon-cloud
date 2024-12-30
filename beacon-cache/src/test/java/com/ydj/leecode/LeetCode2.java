package com.ydj.leecode;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeetCode2 {
    @Test
    public void test2() {
        System.out.println(15 / 10); // 1
        System.out.println(7 % 10); // 7
    }


    @Test
    public void test() {
        // 第一个
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(9, listNode3);
        ListNode listNode = new ListNode(9, listNode4);

        // 第二个
        ListNode listNode2_4 = new ListNode(5);
        ListNode listNode2_6 = new ListNode(9, listNode2_4);
        ListNode listNode2_5 = new ListNode(9, listNode2_6);
        ListNode listNode2 = new ListNode(9, listNode2_5);
        // 243 + 564 => 342+465 = 807

        print(addTwoNumbers(listNode3, listNode2_4));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = getLen(l1);
        int len2 = getLen(l2);
        ListNode l = len1 >= len2 ? l1 : l2;
        ListNode s = l == l1 ? l2 : l1;
        ListNode curl = l;
        ListNode curs = s;
        ListNode last = curl;
        int in = 0;
        int curNum = 0;
        while (curs != null) {
            curNum = curs.val + curl.val + in;
            curl.val = curNum % 10;
            in = curNum / 10;
            last = curl;
            curl = curl.next;
            curs = curs.next;
        }
        while (curl != null) {
            curNum = curl.val + in;
            curl.val = curNum % 10;
            in = curNum / 10;
            last = curl;
            curl = curl.next;
        }
        if (in != 0) {
            last.next = new ListNode(1);
        }
        return l;
    }

    public void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public int getLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
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
