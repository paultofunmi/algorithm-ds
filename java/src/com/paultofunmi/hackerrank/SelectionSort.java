package com.paultofunmi.hackerrank;

import java.util.Arrays;
import java.util.Objects;

/**
 * Copyright © 2021.
 */
public class SelectionSort {

	public static int[] sort(int[] arr){

		if(arr == null || arr.length == 1) return arr;

		for(int i = 0; i < arr.length; i++){

			int smallest = i;

			for(int j = i + 1; j < arr.length; j++){

				if(arr[j] < arr[smallest]) smallest = j;
			}


			if(smallest != i){
				int temp = arr[i];
				arr[i] = arr[smallest];
				arr[smallest] = temp;
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(SelectionSort.sort(new int[]{1})));
		System.out.println(Objects.isNull(SelectionSort.sort(null)));
		System.out.println(Arrays.toString(SelectionSort.sort(new int[]{2,1})));
		System.out.println(Arrays.toString(SelectionSort.sort(new int[]{-1,2,1})));
		System.out.println(Arrays.toString(SelectionSort.sort(new int[]{-1, -9, 4, 0})));
	}
}
