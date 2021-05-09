package com.paultofunmi.mui;

/**
 * Copyright © 2021, Jumia.
 */
public class CenterArray {


	public static int isCentered(final int[] input){

//		if(input.length == 0) return 0;
//
//		if(input.length == 1) return 1;

		if( (input.length % 2) == 0 || input == null) return 0;

		int middleIndex = input.length / 2;

		for(int counter = 0; counter < input.length; counter++){

			if( middleIndex != counter  && input[counter] <= input[middleIndex])
				return 0;
		}

		return 1;
	}

	public static void main(String[] args){

//		int[] input1 = {1, 2, 3, 4, 5};
//		int[] input2 = {3, 2, 1, 4, 5};
//		int[] input3 = {3, 2, 1, 4, 1};
//		int[] input4 = {1, 2, 3, 4};
		int[] input5 = {};
//		int[] input6 = {10};

//		System.out.println(CenterArray.isCentered(input1));
//		System.out.println(CenterArray.isCentered(input2));
//		System.out.println(CenterArray.isCentered(input3));
//		System.out.println(CenterArray.isCentered(input4));
		System.out.println(CenterArray.isCentered(input5));
//		System.out.println(CenterArray.isCentered(input6));
 	}
}
