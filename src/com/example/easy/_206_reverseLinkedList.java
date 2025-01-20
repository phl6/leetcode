package com.example.easy;

//https://leetcode.com/problems/reverse-linked-list/
//https://neetcode.io/problems/reverse-a-linked-list
public class _206_reverseLinkedList {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to convert an array to a linked list
    public static ListNode arrayToLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]); //pointing current node's next to the next element in the list
            current = current.next; //moving forward
        }
        return head; //returning first ListNode of the linked list
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode temp = current.next; //store next ListNode in a temp
            prev = current; //put current node to prev node (including the value)
            current = temp; //move forward by putting original next node to current
        }

        return prev; //return the last node in the list (which has become the first node after reverse)
    }

    public static void main(String[] args) {
//        ListNode case1 = arrayToLinkedList(new int[]{1,2,3,4,5});
//        ListNode case1_result = reverseList(case1);
//        System.out.println("case1_result = " + case1_result.val);
//
//        ListNode case2 = arrayToLinkedList(new int[]{1,2});
//        ListNode case2_result = reverseList(case2);
//        System.out.println("case2_result = " + case2_result.val);

        ListNode case3 = arrayToLinkedList(new int[]{});
        ListNode case3_result = reverseList(case3);
        System.out.println("case3_result = " + case3_result.val); //return NPE, since prev is null, its val will also be null
    }

}
