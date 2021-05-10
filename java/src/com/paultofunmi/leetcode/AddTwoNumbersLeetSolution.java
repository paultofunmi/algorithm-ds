package com.paultofunmi.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright © 2021.
 */
public class AddTwoNumbersLeetSolution {

	static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummyHead = new ListNode(0);

		ListNode p = l1, q = l2, curr = dummyHead;

		int carry = 0;

		while (p != null || q != null) {

			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;

		}
		if (carry > 0) {

			curr.next = new ListNode(carry);
		}

		return dummyHead.next;
	}

	public static void main(String[] arg){

		List<Integer> list1 = Arrays.asList(9,9,9,9,9,9,9);
		List<Integer> list2 = Arrays.asList(9,9,9,9);

		ListNode listNode1 = new ListNode(list1.get(0));
		ListNode listNode2 = new ListNode(list2.get(0));
		ListNode next1 = listNode1;
		ListNode next2 = listNode2;

		for(int i = 1; i < list1.size(); i++){

			ListNode newItem = new ListNode(list1.get(i), null);
			next1.next = newItem;
			next1 = newItem;
		}

		for(int j = 1; j < list2.size(); j++){

			ListNode newItem = new ListNode(list2.get(j), null);
			next2.next = newItem;
			next2 = newItem;
		}

		ListNode result = new AddTwoNumbersLeetSolution().addTwoNumbers(listNode1, listNode2);

		while(result != null){

			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}
