package com.paultofunmi.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright © 2021, Jumia.
 */
public class ReverseLinkedList {

	static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static ListNode reverseList(ListNode head) {

		ListNode reversedNode = reverse(head);

		return reversedNode;
	}

	private static ListNode reverse(ListNode node){

		if(node == null) return null;

		if(node.next == null) return node;

		ListNode newHeadNode = reverse(node.next);

		// change references for middle chain
		node.next.next = node;
		node.next = null;

		// send back new head node in every recursion
		return newHeadNode;
	}


	public static void main(String[] args){

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		ListNode listNode1 = new ListNode(list1.get(0));
		ListNode next1 = listNode1;

		for(int i = 1; i < list1.size(); i++){

			ListNode newItem = new ListNode(list1.get(i), null);
			next1.next = newItem;
			next1 = newItem;
		}

		ListNode result = ReverseLinkedList.reverseList(listNode1);

		while(result != null){

			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	
}
