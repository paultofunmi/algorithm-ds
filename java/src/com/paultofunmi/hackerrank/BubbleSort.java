package com.paultofunmi.hackerrank;

import java.util.Arrays;
import java.util.Objects;

/**
 * Copyright © 2021.
 */
public class BubbleSort {

	public static int[] sort(int[] arr){

		if(arr == null || arr.length == 1) return arr;

		boolean sorted = false;

		for(int i = 0; i < arr.length; i++){

			for(int j =0; j < arr.length - 1 - i; j++){

				if(arr[j] > arr[j + 1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(BubbleSort.sort(new int[]{1})));
		System.out.println(Objects.isNull(BubbleSort.sort(null)));
		System.out.println(Arrays.toString(BubbleSort.sort(new int[]{2,1})));
		System.out.println(Arrays.toString(BubbleSort.sort(new int[]{-1,2,1})));
		System.out.println(Arrays.toString(BubbleSort.sort(new int[]{-1, -9, 4, 0})));
	}
}
