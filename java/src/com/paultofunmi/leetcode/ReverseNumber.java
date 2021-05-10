package com.paultofunmi.leetcode;

/**
 * Copyright © 2021
 */
public class ReverseNumber {

	public static int reverse(int x) {

		int result = 0;

		while(x != 0) {

			int pop = x % 10;

			if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop == 7)) return 0;
			if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop == -8)) return 0;


			result = result * 10 + pop;

			x /= 10;
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println(ReverseNumber.reverse(-321));
		System.out.println(ReverseNumber.reverse(1534236469));
		System.out.println(ReverseNumber.reverse(1463847412));
		System.out.println(ReverseNumber.reverse(-2147483648));
	}
}
