package com.paultofunmi.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright © 2021, Jumia.
 */
public class AddTwoNumbers {

	static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if(l1 == null || l2 == null) return null;

		ListNode result = null;
		ListNode currentL1 = l1;
		ListNode currentL2 = l2;
		int carryOver = 0;
		ListNode next = null;

		do {

			int sum = getValue(currentL1) + getValue(currentL2);

			 sum = checkIfCarryOverExist(carryOver, sum);

             if(sum > 9) {

                 carryOver = sum / 10;
                 sum = sum % 10;
             }

             if(result == null) {

                 result = new ListNode(sum, null);
                 next = result;
             }else {

				 ListNode newItem = new ListNode(sum, null);
				 next.next = newItem;
				 next = newItem;
             }

			currentL1 = move(currentL1);
			currentL2 = move(currentL2);

		}while(currentL1 != null || currentL2 != null);

		if(carryOver > 0){
			next.next = new ListNode(carryOver, null);
		}

		return result;
	}

	private int checkIfCarryOverExist(int carryOver, int sum){

		if(carryOver >= 0) return carryOver + sum;
		return sum;
	}

	private int getValue(ListNode current) {

		if(current == null) return 0;

		return current.val;
	}

	private ListNode move(ListNode current) {

		if(current == null) return null;

		return current.next;
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

	  ListNode result = new AddTwoNumbers().addTwoNumbers(listNode1, listNode2);

	  while(result != null){

		  System.out.print(result.val + " ");
		  result = result.next;
	  }
  }


}
