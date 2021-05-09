package com.paultofunmi.mui;

/**
 * Copyright © 2021, Jumia.
 */
public class ArrayIntersection {

	public static int[] intersect(int[] first, int[] second){

		int[] result;


		int[] out = sortArray(first);
		return out;
	}

	public static int[] sortArray(int[] input){

		if(input == null || input.length == 0) return new int[]{};


		return input;
	}


	// [1, 8, 3, 2]
	// [1, 8, 3, 2]
//	[1, 3, 8, 2]
//  [1, 3, 2, 8]

// i = 0 j = 1
//  [1, 3, 2, -8]
//  [-8, 3, 2, 1] i = 0; j = 3

//	i = 1 j = i
//	smallets = 3
//	[-8, 2, 3, 1] i = 1; j = 2
//	[-8, 1, 3, 2] i = 1j = 3

//	i = 2; j = 2
//	smallet = 3
//	[ -8, 1, 2, 3] i = 2 j =3

//	i = 3 j = 3
//


	public static void main(String[] args) {
		System.out.println(ArrayIntersection.intersect(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}	));
	}
}
