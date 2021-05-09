package com.paultofunmi.hackerrank;

import java.util.Arrays;
import java.util.Objects;

/**
 * Copyright © 2021, Jumia.
 */
public class InsertionSort {

	public static int[] sort(int[] arr){

		if(arr == null || arr.length == 1) return arr;

		for (int i = 1; i < arr.length; i++){

			for(int j = i; j > 0; j--){

				if(arr[j - 1] > arr[j]){

					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(InsertionSort.sort(new int[]{1})));
		System.out.println(Objects.isNull(InsertionSort.sort(null)));
		System.out.println(Arrays.toString(InsertionSort.sort(new int[]{2,1})));
		System.out.println(Arrays.toString(InsertionSort.sort(new int[]{-1,2,1})));
		System.out.println(Arrays.toString(InsertionSort.sort(new int[]{-1, -9, 4, 0})));
	}
}
