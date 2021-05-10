package com.paultofunmi.leetcode;

/**
 * Copyright © 2021, Jumia.
 */
public class IsIntegerPalindrome {

	public boolean isPalindrome(int x) {

		if(x < 0) return false;

		int original = x;
		int reversed = 0;

		while(x != 0) {

			int pop = x % 10;

			if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop == 7)) return false;
			if(reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop == -8)) return false;

			reversed = reversed * 10 + pop;


			x /= 10;
		}

		if(original == reversed) return true;

		return false;
	}

	public static void main(String[] args) {
		System.out.println(new IsIntegerPalindrome().isPalindrome(121));
		System.out.println(new IsIntegerPalindrome().isPalindrome(-121));
	}
}
