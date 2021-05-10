package com.paultofunmi.mui;

/**
 * Copyright © 2021.
 */
public class EvenOddCounter {

	public static int evenOddDifference(final int[] input){

		int oddCounter = 0;
		int evenCounter = 0;

		for(int i : input) {

			if( i % 2 == 0) evenCounter += i;
			else oddCounter += i;
		}
		return oddCounter - evenCounter;
	}

	public static void main(String[] args) {

		int[] input1 = {1};
		int[] input2 = {1, 2};
		int[] input3 = {1, 2, 3};
		int[] input4 = {1, 2, 3, 4};
		int[] input5 = {3, 3, 4, 4};
		int[] input6 = {3, 2, 3, 4};
		int[] input7 = {4, 1, 2, 3};
		int[] input8 = {1, 1};
		int[] input9 = {};

		System.out.println(EvenOddCounter.evenOddDifference(input1));
		System.out.println(EvenOddCounter.evenOddDifference(input2));
		System.out.println(EvenOddCounter.evenOddDifference(input3));
		System.out.println(EvenOddCounter.evenOddDifference(input4));
		System.out.println(EvenOddCounter.evenOddDifference(input5));
		System.out.println(EvenOddCounter.evenOddDifference(input6));
		System.out.println(EvenOddCounter.evenOddDifference(input7));
		System.out.println(EvenOddCounter.evenOddDifference(input8));
		System.out.println(EvenOddCounter.evenOddDifference(input9));
	}
}
