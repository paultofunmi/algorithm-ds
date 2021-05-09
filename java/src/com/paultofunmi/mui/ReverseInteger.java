package com.paultofunmi.mui;

/**
 * Copyright © 2021, Jumia.
 */
public class ReverseInteger {

	public static int reverse(int i){

		int sign = 1;

		if(i < 0) {
			sign = -1;
			i = -i;
		}

		int reverse = 0;

		while( i != 0){

			reverse = (reverse * 10) + (i % 10);
			i = i / 10;
		}

		reverse = reverse * sign;
		return  reverse;
	}

	public static void main(String[] args) {

		System.out.println(ReverseInteger.reverse(0));
		System.out.println(ReverseInteger.reverse(-12345));
		System.out.println(ReverseInteger.reverse(-12005));
		System.out.println(ReverseInteger.reverse(1234));

		System.out.printf("N boy %s %d", "4", 10);
		System.out.printf("N boy %s %d", "4", 10);

	}
}
