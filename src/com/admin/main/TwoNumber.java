package com.admin.main;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list. Input: (2 -> 4
 * ->3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author admin
 *
 */

public class TwoNumber {

	public static void main(String[] args) {
//		ListNode listNode1 = new ListNode(2);
//		listNode1.next = new ListNode(4);
//		listNode1.next.next = new ListNode(3);
//
//		ListNode listNode2 = new ListNode(5);
//		listNode2.next = new ListNode(6);
//		listNode2.next.next = new ListNode(4);
		
		ListNode listNode1 = new ListNode(5);

		ListNode listNode2 = new ListNode(5);

		System.out.println("start");
		ListNode listNode = addTwoNumbers(listNode1, listNode2);

		while (listNode != null) {
			System.out.println("==" + listNode.val);
			listNode = listNode.next;
		}
		;

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return null;
		}
		ListNode listNode = new ListNode(0);
		ListNode listNodeG = listNode;
		
		int carry = 0;
		while (l1 != null || l2 != null) {
			l1 = l1 == null ? l1 = new ListNode(0) : l1;
			l2 = l2 == null ? l2 = new ListNode(0) : l2;
			int sum = l1.val + l2.val + carry;
			
			listNode.next = new ListNode(sum % 10);
			carry = sum/10;
			
			listNode = listNode.next;

			l1 = l1.next;
			l2 = l2.next;

		}
		//如果进位 大于0，则添加一个进位node
		if(carry > 0){
			listNode.next = new ListNode(carry);
		}
		return listNodeG.next;

	}

	static class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
		}
	}

}
