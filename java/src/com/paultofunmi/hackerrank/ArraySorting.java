package com.paultofunmi.hackerrank;

import java.util.Arrays;

/**
 * Copyright © 2021.
 */
public class ArraySorting {


	public static void main(String[] args) {

		int[] arr = new int[]{-1, -9, 4, 0, 9, 4, 2, 4};

		int[] arrCopy = Arrays.copyOfRange(arr, 0, 10);

		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(arrCopy));

		int count = 0;

//		int[] arrCopy = Arrays.copyOfRange(0, d);

		for(int j = 2, startIdx = 0; j < 5; j++, startIdx++){

			System.out.println("j is " + j);
			System.out.println("sIdx is " + startIdx);
		}

//
//
//
	}
}
